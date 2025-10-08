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
public class Materia {
    
    private String nombre;
    private Docente docente;
    private ArrayList<Alumno> alumnos;

    public Materia(String nombre, Docente docente) {
        this.nombre = nombre;
        this.docente = docente;
        this.alumnos = new ArrayList<>();
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public Docente getDocente(){
        return this.docente;
    }
    
    public void agregarAlumno(Alumno alumno){
        alumnos.add(alumno);
    }
    
    
    public boolean estaInscripto(Alumno alumno){
        return this.alumnos.contains(alumno);
    }

    @Override
    public int hashCode() {
        return this.nombre.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        final Materia otra = (Materia) obj;
        return this.nombre.equals(otra.nombre);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Materia ");
        sb.append("nombre: ").append(this.nombre);
        sb.append(", docente: ").append(this.docente);
        for (Alumno alm : alumnos){
             sb.append(", alumnos: ").append(this.alumnos);
        }
        sb.append(' ');
        return sb.toString();
    }
    
    
    
}
