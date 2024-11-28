package Controlador;

public class Bebida extends Producto{
    
    private double capacidadLiquido;
    
    public Bebida(byte id, String nombre, String descripcion, double precio, byte cantidad, String estado, double capacidadLiquido) {
        super(id, nombre, descripcion, precio, cantidad, estado);
        this.capacidadLiquido = capacidadLiquido;
    }

    public double getCapacidadLiquido() {
        return capacidadLiquido;
    }

    public void setCapacidadLiquido(double capacidadLiquido) {
        this.capacidadLiquido = capacidadLiquido;
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