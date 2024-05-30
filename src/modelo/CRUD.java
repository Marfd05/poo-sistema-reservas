/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.List;

/**
 *
 * @author Usuario
 * @param <T>
 */
public interface CRUD<T> {
    public boolean crear(T objeto);
    public List<T> leer();
    public boolean actualizar(int posicion, T nuevoObjeto);
    public boolean eliminar(T objeto);
}
