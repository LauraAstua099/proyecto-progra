package Modelo;

public class Pago {
    private byte id;
    private String nombre;

    public Pago(byte id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public byte getId() {
        return id;
    }

    public void setId(byte id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}