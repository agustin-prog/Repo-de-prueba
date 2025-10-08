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
public class Docente extends Persona{
    
    private String legajo;
    private ArrayList<Materia> materias;

    public Docente( String nombre, String dni, String legajo) {
        super(nombre, dni);
        this.legajo = legajo;
    }
    
    public void asignarMateria(Materia materia){
        materias.add(materia);
    }
    
     @Override
     public void notificar(String mensaje){
         String m = "Docente:" +this.nombre+ this.legajo +" - "+mensaje;
         super.agregarNotificacion(m);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Docente ");
        sb.append("legajo: ").append(this.legajo);
        sb.append(", materias: ").append(this.materias);
        sb.append(' ');
        return sb.toString();
    }
     
     
    
     
}
