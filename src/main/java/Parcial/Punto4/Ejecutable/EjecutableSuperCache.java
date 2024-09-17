package Parcial.Punto4.Ejecutable;

import Parcial.Punto3.Model.Turno;
import Parcial.Punto4.Model.Ciudad;
import Parcial.Punto4.Model.Persona;
import Parcial.Punto4.Model.SuperCache;

public class EjecutableSuperCache {

    public static void main(String[] args) {

        // Crear instancia de SuperCache
        SuperCache superCache = new SuperCache();

        // Crear objetos de prueba
        Persona persona1 = new Persona("P1", "Juan Pérez");
        Persona persona2 = new Persona("P2", "Ana García");

        Turno turno1 = new Turno(23, 2);
        Turno turno2 = new Turno(67, 1);

        Ciudad ciudad1 = new Ciudad("C1", "Bogotá");
        Ciudad ciudad2 = new Ciudad("C2", "Medellín");

        // Agregar personas, turnos y ciudades al SuperCache
        superCache.agregarPersona(persona1);
        superCache.agregarPersona(persona2);

        superCache.agregarTurno(turno1);
        superCache.agregarTurno(turno2);

        superCache.agregarCiudad(ciudad1);
        superCache.agregarCiudad(ciudad2);

        // Consultar personas, turnos y ciudades por ID
        System.out.println("Consultando persona con ID P1: " + superCache.obtenerPersonaId("P1").getNombre());
        System.out.println("Consultando turno con secuencia 2: " + superCache.obtenerTurnoSecuencia(2).getEdad());
        System.out.println("Consultando ciudad con ID C1: " + superCache.obtenerCiudadId("C1").getNombre());

        // Verificar si un elemento está en la cache
        System.out.println("¿Persona con ID P3 está en la cache? " + superCache.consultarPersonaId("P3"));
        System.out.println("¿Ciudad con ID C2 está en la cache? " + superCache.consultarCiudadId("C2"));

        // Eliminar una persona, un turno y una ciudad
        superCache.eliminarPersonaPorId("P1");
        superCache.eliminarTurnoPorSecuencia(1);
        superCache.eliminarCiudadPorId("C1");

        // Verificar después de eliminar
        System.out.println("¿Persona con ID P1 está en la cache después de eliminar? " + superCache.consultarPersonaId("P1"));
        System.out.println("¿Turno con secuencia 1 está en la cache después de eliminar? " + superCache.consultarTurnoSecuencia(1));
        System.out.println("¿Ciudad con ID C1 está en la cache después de eliminar? " + superCache.consultarCiudadId("C1"));

    }

}
