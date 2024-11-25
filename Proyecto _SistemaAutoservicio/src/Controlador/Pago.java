package Controlador;

/**
 * Clase Pago para manejar información de los pagos realizados.
 */
public class Pago {
    private String metodoPago; // Efectivo, Tarjeta, SINPE móvil
    private double monto;      // Monto del pago
    private String referencia; // Referencia de pago, si aplica

    // Constructor por defecto
    public Pago() {
    }

    // Constructor con parámetros
    public Pago(String metodoPago, double monto, String referencia) {
        this.metodoPago = metodoPago;
        this.monto = monto;
        this.referencia = referencia;
    }

    // Getters y setters
    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    /**
     * Representación en texto del pago
     */
    @Override
    public String toString() {
        return "Pago{" +
               "metodoPago='" + metodoPago + '\'' +
               ", monto=" + monto +
               ", referencia='" + referencia + '\'' +
               '}';
    }
}
