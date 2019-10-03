/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;

/**
 *
 * @author MarceloPablo
 */
public class Almacén {
    private ArrayList<Pedido> pedidos;
    private ArrayList<Producto> productos;
    private ArrayList<materiaPrima> materiasPrimas;
    private ArrayList<Cliente> clientes;
    //private ArrayList<Pedido> reportes;
    
    public Almacén(ArrayList<Pedido> pedidos, ArrayList<Producto> productos, ArrayList<materiaPrima> materiasPrimas, ArrayList<Cliente> clientes) {
        this.pedidos = pedidos;
        this.productos = productos;
        this.materiasPrimas = materiasPrimas;
        this.clientes = clientes;
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

    public ArrayList<materiaPrima> getMateriasPrimas() {
        return materiasPrimas;
    }

    public void setMateriasPrimas(ArrayList<materiaPrima> materiasPrimas) {
        this.materiasPrimas = materiasPrimas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
}
