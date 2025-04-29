package uno;

import uno.interficie.UI;
import uno.logica.Mazo;
import uno.logica.OrdreJugador;
import uno.logica.Pilo;

import java.util.ArrayList;

public class Partida {
    int quantitatJugadors;
    OrdreJugador ordreJugadors = new OrdreJugador();
    //Crear nou mazo
    Mazo mazo = new Mazo();
    //Crear nou pilo
    Pilo pilo = new Pilo();

    public void Jugar(){
        preparar();
        repartirCartes();
        torn();
    }

    private void preparar(){
        ArrayList<String>nomsJugadors = UI.introduirJugadors();

        //Cridar metodes de OrdreJugador


            ordreJugadors.crearJugador();
            ordreJugadors.barrajarOrdre();
            ordreJugadors.getJugadorActiu();
            ordreJugadors.passarTorn();

            quantitatJugadors = nomsJugadors.size();

            while(!noGuanya){
                Jugar();
            }
    }


    private void repartirCartes(){
        for(int i = 0; i < quantitatJugadors*7; i++){
            ordreJugadors.getJugadorActiu().robarCarta(mazo);
            ordreJugadors.passarTorn();
        }
    }

    private boolean torn(){
        ordreJugadors.getJugadorActiu();
    }

}
