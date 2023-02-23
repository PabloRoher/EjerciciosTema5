import java.util.Scanner;

public class MaquinaDeVotar {
    public static void main(String[] args){
        System.out.println("Ejemplo de ejecución del algoritmo: ");
        Scanner teclado1 = new Scanner(System.in);
        int e = 0;
        int g = 0;
        int m = 0;
        int n = 0;
        int total = 0;
        boolean boo = true;

        do {

            System.out.println("Elija entre:");
            System.out.println("1 - Emilia TERREROS");
            System.out.println("2 - Gerardo ESCODAR");
            System.out.println("3 - María AGUAVIVA");
            System.out.println("4 - Nadia LETUX");
            int votacion = teclado1.nextInt();

            if (votacion == 68753421){
                boo = false;
                System.out.println("Resultados: ");
                System.out.println("Emilia TERREROS: " + Math.round(((double)e*100/total) * 100.0) / 100.0 + " %");
                System.out.println("Gerardo ESCODAR: " + Math.round(((double)g*100/total) * 100.0) / 100.0 + " %");
                System.out.println("María AGUAVIVA: " + Math.round(((double)m*100/total) * 100.0) / 100.0 + " %");
                System.out.println("Nadia LETUX: " + Math.round(((double)n*100/total) * 100.0) / 100.0 + " %");
            }else {
                switch (votacion){
                    case 1:
                        e += 1;
                        total += 1;
                        break;
                    case 2:
                        g += 1;
                        total += 1;
                        break;
                    case 3:
                        m += 1;
                        total += 1;
                        break;
                    case 4:
                        n += 1;
                        total += 1;
                        break;

                }
            }


        }while (boo);
    }
}
