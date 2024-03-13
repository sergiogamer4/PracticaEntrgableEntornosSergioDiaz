
import java.util.Scanner;

public class Calculadora {
    static Scanner sc = new Scanner(System.in);

    /**
     * Metodo que se encarga de sumar dos numeros que se introduzcan
     */
    public static double sumar(double num1, double num2) {
        return (num1 + num2);
    }

    /**
     * Metodo que se encarga de restar dos numeros que se introduzcan
     */
    public static double restar(double num1, double num2) {
        return (num1 - num2);
    }

    /**
     * Metodo que se encarga de multiplicar dos numeros que se introduzcan
     */
    public static double multiplicar(double num1, double num2) {
        return (num1 * num2);
    }

    /**
     * Metodo que se encarga de dividir dos numeros que se introduzcan
     */
    public static double dividir(double num1, double num2) {
        if (num2 == 0) {
            return 0;
        } else {
            return (num1 / num2);
        }
    }

}

