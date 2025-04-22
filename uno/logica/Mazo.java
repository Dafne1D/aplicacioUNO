
package uno.logica;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Collections;


public class Mazo {
    //Crear les cartes---------------------------------------------
    private Stack<Carta> cartes = new Stack<>();

    //constructor--------------------------------------------------
    public Mazo(){
        for (Carta.Colors colors : Carta.Colors.values()){
            cartes.push(new Carta(0, colors));
            for (int i = 1; i <=9; i++){
                cartes.push(new Carta(i, colors));
                cartes.push(new Carta(i, colors));
            }
        }
    }

    public ArrayList<Carta> getCartes (){
        return new ArrayList<>(cartes);
    }

    public void barrejar(){
        Collections.shuffle(cartes);
    }

    public Carta agafarCarta(){
        return cartes.pop();
    }

    public void reiniciar(Pilo pilo){
        Carta ultimaCarta;
        ultimaCarta = pilo.agafarCarta();
        while (!pilo.getCartes().empty()){
            //agafar les cartes del pilo fent pop mentres getCartes de pilo no estigui vuit i posar-les a mazo.getCartes
            cartes.push(pilo.agafarCarta());
        }
        pilo.addCarta(ultimaCarta);
    }
}
