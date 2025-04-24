package uno.interficie;

import java.util.ArrayList;
import uno.logica.*;
import java.util.Scanner;
public class UI {
    // ANSI escape codes
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";

    private static String pintarCarta(Carta carta) {
        String color = "";
        switch (carta.getColor()) {
            case Carta.Colors.groc:
                color = YELLOW;
                break;
            case Carta.Colors.vermell:
                color = RED;
                break;
            case Carta.Colors.blau:
                color = BLUE;
                break;
            case Carta.Colors.verd:
                color = GREEN;
                break;
            default:
                break;
        }

        String cartaPintada = String.format("""
            %s┌─────────┐%s
            %s│ %d       │%s
            %s│         │%s
            %s│   UNO   │%s
            %s│         │%s
            %s│       %d │%s
            %s└─────────┘%s""",
                color, RESET,
                color, carta.getNumero(), RESET,
                color, RESET,
                color, RESET,
                color, RESET,
                color, carta.getNumero(), RESET,
                color, RESET);


        return cartaPintada;
    }

    public static void mostrarCarta(Carta carta) {
        System.out.println(pintarCarta(carta));
    }

    public static void mostrarCartes(ArrayList<Carta> cartes) {
        int quantitat = cartes.size();
        String[][] cartesPintades = new String[quantitat][];

        for (int i = 0; i < quantitat; i++) {
            cartesPintades[i] = pintarCarta(cartes.get(i)).split("\n");
        }

        int altura = cartesPintades[0].length;

        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < quantitat; j++) {
                System.out.print(cartesPintades[j][i] + "  ");
            }
            System.out.println();
        }
        System.out.print("   ");
        for (int j = 0; j < quantitat; j++) {
            if (j+1<10) {
                System.out.print("(" + (j+1) +")          ");
            }
            else {
                System.out.print("(" + (j+1) +")         ");
            }
        }

        System.out.println();
    }
    public static ArrayList<String> introduirJugadors() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Quantes persones jugaran?");
        int quantitatJugadors = myObj.nextInt();
        myObj.nextLine();

        ArrayList<String> arrayJugadors = new ArrayList<>();

        for (int i = 0; i < quantitatJugadors; i++) {
            System.out.println(i);
            arrayJugadors.add(myObj.nextLine());
        }
        return arrayJugadors;
    }
}

