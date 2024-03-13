//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String opcion;
        do {
            System.out.println("La calculadora tiene las siguientes opciones:");
            System.out.println("1.- Sumar");
            System.out.println("2.- Restar");
            System.out.println("3.- Multiplicar");
            System.out.println("4.- Dividir");
            System.out.println("0.- Salir");
            System.out.println("¿Qué opción quieres realizar?:");
            opcion = sc.nextLine().trim();
            switch (opcion) {
                case "1":
                    Calculadora.sumar();
                case "2":
                    Calculadora.restar();
                case "3":
                    Calculadora.multiplicar();
                    break;
                case "4":
                    Calculadora.dividir();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
                case "0":
                    System.out.println("Buenas tardes");
            }
        } while (!"0".equals(opcion));
    }
}
