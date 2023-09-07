
package eva.pkg1.eva_1;

import java.util.Scanner;


public class ejercicio09 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Ingrese su numero: ");
            int num1 = scanner.nextInt();
            if (num1 <= -1){
            System.out.println("No puede ingresar numero negativos");

                break;
            }else{
                System.out.println("-----------");
            }
            }
}
}
