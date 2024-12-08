package Modelo;

import Modelo.Pago;
import Modelo.Cliente;
import java.util.Date;

public class Pedido {
    
    private byte numeroPedido, cantidadProductos;
    private Producto productos; //****volverlo una lista
    private double precio, precioFinal;
    private String estado, personalizacion;
    private Pago medioPago;
    private Cliente cliente;
    private Date fecha;

    public Pedido(byte numeroPedido, Producto productos, byte cantidadProductos, double precio, double precioFinal, String estado, String personalizacion, Pago medioPago, Cliente cliente, Date fecha) {
        this.numeroPedido = numeroPedido;
        this.productos = productos;
        this.cantidadProductos = cantidadProductos;
        this.precio = precio;
        this.precioFinal = precioFinal;
        this.estado = estado;
        this.personalizacion = personalizacion;
        this.medioPago = medioPago;
        this.cliente = cliente;
        this.fecha = fecha;
    }

    public byte getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(byte numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public byte getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(byte cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public Producto getProductos() {
        return productos;
    }

    public void setProductos(Producto productos) {
        this.productos = productos;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPersonalizacion() {
        return personalizacion;
    }

    public void setPersonalizacion(String personalizacion) {
        this.personalizacion = personalizacion;
    }

    public Pago getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(Pago medioPago) {
        this.medioPago = medioPago;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}