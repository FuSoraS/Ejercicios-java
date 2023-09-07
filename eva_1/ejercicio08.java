package eva.pkg1.eva_1;

import java.util.Scanner;

public class ejercicio08 {

    public static void main(String args[]) {
    Scanner Ingreso = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = Ingreso.nextInt();
            
        if (num % 3 == 0){
            int xuan = 0;
            while (xuan < num + 1) {
                System.out.println(xuan);
                xuan++;
            }
        } else {
            System.out.println("No es multiplo de 3");
        }
    }
   }
