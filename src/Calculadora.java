
import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);

    public static void sumar() {
        double num1 = 0;
        do{
        try {
            System.out.print("Introduce el primer sumando: ");
            String aux = sc.nextLine();
            num1 = Double.parseDouble(aux);
        } catch (java.util.InputMismatchException | java.lang.NumberFormatException e) {
            sc.nextLine();
            System.out.println("El caracter introducido no es valido");
        }
    }while(num1==0);
        double num2 = 0;
        do {
            try {
                System.out.print("Introduce el segundo sumando: ");
                String aux = sc.nextLine();
                num2 = Double.parseDouble(aux);
            } catch (java.util.InputMismatchException | java.lang.NumberFormatException e) {
                sc.nextLine();
                System.out.println("El caracter introducido no es valido");
            }
        }while (num2==0);
        System.out.println("La suma resulta en: "+num1+num2);
    }

    public static void restar() {
        double num1 = 0;
        do{
            try {
                System.out.print("Introduce el minuendo: ");
                String aux = sc.nextLine();
                num1 = Double.parseDouble(aux);
            } catch (java.util.InputMismatchException | java.lang.NumberFormatException e) {
                sc.nextLine();
                System.out.println("El caracter introducido no es valido");
            }
        }while(num1==0);
        double num2 = 0;
        do {
            try {
                System.out.print("Introduce el sustraendo: ");
                String aux = sc.nextLine();
                num2 = Double.parseDouble(aux);
            } catch (java.util.InputMismatchException | java.lang.NumberFormatException e) {
                sc.nextLine();
                System.out.println("El caracter introducido no es valido");
            }
        }while (num2==0);

    }

    public static void multiplicar() {
        double num1 = 0;
        do{
            try {
                System.out.print("Introduce el primer factor: ");
                String aux = sc.nextLine();
                num1 = Double.parseDouble(aux);
            } catch (java.util.InputMismatchException | java.lang.NumberFormatException e) {
                sc.nextLine();
                System.out.println("El caracter introducido no es valido");
            }
        }while(num1==0);
        double num2 = 0;
        do {
            try {
                System.out.print("Introduce el segundo factor: ");
                String aux = sc.nextLine();
                num2 = Double.parseDouble(aux);
            } catch (java.util.InputMismatchException | java.lang.NumberFormatException e) {
                sc.nextLine();
                System.out.println("El caracter introducido no es valido");
            }
        }while (num2==0);

    }

    public static void dividir() {
        double num1 = 0;
        do{
            try {
                System.out.print("Introduce el dividendo: ");
                String aux = sc.nextLine();
                num1 = Double.parseDouble(aux);
            } catch (java.util.InputMismatchException | java.lang.NumberFormatException e) {
                sc.nextLine();
                System.out.println("El caracter introducido no es valido");
            }
        }while(num1==0);
        double num2 = 0;
        do {
            try {
                System.out.print("Introduce el divisor: ");
                String aux = sc.nextLine();
                num2 = Double.parseDouble(aux);
            } catch (java.util.InputMismatchException | java.lang.NumberFormatException e) {
                sc.nextLine();
                System.out.println("El caracter introducido no es valido");
            }
        }while (num2==0);

    }

}

