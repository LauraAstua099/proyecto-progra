package Modelo;

public abstract class Producto {
    
    private byte idProducto, cantidad;
    private String nombre, descripcion, estado;
    private double precio;

    public Producto(byte idProducto, String nombre, String descripcion, double precio, byte cantidad, String estado) {
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = estado;
        this.precio = precio;
    }

    public byte getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(byte idProducto) {
        this.idProducto = idProducto;
    }

    public byte getCantidad() {
        return cantidad;
    }

    public void setCantidad(byte cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    //metodos abstractos
    public abstract void registrar();
    public abstract void consultar(int idProducto);
    //public abstract Producto actualizar(int id);
    public abstract void eliminar(int idProducto);
}