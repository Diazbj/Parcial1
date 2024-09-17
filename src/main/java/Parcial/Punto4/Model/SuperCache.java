package Parcial.Punto4.Model;

/*Se requiere crear una clase que represente una memoria cache de elementos con las siguientes caracteristicas

* la clase debe llamarse SuperCahce
* Dentro de ella se alojaran elementos de las siguientes tres entidades : Persona,Turno y Ciudad.
* Dentro de la clase SuperCache se requiere que exista un java.util.Map por cada una de las 3 entidades
* Dentro de la clase SuperCache se requiere implementar los metodos para agregar personas al map de personas, agregar turnos al map de turnos y ciudades al map de ciudades
* Tambien se requieren metodos para consultar Personas,Turnos y ciudades por medio de sus claves o identificadores
*/

import Parcial.Punto3.Model.Turno;

import java.util.HashMap;
import java.util.Map;

public class SuperCache {
    private Map<String,Persona> personasMap;
    private Map<Integer, Turno> turnosMap;
    private Map<String,Ciudad> ciudadesMap;

    public SuperCache() {
        personasMap = new HashMap<>();
        turnosMap = new HashMap<>();
        ciudadesMap = new HashMap<>();
    }

    public void agregarPersona(Persona persona) {
        personasMap.put(persona.getId(), persona);
    }

    public void agregarTurno(Turno turno) {
        turnosMap.put(turno.getSecuencia(), turno);
    }

    public void agregarCiudad(Ciudad ciudad) {
        ciudadesMap.put(ciudad.getId(), ciudad);
    }

    // Métodos para consultar entidades por su clave

    public Persona obtenerPersonaId(String id){
        return personasMap.get(id);
    }
    public Turno obtenerTurnoSecuencia(int secuencia){
        return turnosMap.get(secuencia);
    }
    public Ciudad obtenerCiudadId(String id){
        return ciudadesMap.get(id);
    }

    //Metodo para consultar por id

    public boolean consultarPersonaId(String id){
        return personasMap.containsKey(id);
    }
    public boolean consultarTurnoSecuencia(int secuencia){
        return turnosMap.containsKey(secuencia);
    }
    public boolean consultarCiudadId(String id){
        return ciudadesMap.containsKey(id);
    }

    // Métodos para eliminar entidades por su clave
    public void eliminarPersonaPorId(String id) {
        personasMap.remove(id);
    }

    public void eliminarTurnoPorSecuencia(int secuencia) {
        turnosMap.remove(secuencia);
    }

    public void eliminarCiudadPorId(String id) {
        ciudadesMap.remove(id);
    }

    public Map<String, Persona> getPersonasMap() {
        return personasMap;
    }

    public void setPersonasMap(Map<String, Persona> personasMap) {
        this.personasMap = personasMap;
    }

    public Map<Integer, Turno> getTurnosMap() {
        return turnosMap;
    }

    public void setTurnosMap(Map<Integer, Turno> turnosMap) {
        this.turnosMap = turnosMap;
    }

    public Map<String, Ciudad> getCiudadesMap() {
        return ciudadesMap;
    }

    public void setCiudadesMap(Map<String, Ciudad> ciudadesMap) {
        this.ciudadesMap = ciudadesMap;
    }
}
