package logica;

import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author Javiera Méndez
 */
public class ControladorPedido {
    private Almacen almacen;
    
    public boolean cancelarPedido(Pedido p){ 
        Date fechaActual = new Date();
        TimeUnit timeUnit = TimeUnit.HOURS;
        long diffInMillies = fechaActual.getTime() - p.getFechaSolicitud().getTime();
        int diferencia = (int) timeUnit.convert(diffInMillies,TimeUnit.MILLISECONDS);
        p.setEstado("Cancelado");
        return diferencia<=24;
    }
    
    public boolean elaborarPedido(Pedido p){
        if(verificarAbono(p) && verificarDisponibilidadMateriasPrimas(p)){
            p.setEstado("En Proceso");
            for(Producto prod: p.getProductos()){
                descontarMateriasPrimas(prod.getMateriasPrimas());
            }
            return true;
        }
        else{
            return false;
        }
        
    }
        
    public boolean verificarAbono(Pedido p){
        return p.getPrecioAbonado()>=(p.getPrecioTotal()/2);
    }
    
    /* Un pedido va a tener un listado de productos, esos productos un listado 
    de materias primas*/
    public boolean verificarDisponibilidadMateriasPrimas(Pedido p){
        /*
        for(Producto producto: p.getProductos()){
            for(MateriaPrima materia: producto.getMateriasPrimas().keySet()){
                MateriaPrima mAux = null;
                for(MateriaPrima mDatos: almacen.getMateriasPrimas()){
                    if(mDatos.getNombre().equals(materia.getNombre())){
                        mAux = mDatos;
                        break;
                    }
                }
                if(mAux.getCantidad()<producto.getMateriasPrimas().get(materia)){
                    return false;
                }
            }
        }*/
        return true;
    }
    
    /* Si están disponibles las materias primas, se debe llamar a este método 
    pasándole un ArrayList de materias primas
    - Obtener el ArrayList del stock de materias primas.
    - Una materia prima podría tener un nombre, código y cantidad.
    */
    public void descontarMateriasPrimas(HashMap<MateriaPrima,Integer> 
            materiasPrimas){
        for(MateriaPrima a: materiasPrimas.keySet()){
            for (MateriaPrima b: almacen.getMateriasPrimas()) {
                if(a.getNombre().equals(b.getNombre())){
                    b.modificarCantidad(b.getCantidad()-materiasPrimas.get(a));
                }
            }
        }
    }
}
