package Controlador;

public class Usuario {
    private byte cedula, telefono;
    private String nombre, apellido, correo, contrasenna;

    public Usuario(byte cedula, String nombre, String apellido, byte telefono, String correo, String contrasenna) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correo = correo;
        this.contrasenna = contrasenna;
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
}