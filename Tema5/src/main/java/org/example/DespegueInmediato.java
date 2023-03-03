package org.example;

public class DespegueInmediato {
    public static void main(String[] args){

        int[] n = new int[11];

        for(int i = 0; i <= 10; i++) {
            n[i] = 10 - i;
        }

        for (int i = 0; i < n.length ; i++) {
            System.out.println("La autodestrucción sera en: " + n[i] + " s");
        }

        System.out.println("pum");


    }
}
