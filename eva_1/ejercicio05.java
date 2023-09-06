package eva.pkg1.eva_1;

import java.util.Scanner;

public class ejercicio05 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num1;
        System.out.println("Ingrese su numero");
        num1 = scanner.nextInt();
        if (num1 % 2 == 0) {
            System.out.println("El numero es par");
        }else {
            System.out.println("Es impar");
        }
    }
}
