package eva.pkg1.eva_1;

import java.util.Scanner;


public class ejercicio06 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int año;
        System.out.println("Ingrese su año: ");
        año = scanner.nextInt();

        boolean Bisiesto = (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
 
        if (Bisiesto) {
            System.out.println(" es un año bisiesto.");
        } else {
            System.out.println(" no es un año bisiesto.");
        }

        }    
}
