/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jugador;

/**
 *
 * @author LORENA
 */
public class Jugador {
//DECLARAMOS LOS ATRIBUTOS, SI NO SE PONE PUBLIC NI PRIVATE, ES PROTECTED

    public static String nombreEquipo;
    short numJugador;
    short anioNacimiento;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\nDELANTERO D1");
        System.out.println("------------\n");
        Delantero D1 = new Delantero((short) 1, true);
        D1.mostrarD();
       System.out.println("\nDELANTERO D2");
        System.out.println("------------\n");
        Delantero D2 = new Delantero((short) 27, false);
        D2.mostrarD();
        System.out.println("\nPORTERO P1");
        System.out.println("------------\n");
        Portero P1 = new Portero((short) 25, true);
        P1.mostrarP();
        System.out.println("\nPORTERO P2");
        System.out.println("------------\n");
        Portero P2 = new Portero("CD Guadalajara", (short) 39, true);
        P2.mostrarP();
        System.out.println("\nDELANTERO D3");
        System.out.println("------------\n");
        Delantero D3 = new Delantero((short) 15, true);
        D3.mostrarD();
        System.out.println("\nDELANTERO D4");
        System.out.println("------------\n");
        Delantero D4 = new Delantero((short) 20, true);
        D4.mostrarD();
        System.out.println("\n");
    }

    //CONSTRUCTOR
    public Jugador() {
        nombreEquipo = "CD Horche";
        //MATH.RANDOM = (int)(Math.random()*(MAXIMO - MINIMO) + (MINIMO+1));
        this.numJugador = (short) (Math.random() * (24 - 1) + 2);
        //MATH.RANDOM = (int)(Math.random()*(MAXIMO - MINIMO) + (MINIMO+1));
        this.anioNacimiento = (short) (Math.random() * (2000 - 1975) + 1976);
    }

    //METODO MOSTRAR
    public void mostrar() {
        System.out.println("Nombre equipo: " + nombreEquipo);
        System.out.println("Numero de jugador: " + numJugador);
        System.out.println("Año de nacimiento: " + anioNacimiento);
    }
}
