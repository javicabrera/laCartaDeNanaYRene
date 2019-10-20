/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *  Clase que almacena los datos de un cliente
 * @author Javiera Méndez
 */
public class Cliente 
{
    private String nombreCliente;
    private String correoCliente;
    private String numeroCliente;
    private ArrayList<Pedido> historialPedidos;
    /**
     * Constructor sin historial de pedidos
     * @param nombreCliente
     * @param correoCliente
     * @param numeroCliente 
     */
    public Cliente(String nombreCliente, String correoCliente, String numeroCliente)
    {
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
        this.numeroCliente = numeroCliente;
        this.historialPedidos = new ArrayList<>();
    }
    /**
     * Constructor con historial de pedidos
     * @param nombreCliente
     * @param correoCliente
     * @param numeroCliente
     * @param historialPedidos 
     */
    public Cliente(String nombreCliente, String correoCliente, String numeroCliente, 
            ArrayList<Pedido> historialPedidos)
    {
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
        this.numeroCliente = numeroCliente;
        this.historialPedidos = historialPedidos;
    }
    /**
     * Constructor vacío
     */
    public Cliente(){        
    }
    //Getters y setters
    public String getNombreCliente() 
    {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) 
    {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoCliente() 
    {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) 
    {
        this.correoCliente = correoCliente;
    }

    public String getNumeroCliente()
    {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) 
    {
        this.numeroCliente = numeroCliente;
    }

    public ArrayList<Pedido> getHistorialPedidos() {
        return historialPedidos;
    }

    public void setHistorialPedidos(ArrayList<Pedido> historialPedidos) {
        this.historialPedidos = historialPedidos;
    }



}
