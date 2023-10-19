package org.example;


public class UtilContexto {
    public static void cargadorContexto(Instituto instituto){
        AlumnosAnot alumnosAnotPadre = instituto.getClass().getAnnotation(AlumnosAnot.class);
        AlumnoAnot[] alumnosAnotHijo = alumnosAnotPadre.value();
        for (AlumnoAnot alumnoAnot: alumnosAnotHijo
             ) {
            String nombre = alumnoAnot.nombre();
            String apellidos = alumnoAnot.apellidos();
            String DNI = alumnoAnot.DNI();
            instituto.getAlumnos().add(new Alumno(nombre, apellidos, DNI));
        }
    }
}
