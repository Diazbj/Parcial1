package Parcial.Punto3.Ejecutable;

import Parcial.Punto3.Model.DosReglasComparador;
import Parcial.Punto3.Model.Turno;

import java.util.ArrayList;
import java.util.Collections;

public class EjecutableComparador {

    public static void main(String[] args) {

        ArrayList<Turno> turnos = new ArrayList<>();

        turnos.add(new Turno(45,5 ));
        turnos.add(new Turno(65, 3));
        turnos.add(new Turno(71, 10));
        turnos.add(new Turno(30, 4));
        turnos.add(new Turno(68, 2));

        DosReglasComparador comparadorTurno=new DosReglasComparador();

        Collections.sort(turnos, comparadorTurno);

        for (Turno turno : turnos) {
            System.out.println(turno.getEdad());
        }

    }

}
