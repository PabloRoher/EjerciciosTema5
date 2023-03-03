package org.example;

import javax.management.ObjectName;
import java.util.HashMap;
import java.util.Scanner;

public class RegistroDeEmpleados {
    public static void main(String[] args) {
        HashMap<String, HashMap<String, Object>> empleados = new HashMap<>();
        int numEmpleados = 0;
        boolean bool = true;

        while (bool) {

            System.out.println("Que quieres hacer?");
            System.out.println("1 - Añadir un empleado");
            System.out.println("2 - Acceder a los datos de un empleado");
            System.out.println("3 - Salir");
            Scanner teclado0 = new Scanner(System.in);
            int opcion0 = teclado0.nextInt();

            switch (opcion0) {
                case 1:
                    System.out.println("¿Cual es el nombre del empleado?");
                    Scanner teclado1 = new Scanner(System.in);
                    String nom = teclado1.nextLine();
                    System.out.println("¿Cual es el numero de empleado?");
                    String numeroDeEmpleado = teclado1.nextLine();
                    System.out.println("¿Cual es el numero de seguridad social?");
                    String numeroSeguridadSocial = teclado1.nextLine();

                    empleados.put(nom, new HashMap<>());
                    empleados.get(nom).put("NumeroDeEmpleado", numeroDeEmpleado);
                    empleados.get(nom).put("NumeroSeguridadSocial", numeroSeguridadSocial);
                    break;
                case 2:
                    System.out.println("¿A traves de que dato quieres acceder a los datos del empleado?");
                    System.out.println("1 - Nombre");
                    System.out.println("2 - Numero de empleado");
                    System.out.println("3 - Numero de seguridad social");
                    Scanner teclado = new Scanner(System.in);
                    int opcion = teclado.nextInt();

                    switch (opcion) {
                        case 1:
                            System.out.println("¿Cual es el nombre del empleado?");
                            Scanner teclado3 = new Scanner(System.in);
                            String nombre = teclado3.nextLine();
                            System.out.println("Nombre: " + nombre);
                            System.out.println("Numero de empleado: " + empleados.get(nombre).get("NumeroDeEmpleado"));
                            System.out.println("Numero de seguridad social: " + empleados.get(nombre).get("NumeroSeguridadSocial"));
                            break;
                        case 2:
                            System.out.println("¿Cual es el numero de empleado?");
                            Scanner teclado5 = new Scanner(System.in);
                            int numeroDeEmpleadoBuscar = teclado5.nextInt();
                            for (String nombre1 : empleados.keySet()) {
                                HashMap<String, Object> empleado1 = empleados.get(nombre1);
                                if (empleado1.get("NumeroDeEmpleado").equals(String.valueOf(numeroDeEmpleadoBuscar))) {
                                    System.out.println("Nombre: " + nombre1);
                                    System.out.println("Numero de empleado: " + empleado1.get("NumeroDeEmpleado"));
                                    System.out.println("Numero de seguridad social: " + empleado1.get("NumeroSeguridadSocial"));
                                }
                            }
                            break;
                        case 3:
                            System.out.println("¿Cual es el numero de seguridad social?");
                            Scanner teclado4 = new Scanner(System.in);
                            String numeroSeguridadSocialBuscar = teclado4.nextLine();
                            for (String nombre1 : empleados.keySet()) {
                                HashMap<String, Object> empleado = empleados.get(nombre1);
                                if (empleado.get("NumeroSeguridadSocial").equals(numeroSeguridadSocialBuscar)) {
                                    System.out.println("Nombre: " + nombre1);
                                    System.out.println("Numero de empleado: " + empleado.get("NumeroDeEmpleado"));
                                    System.out.println("Numero de seguridad social: " + empleado.get("NumeroSeguridadSocial"));
                                }
                            }
                            break;
                    }
                    break;
                case 3:
                    bool = false;
                    break;
            }
        }
    }
}
