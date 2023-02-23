import java.util.Scanner;

public class NumeroOcurrencias {
    public static void main(String[] args) {
        int[] frecuencia = new int[10];
        Scanner teclado1 = new Scanner(System.in);
        System.out.println("Indicar un valor comprendido entre 0 y 9 o -1 para terminar: ");

        int numero;
        do {
            numero = teclado1.nextInt();

            if(numero >= 0 && numero <= 9) {
                frecuencia[numero]++;
            }
        } while(numero != -1);
        
        System.out.println("Frecuencia de cada dígito:");
        for(int i = 0; i < frecuencia.length; i++) {
            System.out.println("Cantidad de " + i + ": " + frecuencia[i]);
        }
    }
}
