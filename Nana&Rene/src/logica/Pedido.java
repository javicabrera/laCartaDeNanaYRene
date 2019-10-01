package logica;

import java.util.Date;
import java.util.HashMap;

/**
 *
 * @author Isavo Castro
 */
public class Pedido {
    private HashMap<Producto, Integer> productos;
    private Date fechaSolicitud;
    private Date fechaRetiro;
    private String estado;
    private int precioTotal;
    private int precioAbonado;
    private int descuento;
    private Cliente cliente;
    private int nombreCliente;
    private String correoCliente;
    private String numeroCliente;

    public Pedido(HashMap<Producto, Integer> productos, Date fechaSolicitud, 
            Date fechaRetiro, int precioTotal, int descuento, int nombreCliente, 
            String correoCliente, String numeroCliente) {
        this.productos = productos;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaRetiro = fechaRetiro;
        this.estado = "Pendiente";
        this.precioTotal = precioTotal;
        this.precioAbonado = 0;
        this.descuento = descuento;
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
        this.numeroCliente = numeroCliente;
    }

    public Pedido(HashMap<Producto, Integer> productos, Date fechaSolicitud, 
            Date fechaRetiro, int precioTotal, int descuento, Cliente cliente) {
        this.productos = productos;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaRetiro = fechaRetiro;
        this.precioTotal = precioTotal;
        this.precioAbonado = 0;
        this.descuento = descuento;
        this.cliente = cliente;
        this.estado = "Pendiente";
    }
    
    public boolean abono50(){
        return (precioAbonado>=(precioTotal/2));
    }

    public HashMap<Producto, Integer> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<Producto, Integer> productos) {
        this.productos = productos;
    }

    public Date getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getPrecioAbonado() {
        return precioAbonado;
    }

    public void setPrecioAbonado(int precioAbonado) {
        this.precioAbonado = precioAbonado;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(int nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }

    public String getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente) {
        this.numeroCliente = numeroCliente;
    }
    
    
    
    
    
}
