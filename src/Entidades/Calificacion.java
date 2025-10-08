/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author agust
 */
public class Calificacion {
    
    private Alumno alumno;
    private Materia materia;
    private double nota;

    public Calificacion(Alumno alumno, Materia materia, double nota) {
        this.alumno = alumno;
        this.materia = materia;
        this.nota = nota;
    }

    public Alumno getAlumno() {
        return this.alumno;
    }

    public Materia getMateria() {
        return this.materia;
    }

    public double getNota() {
        return this.nota;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Calificacion ");
        sb.append("alumno: ").append(alumno);
        sb.append(", materia: ").append(materia);
        sb.append(", nota: ").append(nota);
        sb.append(' ');
        return sb.toString();
    }

    
     
}
