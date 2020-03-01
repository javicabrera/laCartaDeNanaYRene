package logica;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 * Clase que controla los estados de un pedido y la transicion entre estos
 * @author Javiera Méndez, Isavo Castro
 *  Clase controlador para la gestion de los pedidos
 * @author Javiera Méndez
 */
public class ControladorPedido {
    //Atributos
    private Almacen almacen;

    /**
     * Constructor de la clase
     * @param almacen almacen con los datos
     */
    /**
     * Constructor
     * @param almacen 
     */
    public ControladorPedido(Almacen almacen) {
        this.almacen = almacen;
    }
    
    /**
     * Permite cambiar el estado de un pedido como cancelado
     * @param p pedido que se va a cancelar
     * @return true o false, dependiendo si se devuelve o no el abono
     */
    /**
     * Cancela pedido y cambia el estado del pedido
     * @param p
     * @return 
     */
    public boolean cancelarPedido(Pedido p){ 
        Date fechaActual = new Date();
        TimeUnit unidadDeTiempo = TimeUnit.HOURS;
        long diferenciaMilisegundos = fechaActual.getTime() - p.getFechaSolicitud().getTime();
        int diferencia = (int) unidadDeTiempo.convert(diferenciaMilisegundos,TimeUnit.MILLISECONDS);
        p.setEstado("Cancelado");
        return diferencia<=24;
    }
    
    /**
     * Permite verificar si se puede elaborar un pedido dependiendo de la materia
     * prima y el abono del pedido
     * @param p Pedido que se va a elaborar
     * @return 0 si el pedido fue elaborado correctamente, 1 si no hay abono del 50%,
     * 2 si no hay suficiente materias primas y 3 si no hay ambos
     */
    /**
     * Verifica si se puede elaborar un pedido y descuenta las materias primas
     * @param p
     * @return 
     */
    public int elaborarPedido(Pedido p){
        if(!verificarAbono(p) && verificarDisponibilidadMateriasPrimas(p)){
            return 1;
        }
        if (!verificarDisponibilidadMateriasPrimas(p) && verificarAbono(p)){
            return 2;
        }
        if (!verificarAbono(p) && !verificarDisponibilidadMateriasPrimas(p)){
            return 3;
        }
        if(verificarAbono(p) && verificarDisponibilidadMateriasPrimas(p)){
            p.setEstado("En Proceso");
            for(Producto prod: p.getProductos().keySet()){
                for (int i = 0; i < p.getProductos().get(prod); i++) {
                    descontarMateriasPrimas(prod.getMateriasPrimas());
                }
                
            }
            return 0;
        }
        return -1;
    }
    
    /**
     * Permite finalizar la elaboracion de un pedido, enviando un correo de notificacion
     * al cliente
     * @param pedido pedido que se finalizara 
     */
    public void finalizarPedido(Pedido pedido){
        pedido.setEstado("Finalizado");
        String correo = pedido.getCorreoCliente();
        String valorAPagar = String.valueOf(pedido.getPrecioTotal()-pedido.getPrecioAbonado());
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        String fechaRetiro = simpleDateFormat.format(pedido.getFechaRetiro());
        EnviaCorreo.enviar(correo , valorAPagar, fechaRetiro);
    }
    
    /**
     * Permite marcar un pedido como retirado, si es que se ha pagado el precio total
     * @param p el pedido que se retirara
     * @return true si se ha abonado, false si no
     */
    public boolean retirarPedido(Pedido p){
        if(p.getPrecioAbonado()==p.getPrecioTotal()){
            p.setEstado("Retirado");
            Date actual = new Date();
            p.setFechaRetiro(actual);
            return true;
        }
        else{
            return false;
        }
    }
        
    /**
     * Verifica si el abono de un pedido corresponde al 50% o mas del total
     * @param p pedido que se verificara
     * @return true o false, dependiendo del abono
     */
    /**
     * Verifica si se abonó la mitad del total
     * @param p
     * @return 
     */   
    public boolean verificarAbono(Pedido p){
        return p.getPrecioAbonado()>=(p.getPrecioTotal()/2);
    }
    
    /**
     * Verifica que existe suficiente materia prima para elaborar cada producto de
     * un pedido
     * @param p pedido a verificar
     * @return true si hay suficiente, false si no
     */
    public boolean verificarDisponibilidadMateriasPrimas(Pedido p){
        for(MateriaPrima materia: almacen.getMateriasPrimas()){
            if (materia.isDisponible()){
                int contador = 0;
                for (Producto producto: p.getProductos().keySet()){
                    for (MateriaPrima m: producto.getMateriasPrimas().keySet()){
                        if(materia.getNombre().equals(m.getNombre())){
                            contador += producto.getMateriasPrimas().get(m)*p.getProductos().get(producto);
                        }
                    }
                    
                }
                if (contador>materia.getCantidad()){
                    return false;
                }
            }
        }
        return true;
    }
    
    /**
     * Descuenta las materias primas del almacen una vez que se elabora un pedido
     * @param materiasPrimas materias primas que deben ser descontadas
     */
    public void descontarMateriasPrimas(HashMap<MateriaPrima,Double> materiasPrimas){
        for(MateriaPrima a: materiasPrimas.keySet()){
            for (MateriaPrima b: almacen.getMateriasPrimas()) {
                if(a.isDisponible() && a.getNombre().equals(b.getNombre())){
                    b.setCantidad(b.getCantidad()-materiasPrimas.get(a));
                }
            }
        }
    }
}
