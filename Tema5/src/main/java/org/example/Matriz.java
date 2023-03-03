package org.example;

import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
        Random random = new Random();
        char[][] tabla = new char[20][30];
        
        for (int fila = 0; fila < tabla.length; fila++) {
            for (int columna = 0; columna < tabla[fila].length; columna++) {
                tabla[fila][columna] = (char) (random.nextInt(26) + 'a');
            }
        }
        
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
}
