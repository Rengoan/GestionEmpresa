/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

import java.util.Scanner;

/**
 *
 * @author LORENA
 */
public class Delantero extends Jugador {
    //ATRIBUTOS

    public short totalGoles;
    public boolean espanol;
    public float peso;
    Scanner ent = new Scanner(System.in);

    //METODO MOSTRAR
    public void mostrarD() {
        mostrar();
        System.out.println("\t- Numero total de goles: " + totalGoles);
        System.out.println("\t- ¿Es español?: " + espanol);
        System.out.println("\t- Peso del jugador: " + peso +" kg");
    }

    //CONSTRUCTOR
    public Delantero(short totalGoles, boolean espanol) {
        super();
        this.totalGoles = totalGoles;
        this.espanol = espanol;
        //Introducir peso del jugador
        System.out.println("Introduzca el peso: ");
        this.peso = ent.nextFloat();
        this.nombreEquipo = nombreEquipo;

    }
}
