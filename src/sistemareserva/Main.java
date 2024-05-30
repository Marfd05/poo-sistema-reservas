/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemareserva;

import GUI.InicialUI;
import enums.EstadoHabitacion;
import enums.RolUsuario;
import enums.TipoHabitacion;
import enums.TipoPago;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import modelo.Cliente;
import modelo.Empleado;
import modelo.Habitacion;
import modelo.Hotel;
import modelo.Reservacion;

/**
 *
 * @author Usuario
 */
public class Main {
    
    public static Hotel hotel;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        hotel = new Hotel(
            "Paradise Hotel",
            "Carrera 45 #123-45, Bogotá, Colombia",
            "+57 1 2345678",
            "+57 311 9876543",
            "+57 1 2345679",
            "900123456-7",
            "info@paradisehotel.co",
            "Ubicado en el corazón vibrante de Bogotá, Colombia, Paradise Hotel ofrece un oasis de lujo y confort para los viajeros más exigentes. "
                    + "Con habitaciones elegantemente decoradas, un restaurante gourmet, un spa de clase mundial y vistas impresionantes de la ciudad, "
                    + "nuestro hotel está diseñado para proporcionar una experiencia inolvidable. Ya sea que viajes por negocios o placer, "
                    + "en Paradise Hotel encontrarás el refugio perfecto donde cada detalle está pensado para tu máxima comodidad y satisfacción.");
        cargarDatosIniciales();
        
        InicialUI paginaInicial = new InicialUI();
        paginaInicial.setVisible(true);
    }
    
    public static List<Habitacion> habitaciones() {
        return hotel.getHabitaciones().leer();
    }
    
    public static List<Empleado> empleados() {
        return hotel.getEmpleados().leer();
    }
    
    public static List<Cliente> clientes() {
        return hotel.getClientes().leer();
    }
    
    public static List<Reservacion> reservaciones(String documentoCliente) {
        List<Reservacion> result = new ArrayList<>();
        for(Reservacion reservacion : hotel.getReservaciones().leer()) {
            if(reservacion.getCliente().getDocumento().equals(documentoCliente)) {
                result.add(reservacion);
            }
        }
        return result;
    }
    
    
    public static void cargarDatosIniciales() {
        //habitaciones
        hotel.getHabitaciones().crear(new Habitacion(101, TipoHabitacion.INDIVIDUAL, EstadoHabitacion.DISPONIBLE, 100.0,"/imagenes/Habitaciones/habitacionindividual1.jpg"));
        hotel.getHabitaciones().crear(new Habitacion(102, TipoHabitacion.DOBLE, EstadoHabitacion.DISPONIBLE, 200.0,"/imagenes/Habitaciones/habitaciondoble1.jpg"));
        hotel.getHabitaciones().crear(new Habitacion(103, TipoHabitacion.SUITE, EstadoHabitacion.DISPONIBLE, 400.0,"/imagenes/Habitaciones/habitacionsuite1.jpg"));
        
        hotel.getHabitaciones().crear(new Habitacion(201, TipoHabitacion.INDIVIDUAL, EstadoHabitacion.DISPONIBLE, 100.0,"/imagenes/Habitaciones/habitacionindividual2.jpg"));
        hotel.getHabitaciones().crear(new Habitacion(202, TipoHabitacion.DOBLE, EstadoHabitacion.DISPONIBLE, 200.0,"/imagenes/Habitaciones/habitaciondoble2.jpg"));
        hotel.getHabitaciones().crear(new Habitacion(203, TipoHabitacion.SUITE, EstadoHabitacion.DISPONIBLE, 400.0,"/imagenes/Habitaciones/habitacionsuite2.jpg"));
        
        //empleados
        hotel.getEmpleados().crear(new Empleado("1234567891", "Camila Fernandez", "camila@email.com", "123456", RolUsuario.ADMIN));
        
        
        //clientes
        hotel.getClientes().crear(new Cliente("1111111111", "Maria Ceron", "maria@email.com", "123456"));
        hotel.getClientes().crear(new Cliente("2222222222", "Ricardo Ordoñez", "ricardo@email.com", "123456"));
        
        //reservaciones
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + 1);
        Date inicio = calendar.getTime();
        calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + 2);
        Date fin = calendar.getTime();
        
        Reservacion reservacion1 = new Reservacion(inicio, fin, habitaciones().get(0), clientes().get(0), 100.0, TipoPago.EFECTIVO);
        Reservacion reservacion2 = new Reservacion(inicio, fin, habitaciones().get(1), clientes().get(0), 200.0, TipoPago.EFECTIVO);
        Reservacion reservacion3 = new Reservacion(inicio, fin, habitaciones().get(2), clientes().get(0), 400.0, TipoPago.EFECTIVO);
        Reservacion reservacion4 = new Reservacion(inicio, fin, habitaciones().get(3), clientes().get(0), 100.0, TipoPago.TARJETA);
        Reservacion reservacion5 = new Reservacion(inicio, fin, habitaciones().get(4), clientes().get(0), 200.0, TipoPago.TARJETA);
        Reservacion reservacion6 = new Reservacion(inicio, fin, habitaciones().get(5), clientes().get(0), 400.0, TipoPago.TARJETA);
        
        hotel.getReservaciones().crear(reservacion1);
        hotel.getReservaciones().crear(reservacion2);
        hotel.getReservaciones().crear(reservacion3);
        hotel.getReservaciones().crear(reservacion4);
        hotel.getReservaciones().crear(reservacion5);
        hotel.getReservaciones().crear(reservacion6);
    }
}
