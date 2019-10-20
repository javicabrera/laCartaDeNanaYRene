package logica;

import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 *  Clase controlador para la gestion de los pedidos
 * @author Javiera Méndez
 */
public class ControladorPedido {
    //Atributos
    private Almacen almacen;
    /**
     * Constructor
     * @param almacen 
     */
    public ControladorPedido(Almacen almacen) {
        this.almacen = almacen;
    }
    /**
     * Cancela pedido y cambia el estado del pedido
     * @param p
     * @return 
     */
    public boolean cancelarPedido(Pedido p){ 
        Date fechaActual = new Date();
        TimeUnit timeUnit = TimeUnit.HOURS;
        long diffInMillies = fechaActual.getTime() - p.getFechaSolicitud().getTime();
        int diferencia = (int) timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
        p.setEstado("Cancelado");
        return diferencia<=24;
    }
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
                if(prod.isDisponible()){
                    for (int i = 0; i < p.getProductos().get(prod); i++) {
                        descontarMateriasPrimas(prod.getMateriasPrimas());
                    }
                }
            }
            return 0;
        }
        return -1;
    }
    /**
     * Verifica si se abonó la mitad del total
     * @param p
     * @return 
     */   
    public boolean verificarAbono(Pedido p){
        return p.getPrecioAbonado()>=(p.getPrecioTotal()/2);
    }
    
    /* Un pedido va a tener un listado de productos, esos productos un listado 
    de materias primas*/
    public boolean verificarDisponibilidadMateriasPrimas(Pedido p){
        for(MateriaPrima materia: almacen.getMateriasPrimas()){
            if (materia.isDisponible()){
                int contador = 0;
                for (Producto producto: p.getProductos().keySet()){
                    if (producto.isDisponible()){
                        for (MateriaPrima m: producto.getMateriasPrimas().keySet()){
                            if(materia.getNombre().equals(m.getNombre())){
                                contador += producto.getMateriasPrimas().get(m)*p.getProductos().get(producto);
                            }
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
    
    /* Si están disponibles las materias primas, se debe llamar a este método 
    pasándole un ArrayList de materias primas
    - Obtener el ArrayList del stock de materias primas.
    - Una materia prima podría tener un nombre, código y cantidad.
    */
    public void descontarMateriasPrimas(HashMap<MateriaPrima,Double> 
            materiasPrimas){
        for(MateriaPrima a: materiasPrimas.keySet()){
            for (MateriaPrima b: almacen.getMateriasPrimas()) {
                if(a.isDisponible() && a.getNombre().equals(b.getNombre())){
                    b.setCantidad(b.getCantidad()-materiasPrimas.get(a));
                }
            }
        }
    }
}
