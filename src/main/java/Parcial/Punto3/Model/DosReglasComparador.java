package Parcial.Punto3.Model;

import java.util.Comparator;

public class DosReglasComparador implements Comparator<Turno> {

    @Override
    public int compare(Turno t1, Turno t2) {
        // Regla 1: Personas mayores de 60 años tienen prioridad
        boolean t1Mayor60 = t1.getEdad() > 60;
        boolean t2Mayor60 = t2.getEdad() > 60;

        if (t1Mayor60 && !t2Mayor60) {
            return -1;  // t1 tiene prioridad
        } else if (!t1Mayor60 && t2Mayor60) {
            return 1;   // t2 tiene prioridad
        } else if (t1Mayor60 && t2Mayor60) {
            // Regla 2: Si ambos tienen más de 60, se comparan por secuencia
            return t1.compareTo(t2);
        } else {
            // Ninguno es mayor de 60, comparar solo por secuencia
            return t1.compareTo(t2);
        }
    }

}
