package eva.pkg1.eva_1;

import java.util.Scanner;

public class ejercicio03 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        System.out.println("Ingrese su edad: ");
        edad = scanner.nextInt();
        if (edad >= 18) {
            System.out.println("Eres mayor de edad");
        } else {
            System.out.println("Eres menor de edad.");
}
    }
}
