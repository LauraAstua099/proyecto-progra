package Controlador;

import java.util.Date;

/**
 * Clase Feedback para manejar opiniones de los clientes.
 */
public class Feedback {
    private String comentario;  // Comentario del cliente
    private double valoracion;  // Valoración en una escala de 1 a 5
    private Date fecha;         // Fecha del feedback

    // Constructor por defecto
    public Feedback() {
    }

    // Constructor con parámetros
    public Feedback(String comentario, double valoracion, Date fecha) {
        this.comentario = comentario;
        this.valoracion = valoracion;
        this.fecha = fecha;
    }

    // Getters y setters
    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /**
     * Representación en texto del feedback
     */
    @Override
    public String toString() {
        return "Feedback{" +
               "comentario='" + comentario + '\'' +
               ", valoracion=" + valoracion +
               ", fecha=" + fecha +
               '}';
    }
}
