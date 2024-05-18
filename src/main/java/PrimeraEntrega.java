import java.util.Scanner;

public class PrimeraEntrega {
    public static void main (String[] arg){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingresa un número decimal, ej: 21,24: ");
        double numero = scanner.nextDouble();
        int parteEntera = (int) numero;

        //
        String parteDecimal = String.valueOf(numero).split("\\.")[1];

        System.out.println("Parte entera: " + parteEntera);
        System.out.println("Parte decimal: " + parteDecimal);
    }
}
