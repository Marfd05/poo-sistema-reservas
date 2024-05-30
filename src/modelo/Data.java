/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import sistemareserva.FileStorage;

/**
 *
 * @author Usuario
 * @param <T>
 */
public class Data<T> implements CRUD<T>{
    private String fileName;
    private Class<T> type;
    private List<T> data;

    public Data(Class<T> type, String fileName) {
        data = new ArrayList<>();
        this.fileName = fileName;
        this.type = type;
    }

    @Override
    public boolean crear(T objeto) {
        int sizeBefore = data.size();
        data.add(objeto);
        int sizeAfter = data.size();
        saveInStorage();
        return sizeAfter > sizeBefore;
    }

    @Override
    public List<T> leer() {
        data = FileStorage.readFileInList(type, fileName);
        return data;
    }

    @Override
    public boolean actualizar(int posicion, T nuevoObjeto) {
        T actual = data.get(posicion);
        data.set(posicion, nuevoObjeto);
        saveInStorage();
        return !actual.equals(nuevoObjeto);
    }

    @Override
    public boolean eliminar(T objeto) {
        boolean result = data.remove(objeto);
        saveInStorage();
        return result;
    }
    
    void saveInStorage() {
        try {
            FileStorage.writeFile(data, fileName);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
