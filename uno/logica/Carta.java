package uno.logica;


public class Carta {

    public enum Colors{
        vermell,
        groc,
        blau,
        verd
    }
    private Colors ColorCarta;
    private int NumeroCarta;

    //Constructor
    public Carta ( int NumCarta, Colors color){
        NumeroCarta = NumCarta;
        ColorCarta = color;
    }

    public int getNumero(){
        return NumeroCarta;
    }

    public Colors getColor(){
        return ColorCarta;
    }
}