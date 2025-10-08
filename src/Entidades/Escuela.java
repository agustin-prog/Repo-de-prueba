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
public class Escuela {
    
    private String nombreEscuela;
    private ArrayList<Alumno> alumnos;
    private ArrayList<Docente> docentes;
    private ArrayList<Calificacion> calificaciones;
    private ArrayList<Materia> materias;

    public Escuela(String nombreEscuela) {
        this.nombreEscuela = nombreEscuela;
        this.alumnos = new ArrayList<>();
        this.docentes = new ArrayList<>();
        this.calificaciones = new ArrayList<>();
        this.materias = new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }

    public void agregarDocente(Docente docente){
        this.docentes.add(docente);
    }

    public void agregarMateria(Materia materia){
        this.materias.add(materia);
    }
            
    public void registrarNota(Alumno alumno, Materia materia, double nota){
        for (Materia m : materias){
            if(m.estaInscripto(alumno)){
                
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Escuela ");
        sb.append("nombreEscuela: ").append(this.nombreEscuela);
        sb.append(", alumnos: ").append(this.alumnos);
        sb.append(", docentes: ").append(this.docentes);
        sb.append(", calificaciones: ").append(this.calificaciones);
        sb.append(", materias: ").append(this.materias);
        sb.append(' ');
        return sb.toString();
    }
    
    
         
    
    
    
    
    
    
}
