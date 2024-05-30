/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import enums.EstadoHabitacion;
import enums.TipoHabitacion;
import javax.swing.ImageIcon;

/**
 *
 * @author Usuario
 */
public class Habitacion {
    private int numero;
    private TipoHabitacion tipo;
    private EstadoHabitacion estado;
    private double precioPorNoche; 
    private String icono;
    private DetallesHabitacion detalles;
   


    public Habitacion(int numero, TipoHabitacion tipo, EstadoHabitacion estado, double precioPorNoche,String icono) {
        this.numero = numero;
        this.tipo = tipo;
        this.estado = estado;
        this.precioPorNoche = precioPorNoche;
        this.icono = icono;
        
        switch (this.tipo) {
            case TipoHabitacion.INDIVIDUAL -> detalles = new Habitacion.DetallesHabitacion(true, false, false, false);
            case TipoHabitacion.DOBLE -> detalles = new Habitacion.DetallesHabitacion(true, true, false, false);
            case TipoHabitacion.SUITE -> detalles = new Habitacion.DetallesHabitacion(true, true, true, true);
        }
        
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public TipoHabitacion getTipo() {
        return tipo;
    }

    public void setTipo(TipoHabitacion tipo) {
        this.tipo = tipo;
    }

    public EstadoHabitacion getEstado() {
        return estado;
    }

    public void setEstado(EstadoHabitacion estado) {
        this.estado = estado;
    }

    public double getPrecioPorNoche() {
        return precioPorNoche;
    }

    public void setPrecioPorNoche(double precioPorNoche) {
        this.precioPorNoche = precioPorNoche;
    }

    public String getIcono() {
        return icono;
    }
    public void setIcono(String icono) {
        this.icono = icono;
    }

    public DetallesHabitacion getDetalles() {
        return detalles;
    }

    public void setDetalles(DetallesHabitacion detalles) {
        this.detalles = detalles;
    }
    
    
    
    public class DetallesHabitacion {
        private boolean tv;
        private boolean camaDoble;
        private boolean minibar;
        private boolean jacuzzi;

        public DetallesHabitacion(boolean tv, boolean camaDoble, boolean minibar, boolean jacuzzi) {
            this.tv = tv;
            this.camaDoble = camaDoble;
            this.minibar = minibar;
            this.jacuzzi = jacuzzi;
        }

        public boolean isTv() {
            return tv;
        }

        public void setTv(boolean tv) {
            this.tv = tv;
        }

        public boolean isCamaDoble() {
            return camaDoble;
        }

        public void setCamaDoble(boolean camaDoble) {
            this.camaDoble = camaDoble;
        }

        public boolean isMinibar() {
            return minibar;
        }

        public void setMinibar(boolean minibar) {
            this.minibar = minibar;
        }

        public boolean isJacuzzi() {
            return jacuzzi;
        }

        public void setJacuzzi(boolean jacuzzi) {
            this.jacuzzi = jacuzzi;
        }
        
        
    }
    
}
