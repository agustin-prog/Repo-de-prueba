/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;

/**
 *
 * @author agust
 */
public abstract class Persona {
    
    protected String nombre;
    protected String dni;
    protected ArrayList<String> notificaciones;

    public Persona() {
        this.notificaciones = new ArrayList<>();
    }

    public Persona(String nombre, String dni){
        this();
        this.nombre = nombre;
        this.dni = dni;
    }
    
    public abstract void notificar(String mensaje);

    public String getNombre() {
        return this.nombre;
    }

    public String getDni() {
        return this.dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public ArrayList<String> getNotificaciones() {
        return new ArrayList<>(this.notificaciones);
    }
    
    protected void agregarNotificacion(String mensaje){
        this.notificaciones.add(mensaje);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Persona ");
        sb.append("nombre: ").append(this.nombre);
        sb.append(", dni: ").append(this.dni);
        sb.append(", notificaciones=").append(this.notificaciones);
        sb.append(' ');
        return sb.toString();
    }
}
