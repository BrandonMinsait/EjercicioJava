package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        Mensajes mensajes = new Mensajes();
        Nip pass = new Nip();
        Menu menu = new Menu();
        int intentos = 1;

        for (String bancoImp : mensajes.banco) {
            System.out.println("\t\t\t\t" + bancoImp);
        }

        System.out.println("\n\t\t\t\t\tBienvenido");
        System.out.println("\n\t\t\t\tIntroduce tu NIP para continuar: ");
        do {
            try {
                String nipStr = scan.next();
                Integer nip = new Integer(nipStr);
                if (pass.verificarNIP(nip)) {
                    menu.menuPrincipal();
                } else {
                    throw new Exception();
                }
            } catch (NumberFormatException e) {
                System.err.println("\n\t\t\t\tNo se ha introducido un numero");
                System.out.println("\n\t\t\t\tIntentos restantes: " + (3 - intentos));
                intentos++;
            } catch (Exception e) {
                System.err.println("\n\t\t\t\tNIP incorrecto");
                System.out.println("\n\t\t\t\tIntentos restantes: " + (3 - intentos));
                intentos++;
            } finally {
                if (intentos == 4) {
                    System.out.println("\n\t\t\t\tNumero de intentos excedido");
                }
            }
        } while ((intentos < 4) && (intentos != 1));

    }

}
