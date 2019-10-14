/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.HashMap;

/**
 *
 * @author Isavo, Javiera Méndez
 */
public class Producto
{
    private String nombre;
    private int precioVenta;
    private Double tiempoElaboracion; //En horas
    private HashMap<MateriaPrima, Double> materiasPrimas;
    
    public Producto(String nombre, int precioVenta, Double tiempoRequerido, 
            HashMap<MateriaPrima,Double> materiasPrimas)
    {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.tiempoElaboracion = tiempoRequerido;
        this.materiasPrimas = new HashMap();
        this.materiasPrimas = materiasPrimas;
    }
    
    public Producto(){
        
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public int getPrecioVenta()
    {
        return precioVenta;
    }

    public void setPrecioVenta(int precioVenta) 
    {
        this.precioVenta = precioVenta;
    }

    public Double getTiempoElaboracion()
    {
        return tiempoElaboracion;
    }

    public void setTiempoElaboracion(Double tiempoElaboracion) 
    {
        this.tiempoElaboracion = tiempoElaboracion;
    }

    public HashMap<MateriaPrima, Double> getMateriasPrimas() {
        return materiasPrimas;
    }

    public void setMateriasPrimas(HashMap<MateriaPrima, Double> materiasPrimas) {
        this.materiasPrimas = materiasPrimas;
    }
    
    public String getMateriasString()
    {
        String materias = "";
        
        for(MateriaPrima m: this.materiasPrimas.keySet()){
            materias += m.getNombre() + "\n";
        }
        return materias;
    }
    
}
