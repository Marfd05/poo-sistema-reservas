/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Cliente extends Usuario{
    
    private List<Reservacion> reservas;
    
    public Cliente(String documento, String nombre, String email) {
        super(documento, nombre, email);
        this.reservas = new ArrayList<>();
    }

    public Cliente(String documento, String nombre, String email, String password) {
        super(documento, nombre, email, password);
        this.reservas = new ArrayList<>();
    }

    public List<Reservacion> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reservacion> reservas) {
        this.reservas = reservas;
    }
    public void addReserva(Reservacion reserva){
        reserva.setCliente(this);
        reservas.add(reserva);
    }
    
}
