
package uno;

import uno.interficie.*;
import uno.logica.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //JUGADORS----------------------------
        ArrayList<Jugador> llistaJugador = new ArrayList<Jugador>();

        UI.introduirJugadors();

        //MAZO-----------------------------
        Mazo mazo1 = new Mazo();
        mazo1.barrejar();
        System.out.println("MAZO");
        UI.mostrarCartes(mazo1.getCartes());

        //PILO--------------------------------
        Pilo pilo1 = new Pilo();
        pilo1.getCartes();
        for (int i = 0; i<1; i++){
            pilo1.getCartes().push(mazo1.agafarCarta());
        }
        System.out.println("PILO");
        UI.mostrarCartes(new ArrayList<>(pilo1.getCartes()));

        //Donar les cartes al jugador //En teoria s'ha de canviar perquè li doni una per una
        for (int i = 0; i <= 6; i++){
            for (Jugador j : llistaJugador){
                j.addCarta((mazo1.agafarCarta()));
            }
        }
    }
}
