/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *  Clase en la que se carga la información de la base de datos
 * @author MarceloPablo
 */
public class Almacen {
    //Atributos 
    private int mayorId;
    private ArrayList<Pedido> pedidos;
    private ArrayList<Producto> productos;
    private ArrayList<MateriaPrima> materiasPrimas;
    private ArrayList<Cliente> clientes;
    //private ArrayList<Pedido> reportes;
    /**
     * Constructor
     * @param mayorId
     * @param pedidos
     * @param productos
     * @param materiasPrimas
     * @param clientes 
     */
    public Almacen(int mayorId, ArrayList<Pedido> pedidos, ArrayList<Producto> productos, 
            ArrayList<MateriaPrima> materiasPrimas, ArrayList<Cliente> clientes) {
        this.mayorId = mayorId;
        this.pedidos = pedidos;
        this.productos = productos;
        this.materiasPrimas = materiasPrimas;
        this.clientes = clientes;
    }
    /**
     * Constructor sin parametros
     */
    public Almacen() {
        
    }
    //Getters y setters
    public int getMayorId() {
        return mayorId;
    }

    public void setMayorId(int mayorId) {
        this.mayorId = mayorId;
    }

    public ArrayList<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(ArrayList<Pedido> pedidos) {
        this.pedidos = pedidos;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    public ArrayList<MateriaPrima> getMateriasPrimas() {
        return materiasPrimas;
    }

    public void setMateriasPrimas(ArrayList<MateriaPrima> materiasPrimas) {
        this.materiasPrimas = materiasPrimas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}
