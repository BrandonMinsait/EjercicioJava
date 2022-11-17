package ejercicio;

import java.util.Scanner;

public class Menu {

    Mensajes mensajes = new Mensajes();
    Scanner scan = new Scanner(System.in);
    Consulta consulta = new Consulta();
    Retiro retiro = new Retiro();
    Movimientos movimientos = new Movimientos();

    void menuPrincipal() {
        String opcion = "";
        Integer opc = 0;
        do {
            for (String menuImp : mensajes.menu) {
                System.out.println("\t\t\t\t" + menuImp);
            }
            System.out.println("\n\t\t\t\tEscoge una opcion para continuar: ");
            try {
                opcion = scan.next();
                opc = new Integer(opcion);
                switch (opc) {
                    case 1:
                        System.out.println("\n\t\t\t\tSu saldo actual es de: $" + consulta.consultaSaldo());
                        if (!volverMenu()) {
                            opc = 4;
                        }
                        break;
                    case 2:
                        System.out.println("\n\t\t\t\t¿Cuanto dinero quieres retirar?");
                        double retirar = scan.nextDouble();
                        retiro.retirarDinero(retirar);
                        if (!volverMenu()) {
                            opc = 4;
                        }
                        break;
                    case 3:
                        movimientos.imprimirMovimientos();
                        if (!volverMenu()) {
                            opc = 4;
                        }
                        break;
                    case 4:
                        opc = 4;
                        break;
                    default:
                        throw new Exception();
                }
            } catch (Exception e) {
                System.err.println("\n\t\t\tNo se ha escogido una opcion valida. Volviendo al menu...");
            }
        } while (opc < 4);
        System.out.println("\n\n\t\t\t\tHasta pronto.");
    }

    boolean volverMenu() {
        do {
            System.out.println("\n\n\t\t\t¿Desea volver al menu principal [1.- Si / 2.- No]");
            String menuP = scan.next();
            Integer opc = 0;
            try {
                opc = new Integer(menuP);
            } catch (NumberFormatException e) {
                System.err.println("\n\t\t\t\tNo se ha escogido una opcion valida.");
            } finally {
                if (opc != 0) {
                    switch (opc) {
                        case 1:
                            return true;
                        case 2:
                            return false;
                        default:
                            System.err.println("\n\t\t\t\tNo se ha escogido una opcion valida.");
                            break;
                    }
                }
            }
        } while (true);
    }
}
