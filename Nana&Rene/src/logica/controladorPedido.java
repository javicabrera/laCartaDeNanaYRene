/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Javiera Méndez
 */
public class controladorPedido
{
    public boolean cancelarPedido(Pedido p)
    { 
        Date fechaActual = new Date();
        if(fechaActual.after(p.getFechaSolicitud()))
        {
            p.setEstado("Cancelado");
            return true;
        }
        return false;
    }
    
    public void cambiarEstadoProceso(Pedido p)
    {
        p.setEstado("En Proceso");
    }
        
    public boolean verificarAbono(Pedido p)
    {
        if(p.getPrecioAbonado()>=(p.getPrecioTotal()/2))
        {
            return true;
        }
        return false;
    }
    
    /* Un pedido va a tener un listado de productos, esos productos un listado de materias primas*/
    public void verificarDisponibilidadMateriasPrimas(Pedido p)
    {
        
    }
    
    /* Si están disponibles las materias primas, se debe llamar a este método pasándole un ArrayList de materias primas
    - Obtener el ArrayList del stock de materias primas.
    - Una materia prima podría tener un nombre, código y cantidad.
    */
    public void descontarMateriasPrimas(ArrayList<materiaPrima> materiasPrimas)
    {
        
    }
}
