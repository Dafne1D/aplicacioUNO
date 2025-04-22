package uno.logica;

import java.util.ArrayList;

public class Jugador {


    private String nom;
    public ArrayList<Carta> cartes; //

    public Jugador(String nomJugador){
        nom = nomJugador;
        cartes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }
    public ArrayList<Carta> getCartes() {
        return cartes;
    }

    public void addCarta(Carta carta){
        cartes.add(carta);
    }

    public void tirarCarta(Pilo pilo, Carta carta){
        pilo.getCartes().push(carta);
        cartes.remove(carta);
    }
}
