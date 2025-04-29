package uno;

import uno.logica.Mazo;
import uno.logica.OrdreJugador;
import uno.logica.Pilo;

public class Partida {
    public void Jugar(){
        preparar();
        repartirCartes();
        torn();
    }

    private void preparar(){
        //Crear nou mazo
            Mazo mazo = new Mazo();
        //Crear nou pilo
            Pilo pilo = new Pilo();
        //Cridar metodes de OrdreJugador
            OrdreJugador ordreJugadors = new OrdreJugador();

            ordreJugadors.crearJugador();
            ordreJugadors.barrajarOrdre();
            ordreJugadors.getJugadorActiu();
            ordreJugadors.passarTorn();
        //
    }


    private void repartirCartes(){

    }

    private boolean torn(){
      //  OrdreJugador.getJugadorActiu();
        //si un jugador guanya es true si perd false
        return false;
    }

}
