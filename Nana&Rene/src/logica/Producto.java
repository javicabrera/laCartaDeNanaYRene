/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author Isavo, Javiera Méndez
 */
public class Producto
{
    private String nombre;
    private int precioVenta;
    private int tiempoElaboracion; //En horas
    private ArrayList<materiaPrima> materiasPrimas;
    
    public Producto(String nombre, int precioVenta, int tiempoRequerido)
    {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.tiempoElaboracion = tiempoRequerido;
        this.materiasPrimas = new ArrayList<materiaPrima>();
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) 
    {
        this.precioVenta = precioVenta;
    }

    public int getTiempoElaboracion() {
        return tiempoElaboracion;
    }

    public void setTiempoElaboracion(int tiempoElaboracion) 
    {
        this.tiempoElaboracion = tiempoElaboracion;
    }

    public ArrayList<materiaPrima> getMateriasPrimas()
    {
        return materiasPrimas;
    }

    public void addMateriaPrima(materiaPrima m)
    {
        this.materiasPrimas.add(m);
    }
}
