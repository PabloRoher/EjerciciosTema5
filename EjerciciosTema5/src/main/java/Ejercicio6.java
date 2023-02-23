public class Ejercicio6 {
    public static void main(String[] args){

        int tamano = 4;
        int i,j;
        int tab2d[][] = new int[tamano][tamano];
        int val = 1;

        for (j = 0; j < tamano ; j++) {
            for (i = 0; i < tamano ; i++) {
                if (i == 0){
                    tab2d[j][i] = j;
                    val = j;
                }else {
                    val +=  1;
                    tab2d[j][i] = val;

                }

                System.out.print(tab2d[j][i]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
