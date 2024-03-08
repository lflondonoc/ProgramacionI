package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;
import java.util.Collection;

public class Curso {
    private String nombre;
    private Collection<Estudiante>estudiantes;

    public Curso (String nombre){
        this.nombre=nombre;
        estudiantes = new LinkedList<>();
        assert nombre !=null;
    }

    public void agregarEstudiante (Estudiante estudiante){
        assert validarNumeroIdenticacionExistente (estudiante.numeroIdentificacion())==false;
        estudiantes.add(estudiante);
    }
    private boolean validarNumeroIdenticacionExistente (String numeroIdentificacion){
        boolean bandera=false;
        for (Estudiante estudiante: estudiantes){
            if (estudiante.numeroIdentificacion().equals(numeroIdentificacion)){
                bandera=true;
            }
        }
        return bandera;
    }

    
    public String getNombre() {
        return nombre;
    }
    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public Collection<Estudiante> identificarMayoresEdad (){
        List<Estudiante> mayoresEdad = new LinkedList<>();
        for (Estudiante estudiante: estudiantes){
            if (estudiante.edad() >= 18){
                mayoresEdad.add(estudiante);
            }
        }
        return mayoresEdad;
    } 
}
