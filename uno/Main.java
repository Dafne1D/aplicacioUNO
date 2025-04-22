
package uno;

import uno.interficie.*;
import uno.logica.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Jugador> llistaJugador = new ArrayList<Jugador>();

        Jugador j1 = new Jugador("Jugador 1");
        llistaJugador.add(j1);
        Jugador j2 = new Jugador ("Jugador 2");
        llistaJugador.add(j2);

        Mazo mazo1 = new Mazo();
        mazo1.barrejar();
        Pilo pilo1 = new Pilo();
        pilo1.getCartes();
        for (int i = 0; i<38; i++){
            pilo1.getCartes().push(mazo1.agafarCarta());
        }
        System.out.println("PILO");

        UI.mostrarCartes(new ArrayList<>(pilo1.getCartes()));
        System.out.println("MAZO");

        UI.mostrarCartes(mazo1.getCartes());

        for (int i = 0; i <= 6; i++){
            for (Jugador j : llistaJugador){
                j.addCarta((mazo1.agafarCarta()));
            }
        }

        System.out.println("Jugador 1 mà");
        UI.mostrarCartes(j1.getCartes());

    }

}
