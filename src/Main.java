//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    /**
     * Metodo principal, se encarga de inicializar metodos de la clase Calculadora
     * dependiendo de la opcion elegida por el usuario y los numeros necesarios para
     * el funcionamiento de estos
     */
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
                    double num1 = elegirNum();
                    double num2 = elegirNum();
                    System.out.println(Calculadora.sumar(num1, num2));
                    break;
                case "2":
                    double num3 = elegirNum();
                    double num4 = elegirNum();
                    System.out.println(Calculadora.restar(num3, num4));
                    break;
                case "3":
                    double num5 = elegirNum();
                    double num6 = elegirNum();
                    System.out.println(Calculadora.multiplicar(num5, num6));
                    break;
                case "4":
                    double num7 = elegirNum();
                    double num8 = elegirNum();
                    System.out.println(Calculadora.dividir(num7, num8));
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
                case "0":
                    System.out.println("Saliendo");
            }
        } while (!"0".equals(opcion));
    }

    public static double elegirNum() {
        double num1 = 0;
        do {
            try {
                System.out.print("Introduce el numero: ");
                String aux = sc.nextLine();
                num1 = Double.parseDouble(aux);
            } catch (java.util.InputMismatchException | java.lang.NumberFormatException e) {
                sc.nextLine();
                System.out.println("El caracter introducido no es valido");
            }
        } while (num1 == 0);
        return num1;
    }
}
