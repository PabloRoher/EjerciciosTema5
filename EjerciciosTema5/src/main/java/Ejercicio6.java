public class Ejercicio6 {
    public static void main(String[] args){

        int tamano = 4;
        int i,j;
        int tab2d[][] = new int[tamano][tamano];


        for (j = 0; j < tamano ; j++) {
            for (i = 0; i < tamano ; i++) {
                tab2d[j][i] = j + 1 + (4 * i);
                System.out.print(tab2d[j][i]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}
