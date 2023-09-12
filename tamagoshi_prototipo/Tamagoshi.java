package tamagoshi_prototipo;

import java.util.Scanner;

public class Tamagoshi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.print("Elige un nombre para el tamagoshi: ");
        String tamagoshiNombre = scanner.nextLine();
        do {
            System.out.println("1. Comer con "+ tamagoshiNombre);
            System.out.println("2. Dormir con "+tamagoshiNombre);
            System.out.println("3. Salir de programa");
            System.out.print("Que opcion eliges: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1: System.out.println("Comer");
                break;
                case 2: System.out.println("Zzzz");
                break;
                default: System.out.println("Saliendo del programa...");
            }
                    
        }while (opcion < 3);
        scanner.close();
    }
    }