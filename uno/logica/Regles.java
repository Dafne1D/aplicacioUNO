package uno.logica;

public class Regles {
    public boolean sonCompatibles(Carta carta, Carta carta2){
        boolean colorsIguals = carta.getColor() == carta2.getColor();
        boolean numsIguals = carta.getNumero() == carta2.getNumero();

        return colorsIguals || numsIguals;

    }
}
