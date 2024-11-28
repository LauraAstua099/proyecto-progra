package Controlador;

import java.util.Date;

public class Feedback {
    private Cliente cliente;
    private String feedback;
    private Date fecha;
    private double valoracion;

    public Feedback(Cliente cliente, String feedback, Date fecha, double valoracion) {
        this.cliente = cliente;
        this.feedback = feedback;
        this.fecha = fecha;
        this.valoracion = valoracion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getValoracion() {
        return valoracion;
    }

    public void setValoracion(double valoracion) {
        this.valoracion = valoracion;
    }
}