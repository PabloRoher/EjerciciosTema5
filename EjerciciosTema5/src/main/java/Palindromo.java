import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        String palabra2 = "";
        do {
            System.out.println("Escriba una palabra y después #");
            Scanner teclado1 = new Scanner(System.in);
            palabra2 = teclado1.nextLine();
            String palabra = palabra2.toLowerCase();
            String caracterEspecial = String.valueOf(palabra.charAt(palabra.length()-1));

            if (caracterEspecial.equals("#")){
                String palabraInvertida = "";
                for (int i = palabra.length() - 2; i >= 0; i--) {
                    palabraInvertida += palabra.charAt(i);
                    System.out.println(palabraInvertida);
                }
                if (palabra.substring(0,palabra.length()-1).equals(palabraInvertida)) {
                    System.out.println(palabra + " es un palíndromo.");
                } else {
                    System.out.println(palabra + " no es un palíndromo.");
                }
            }else{
                System.out.println("Debes colocar el simbolo # al final de la palabra");
            }

        }while (true);
    }
}
