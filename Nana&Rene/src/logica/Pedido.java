package logica;

import java.util.HashMap;
import java.util.Date;

/**
 * Clase que almacena la información de un pedido
 * @author Isavo Castro
 */
public class Pedido {
    //Atributos
    private int id;
    private HashMap<Producto, Integer> productos;
    private Date fechaSolicitud;
    private Date fechaRetiro;
    private String estado;
    private int precioTotal;
    private int precioAbonado;
    private int descuento;
    private String nombreCliente;
    private String correoCliente;
    private String numeroCliente;
    
    /**
     * Constructor de clase
     * @param id
     * @param productos
     * @param fechaSolicitud
     * @param fechaRetiro
     * @param precioTotal
     * @param descuento
     * @param nombreCliente
     * @param correoCliente
     * @param numeroCliente
     * @param precioAbonado
     * @param estado 
     */
    public Pedido(int id, HashMap<Producto, Integer> productos, Date fechaSolicitud, 
            Date fechaRetiro, int precioTotal, int descuento, String nombreCliente, 
            String correoCliente, String numeroCliente, int precioAbonado, String estado) {
        this.id = id;
        this.productos = productos;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaRetiro = fechaRetiro;
        this.estado = estado;
        this.precioTotal = precioTotal;
        this.precioAbonado = precioAbonado;
        this.descuento = descuento;
        this.nombreCliente = nombreCliente;
        this.correoCliente = correoCliente;
        this.numeroCliente = numeroCliente;
    }
    /**
     * Constructor vacio y sin parametros
     */
    public Pedido(){
        
    }
    /**
     * Retorna los dias restantes para el retiro de un pedido
     * @return 
     */
    public int diasRestantesRetiro(){
        if(this.fechaSolicitud.getYear()==this.fechaRetiro.getYear()){
            if(this.fechaSolicitud.getMonth()==this.fechaRetiro.getMonth()){
                int dias=this.fechaRetiro.getDate()-this.fechaSolicitud.getDate();
                if(dias<=2){
                    return 3;
                }
                if(dias>2 && dias<=7){
                    return 2;
                }
                else{
                    return 1;
                }
            }
        }
        return 1;
    }

    //Getters y setters
    public HashMap<Producto, Integer> getProductos() {
        return productos;
    }

    public void setProductos(HashMap<Producto, Integer> productos) {
        this.productos = productos;
    }

    public Date getFechaSolicitud(){
        return fechaSolicitud;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechaSolicitud(Date fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public Date getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(Date fechaRetiro){
        this.fechaRetiro = fechaRetiro;
    }

    public String getEstado(){
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(int precioTotal){
        this.precioTotal = precioTotal;
    }

    public int getPrecioAbonado() {
        return precioAbonado;
    }

    public void setPrecioAbonado(int precioAbonado){
        this.precioAbonado = precioAbonado;
    }

    public int getDescuento(){
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    public String getNombreCliente(){
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente){
        this.nombreCliente = nombreCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente){
        this.correoCliente = correoCliente;
    }

    public String getNumeroCliente(){
        return numeroCliente;
    }

    public void setNumeroCliente(String numeroCliente){
        this.numeroCliente = numeroCliente;
    }
    
}
