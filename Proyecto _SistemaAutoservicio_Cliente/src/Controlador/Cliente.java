package Controlador;

public class Cliente {
    private byte cedula, telefono;
    private String nombre, apellido, correo, contrasenna;
    private Pago medioPagoPreferido;

    public Cliente(byte cedula, String nombre, String apellido, byte telefono, String correo, String contrasenna, Pago medioPagoPreferido) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasenna = contrasenna;
        this.medioPagoPreferido = medioPagoPreferido;
    }

    public byte getCedula() {
        return cedula;
    }

    public void setCedula(byte cedula) {
        this.cedula = cedula;
    }

    public byte getTelefono() {
        return telefono;
    }

    public void setTelefono(byte telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasenna() {
        return contrasenna;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }

    public Pago getMedioPagoPreferido() {
        return medioPagoPreferido;
    }

    public void setMedioPagoPreferido(Pago medioPagoPreferido) {
        this.medioPagoPreferido = medioPagoPreferido;
    }
}