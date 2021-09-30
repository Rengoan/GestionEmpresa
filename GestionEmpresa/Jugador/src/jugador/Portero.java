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
public class Portero extends Jugador {
     //ATRIBUTOS

    public short mediaGoles;
    public boolean enExtranjero;

    public Portero(short mediaGoles, boolean enExtranjero) {
        this.mediaGoles = mediaGoles;
        this.enExtranjero = enExtranjero;
    }
  
     public void mostrarP() {
        mostrar();
        System.out.println("\t- Media total de goles: " + mediaGoles);
        System.out.println("\t- ¿Es extranjero?: " + enExtranjero);
    }
     
     //CONSTRUCTOR MODIFICA
     public Portero(String nombreEquipo, short mediaGoles, boolean enExtranjero) {
        this.nombreEquipo = nombreEquipo; 
        this.mediaGoles = mediaGoles;
        this.enExtranjero = enExtranjero;
    }
  
    
}
