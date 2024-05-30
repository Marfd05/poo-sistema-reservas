/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;


/**
 *
 * @author Usuario
 */
public class Hotel {
    private String nombre;
    private String direccion;
    private String telefono;
    private String movil;
    private String fax;
    private String nit;
    private String email;
    private String Descripcion;
    private Data<Habitacion> habitaciones;
    private Data<Empleado> empleados;
    private Data<Cliente> clientes;
    private Data<Reservacion> reservaciones;

    public Hotel(String nombre, String direccion, String telefono, String movil, String fax, String nit, String email,String Descripcion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.movil = movil;
        this.fax = fax;
        this.nit = nit;
        this.email = email;
        this.Descripcion = Descripcion;
        this.habitaciones = new Data(Habitacion.class, "habitaciones");
        this.empleados = new Data(Empleado.class, "empleados");
        this.clientes = new Data(Cliente.class, "clientes");
        this.reservaciones = new Data(Reservacion.class, "reservaciones");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMovil() {
        return movil;
    }

    public void setMovil(String movil) {
        this.movil = movil;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }


    public Data<Habitacion> getHabitaciones() {
        return habitaciones;
    }

    public void setHabitaciones(Data<Habitacion> habitaciones) {
        this.habitaciones = habitaciones;
    }

    public Data<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Data<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Data<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(Data<Cliente> clientes) {
        this.clientes = clientes;
    }

    public Data<Reservacion> getReservaciones() {
        return reservaciones;
    }

    public void setReservaciones(Data<Reservacion> reservaciones) {
        this.reservaciones = reservaciones;
    }  
    
}
