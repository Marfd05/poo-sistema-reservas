/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import enums.RolUsuario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Empleado extends Usuario{
    
    private RolUsuario rol;
    private Empleado supervisor;
    private List<Habitacion> habitacionesAsiganadas;

    public Empleado(String documento, String nombre, String email, String password, RolUsuario rol) {
        super(documento, nombre, email, password);
        this.rol = rol;
        this.habitacionesAsiganadas = new ArrayList<>();
    }

    public RolUsuario getRol() {
        return rol;
    }

    public void setRol(RolUsuario rol) {
        this.rol = rol;
    }

    public Empleado getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(Empleado supervisor) {
        this.supervisor = supervisor;
    }

    public List<Habitacion> getHabitacionesAsiganadas() {
        return habitacionesAsiganadas;
    }

    public void setHabitacionesAsiganadas(List<Habitacion> habitacionesAsiganadas) {
        this.habitacionesAsiganadas = habitacionesAsiganadas;
    }
     
}
