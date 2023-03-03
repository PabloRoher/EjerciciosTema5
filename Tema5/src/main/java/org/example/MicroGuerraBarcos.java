package org.example;

import java.util.Random;
import java.util.Scanner;

public class MicroGuerraBarcos {
    public static void main(String[] args){
        char tablero[][] = new char[4][4];
        int val = 1;
        Random random = new Random();
        int a = random.nextInt(3);
        int b = random.nextInt(3);
        Scanner teclado = new Scanner(System.in);
        boolean bool = true;

        for (int j = 0; j < 4 ; j++) {
            for (int i = 0; i < 4; i++) {
                tablero[j][i] = "?".charAt(0);
                System.out.print(tablero[j][i]);
            }
            System.out.println();
        }
        do {
            System.out.println("¿Que columna?");
            int columna = teclado.nextInt() - 1;

            System.out.println("¿Que fila?");
            int fila = teclado.nextInt() - 1;
            if (columna == a && fila == b){
                System.out.println("Tocado y hundido\n" + "Ha ganado");
                bool = false;
            }else {
                for (int j = 0; j < 4 ; j++) {
                    for (int i = 0; i < 4; i++) {
                        tablero[fila][columna] = "-".charAt(0);
                        System.out.print(tablero[j][i]);
                    }
                    System.out.println();
                }
            }


        }while (bool);
    }
}
