package eva.pkg1.eva_1;

import java.util.Scanner;

public class ejercicio01 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, num3, resultado;
        System.out.print("Ingrese su primera clasificacion: ");
        num1 = scanner.nextDouble();
        System.out.print("Ingrese su segunda clasificacion: ");
        num2 = scanner.nextDouble();
        System.out.print("Ingrese su tercera clasificacion: ");
        num3 = scanner.nextDouble();
        resultado = (num1 + num2 + num3) / 3;
        System.out.println("Su resultado es: " + resultado);
        scanner.close(); 
    }
}
