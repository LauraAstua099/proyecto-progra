package Controlador;

public class Comida extends Producto{

    private String tipo;

    public Comida(byte id, String nombre, String descripcion, double precio, byte cantidad, String estado, String tipo) {
        super(id, nombre, descripcion, precio, cantidad, estado);
        this.tipo = tipo;
    }
    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    @Override
    public void registrar() {
        
    }

    @Override
    public void consultar(int id) {
        
    }

    @Override
    public void eliminar(int id) {
        
    }
}