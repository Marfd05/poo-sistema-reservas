/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public abstract class Usuario {
    private String documento;
    private String nombre;
    private String email;
    private String password;

    public Usuario(String documento, String nombre, String email) {
        this.documento = documento;
        this.nombre = nombre;
        this.email = email;
    }

    public Usuario(String documento, String nombre, String email, String password) {
        this.documento = documento;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
