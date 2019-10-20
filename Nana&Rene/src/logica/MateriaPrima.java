/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 * Clase que almacena la informacion de una materia prima
 * @author Javiera Méndez
 */
public class MateriaPrima 
{   
    //Atributos
    private String nombre;
    private double cantidad;
    private String tipo = "continua";
    private boolean disponible;
    /**
     * Constructor
     * @param nombre
     * @param cantidad
     * @param disponible 
     */
    public MateriaPrima(String nombre, double cantidad, boolean disponible)
    {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.disponible = disponible;
    }
    /**
     * Constructor sin parametros
     */
    public MateriaPrima() {
        
    }
    //Getters y setters
    public String getNombre()
    {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public String getTipo()
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }
    
    
}
