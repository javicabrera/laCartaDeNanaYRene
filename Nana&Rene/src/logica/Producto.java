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
    private int tiempoRequerido; //En horas
    private ArrayList<materiaPrima> materiasPrimas;
    
    public Producto(String nombre, int precioVenta, int tiempoRequerido)
    {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.tiempoRequerido = tiempoRequerido;
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

    public int getTiempoRequerido() {
        return tiempoRequerido;
    }

    public void setTiempoRequerido(int tiempoRequerido) 
    {
        this.tiempoRequerido = tiempoRequerido;
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
