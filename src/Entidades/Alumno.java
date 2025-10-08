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
public class Alumno extends Persona {
    
    private String curso;
    private ArrayList<Materia> materias;

    public Alumno(String nombre, String dni, String curso) {
        super(nombre, dni);
        this.curso = curso;
    }
    
    public void inscribirse(Materia materia){
        if (materia.getDocente() != null){
            if (!materia.estaInscripto(this)){
                materia.agregarAlumno(this);
        this.agregarNotificacion("Se inscribio en la materia: "+ materia.getNombre());
        materia.getDocente().agregarNotificacion("Se inscribio un nuevo alumno"+this.nombre+"en la materia de "+materia.getNombre());
            }
        }
    }
    
    @Override
    public void notificar(String mensaje){
        String m = "Alumno:" +this.nombre+ this.curso +" - "+mensaje;
        super.agregarNotificacion(m);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Alumno ");
        sb.append("curso: ").append(this.curso);
        sb.append(", materias: ").append(this.materias);
        sb.append(' ');
        return sb.toString();
        
    
    }
    
    
}
