/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import enums.EstadoReservacion;
import enums.TipoPago;
import java.util.Date;
import java.util.UUID;



/**
 *
 * @author Usuario
 */
public class Reservacion {
    private String id;
    private Date fechaInicio;
    private Date fechaFin;
    private EstadoReservacion estado;
    private Habitacion habitacion;
    private Cliente cliente;
    private Pago pago;

    public Reservacion(Date fechaInicio, Date fechaFin, Habitacion habitacion, Cliente cliente, double montoPago, TipoPago tipoPago) {
        id = UUID.randomUUID().toString();
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.habitacion = habitacion;
        this.cliente = cliente;
        //cliente.setReserva(this);
        this.pago = new Pago(montoPago, tipoPago, new Date());
        this.estado = EstadoReservacion.CONFIRMADA;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public EstadoReservacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoReservacion estado) {
        this.estado = estado;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Pago getPago() {
        return pago;
    }

    public void setPago(Pago pago) {
        this.pago = pago;
    }
    
    public int getDias() {
        long time = this.fechaFin.getTime() - this.fechaInicio.getTime();
        double dias = time / 1000 / 60 / 60 / 24;
        return (int) dias;
    }
    
    
}
