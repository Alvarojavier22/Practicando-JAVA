package Ejercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ListaNumeros listaNumeros = new ListaNumeros();
        Scanner scanner = new Scanner(System.in);
        int option;

        do{
            System.out.println("\n--- Lista de números ---");
            System.out.println("1. Agregar números");
            System.out.println("2. Ordenar lista");
            System.out.println("3. Mostrar lista");
            System.out.println("4. Salir");
            System.out.println("Elija una opción: ");
            option = scanner.nextInt();

            switch(option){
                case 1:
                    System.out.println("Ingresa el número a agregar: ");
                    int numero = scanner.nextInt();
                    listaNumeros.agregarNumero(numero);
                    break;
                case 2:
                    listaNumeros.ordenarNumeros();
                    System.out.println("Lista ordenada.");
                    break;
                case 3:
                    listaNumeros.mostrarNumeros();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        }while (option != 4);
        scanner.close();
    }
}
