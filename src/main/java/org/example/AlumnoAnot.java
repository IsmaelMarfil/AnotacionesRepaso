package org.example;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Repeatable(AlumnosAnot.class)
public @interface AlumnoAnot {
    String nombre();
    String apellidos();
    String DNI();
}
