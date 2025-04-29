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

    public void tirarCarta(Pilo pilo, Carta carta){
        pilo.getCartes().push(carta);
        cartes.remove(carta);
    }

    public void robarCarta (Mazo mazo){
        if (!mazo.getCartes().isEmpty()){
            cartes.add(mazo.agafarCarta());
        }
    }

    public int nombreCartes(){
        return cartes.size();
    }

    public boolean potTirarCarta(Pilo pilo){
        boolean potTirar = false;
        Carta ultimaCarta = pilo.consultarCarta();
        for (Carta carta : cartes){
            if (Regles.sonCompatibles(carta, ultimaCarta)){
                potTirar = true;
            }
        }
        return potTirar;
    }

}
