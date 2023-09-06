
package eva.pkg1.eva_1;

import java.util.Scanner;

public class ejercicio07 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();
        
        System.out.println("Tabla de multiplicar de " + numero + ":");
        
        int fu = 1;
        while (fu <= 12) {
            int resultado = numero * fu;
            System.out.println(numero + " x " + fu + " = " + resultado);
            fu++;
        }
        
        scanner.close();
    }
}
