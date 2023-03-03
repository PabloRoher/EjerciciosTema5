package org.example;

import java.util.Scanner;

public class TresEnraya {

    char[][] tablero = new char[3][3];
    private char jugadorActual;

    public TresEnraya() {
        jugadorActual = 'X';
        inicializarTablero();
    }

    private void inicializarTablero() {
        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                tablero[fila][columna] = ' ';
            }
        }
    }

    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        boolean ganador = false;
        int fila, columna;

        while (!ganador) {
            System.out.println("Es el turno del jugador " + jugadorActual + ". Introduce las coordenadas (fila,columna) para tu jugada:");
            fila = scanner.nextInt() - 1;
            columna = scanner.nextInt() - 1;

            if (fila < 0 || fila > 2 || columna < 0 || columna > 2) {
                System.out.println("Coordenadas inválidas. Inténtalo de nuevo.");
            } else if (tablero[fila][columna] != ' ') {
                System.out.println("Esa casilla ya está ocupada. Inténtalo de nuevo.");
            } else {
                tablero[fila][columna] = jugadorActual;
                mostrarTablero();

                if (hayGanador()) {
                    System.out.println("¡El jugador " + jugadorActual + " ha ganado!");
                    ganador = true;
                } else if (hayEmpate()) {
                    System.out.println("¡Empate!");
                    ganador = true;
                } else {
                    cambiarJugador();
                }
            }
        }
    }

    private void cambiarJugador() {
        if (jugadorActual == 'X') {
            jugadorActual = 'O';
        } else {
            jugadorActual = 'X';
        }
    }

    private boolean hayGanador() {
        // Comprobar filas
        for (int fila = 0; fila < 3; fila++) {
            if (tablero[fila][0] == jugadorActual && tablero[fila][1] == jugadorActual && tablero[fila][2] == jugadorActual) {
                return true;
            }
        }

        // Comprobar columnas
        for (int columna = 0; columna < 3; columna++) {
            if (tablero[0][columna] == jugadorActual && tablero[1][columna] == jugadorActual && tablero[2][columna] == jugadorActual) {
                return true;
            }
        }

        // Comprobar diagonales
        if (tablero[0][0] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][2] == jugadorActual) {
            return true;
        }
        if (tablero[0][2] == jugadorActual && tablero[1][1] == jugadorActual && tablero[2][0] == jugadorActual) {
            return true;
        }

        return false;
    }

    public boolean hayEmpate() {

        for (int fila = 0; fila < 3; fila++) {
            for (int columna = 0; columna < 3; columna++) {
                if (tablero[fila][columna] == ' ') {
                    return false;
                }
            }
        }
        return true; // No quedan celdas vacías
    }


    public static void main(String[] args) {
        TresEnraya tresEnraya = new TresEnraya();
        tresEnraya.mostrarTablero();

        tresEnraya.jugar();

    }

}
