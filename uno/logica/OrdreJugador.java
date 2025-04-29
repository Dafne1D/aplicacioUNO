package uno.logica;

import uno.interficie.UI;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class OrdreJugador {
    private int jugadorActiu;
    private ArrayList<Jugador> jugadors;
    private ArrayList<String> nomsJugadors = UI.introduirJugadors();

    public OrdreJugador(){
        jugadors = new ArrayList<>();
        this.jugadorActiu = 0;
    }

    public void crearJugador(){
        for (int i = 0; i<nomsJugadors.size(); i++){
            String nom = nomsJugadors.get(i);
            Jugador nouJugador = new Jugador(nom);
        }
    }

    public void barrajarOrdre(){
       Collections.shuffle(nomsJugadors);
    }

    public String getJugadorActiu(){
        return nomsJugadors.get(jugadorActiu);
    }

    public void passarTorn(){

    }
}
