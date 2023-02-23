public class Ejercicio6 {
    public static void main(String[] args){
        /*
        Constante TAMAÑO       : entero <- 3
        Variable i, j, val: entero
        Variable tab2d: entero[TAMAÑO][TAMAÑO]
        Inicio
        val <- 1
        Para j <- 0 a TAMAÑO - 1
        Para i <- 0 a TAMAÑO - 1
        tab2d[j][i] <- val
        val <- val + 1

         */

        int tamano = 3;
        int i,j;
        int tab2d[][] = new int[tamano][tamano];
        int val = 1;

        for (j = 0; j < tamano - 1; j++) {
            for (i = 0; i < tamano - 1; i++) {
                tab2d[j][i] = val;
                val = val + 1;
                System.out.print(tab2d[j][i]);
            }
            System.out.println();
        }

    }
}
