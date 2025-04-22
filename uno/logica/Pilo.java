
package uno.logica;

import java.util.Stack;

public class Pilo {

    private Stack<Carta> cartes = new Stack<>();

    public Stack<Carta> getCartes (){
        return(cartes);
    }

    public Carta agafarCarta(){
        return cartes.pop();
    }

    public void addCarta(Carta carta){
        cartes.add(carta);
    }
    public Carta consultarCarta(){
        return cartes.peek();
    }

}
