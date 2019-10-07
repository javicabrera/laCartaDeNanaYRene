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
public class Cliente 
{
    private String nombreCliente;
    private String correoCliente;
    private String numeroCliente;
    private String historialPedidos; //lo dejé como string solo para leerloo, debería ser un hashmap
    
    public Cliente(String nombreCliente, String correoCliente, String numeroCliente, String historialPedidos)
    {
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
        this.nombreCliente = numeroCliente;
        this.historialPedidos = historialPedidos;
    }

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

    public String getHistorialPedidos() 
    {
        return historialPedidos;
    }

    public void setHistorialPedidos(String historialPedidos)
    {
        this.historialPedidos = historialPedidos;
    }
}
