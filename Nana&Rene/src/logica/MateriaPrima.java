/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Javiera Méndez
 */
public class MateriaPrima 
{
    private String nombre;
    private double cantidad;
    
    public MateriaPrima(String nombre, double cantidad)
    {
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public String getNombre()
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public double getCantidad() 
    {
        return cantidad;
    }

    public void modificarCantidad(double cantidad) 
    {
        this.cantidad = cantidad;
    }
}
