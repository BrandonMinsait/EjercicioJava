package ejercicio;

import java.util.ArrayList;
import java.util.List;

public class Movimientos {
    
    protected static List<ArrayList<String>> movimientos = new ArrayList<ArrayList<String>>();
    
    void imprimirMovimientos(){
        System.out.println("\t\t\t***********************************");
        System.out.println("\t\t\t*            *          *         *");
        System.out.println("\t\t\t*    Fecha   *   Hora   *  Monto  *");
        System.out.println("\t\t\t*            *          *         *");
        System.out.println("\t\t\t***********************************");
        System.out.println("\t\t\t*            *          *         *");
        for(ArrayList<String> mov : movimientos){
            String movimiento = "";
            for(String datos : mov){
                movimiento = movimiento + "* " + datos + " ";
            }
            movimiento = movimiento + "*";
            System.out.println("\t\t\t"+movimiento);
        }
        System.out.println("\t\t\t*            *          *         *");
        System.out.println("\t\t\t***********************************");
    }
    
}
