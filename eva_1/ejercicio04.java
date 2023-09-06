package eva.pkg1.eva_1;

import java.util.Scanner;

public class ejercicio04 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Ingrese su primer numero");
        num1 = scanner.nextInt();
        System.out.println("Ingrese su segundo numero");
        num2 = scanner.nextInt();
        System.out.println("Ingrese su tercer numero");
        num3 = scanner.nextInt();
        int numMax = Math.max(num1, Math.max(num2, num3));
        System.out.println("Numero maximo: "+numMax);
    }
}
