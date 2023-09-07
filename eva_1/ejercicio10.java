
package eva.pkg1.eva_1;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String nUsuarioValido = "admin";
        String contraseñaValida = "contraseña";

        int intentosRestantes = 3;

        while (intentosRestantes > 0) {
            System.out.print("Ingrese su nombre de usuario: ");
            String nUsuario = scanner.nextLine();
            System.out.print("Ingrese su contraseña: ");
            String contraseña = scanner.nextLine();

            if (nUsuarioValido.equals(nUsuario) && contraseñaValida.equals(contraseña)) {
                System.out.println("¡Bienvenido al sistema!");
                break;
            }else {
                intentosRestantes--;
                if (intentosRestantes > 0) {
                    System.out.println("Credenciales incorrectas. Intentos restantes: " + intentosRestantes);
                } else {
                    System.out.println("Cuenta bloqueada. Ha excedido el número máximo de intentos.");
                }
            }
        }

        scanner.close();
    }
}
