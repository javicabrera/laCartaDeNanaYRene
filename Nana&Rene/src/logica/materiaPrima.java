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
public class materiaPrima 
{
    private int codigo;
    private String nombre;
    private double cantidad;
    
    public materiaPrima(int codigo, String nombre, double cantidad)
    {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
    }

    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo)
    {
        this.codigo = codigo;
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

    public void setCantidad(double cantidad) 
    {
        this.cantidad = cantidad;
    }
}
