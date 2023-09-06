package eva.pkg1.eva_1;

import java.util.Scanner;

public class ejercicio02 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double pregunta1, resultado;
        System.out.print("Ingrese sus grados Celsius: ");
        pregunta1 = scanner.nextDouble();
        resultado = (pregunta1 *9/5 + 32);
        System.out.println("Los resultados son:" + resultado);
    }
}
