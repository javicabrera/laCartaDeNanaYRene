/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.HashMap;

/**
 *  Clase que almacena la información de un producto
 * @author Isavo, Javiera Méndez
 */
public class Producto
{
    //Atributos
    private String nombre;
    private int precioVenta;
    private Double tiempoElaboracion; //En horas
    private HashMap<MateriaPrima, Double> materiasPrimas;
    private boolean disponible;
    /**
     * Constructor de clase
     * @param nombre
     * @param precioVenta
     * @param tiempoRequerido
     * @param materiasPrimas
     * @param disponible 
     */
    public Producto(String nombre, int precioVenta, Double tiempoRequerido, 
            HashMap<MateriaPrima,Double> materiasPrimas, boolean disponible)
    {
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.tiempoElaboracion = tiempoRequerido;
        this.materiasPrimas = new HashMap();
        this.materiasPrimas = materiasPrimas;
        this.disponible = disponible;
    }
    /**
     * Constructor vacio y sin parametros
     */
    public Producto(){
        
    }
    //Getters y setters
    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
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
