package org.example;

import java.util.HashSet;
import java.util.Set;
@AlumnoAnot(nombre = "Pepe",apellidos = "Gomez",DNI = "77777777A")
@AlumnoAnot(nombre = "Pepa",apellidos = "Fernandez",DNI = "88888888A")
public class Instituto {

    private Set<Alumno> Alumnos = new HashSet<>();
    public Instituto(){}

    public Set<Alumno> getAlumnos() {
        return Alumnos;
    }

    public void setAlumnos(Set<Alumno> alumnos) {
        Alumnos = alumnos;
    }
}
