package Parcial.Punto3.Model;

/* Tengo un arrayList y le voy a insertar objetos de tipo Turno, necesito hacer una funcionalidad en la que despues
de ingresarlos en dicho Arraylist yo puedahacer que se ordenen por 2 reglas de prioridad la primer regla es que si el turno
esta asignado a una persona mayor de 60 años, entoneces ella se atiende primero, pero si hay varios turnos asignados a personas mayores
de 60 años, entonces de esas personas se despacha primero la que tiene el turno cuyo numero de secuencia es menor.

La clase turno ya tiene implementado el ordenamiento natural con el metodo compareTo(..) pero este solamente tiene en cuenta la secuencia
Escriba el codigo fuente java necesario para implementar la nueva forma de comparar.*/
public class Turno implements Comparable<Turno> {

    private int edad;
    private int secuencia;

    public Turno(int edad, int secuencia) {
        this.edad = edad;
        this.secuencia = secuencia;
    }

    @Override
    public int compareTo(Turno o) {

        return this.secuencia - o.secuencia;

    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public int getSecuencia() {
        return secuencia;
    }
    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

}
