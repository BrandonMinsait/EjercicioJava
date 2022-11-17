package ejercicio;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Retiro {
    
    void retirarDinero(double retiro){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        double saldoFin = Consulta.saldo - retiro;
        if(saldoFin < 0){
            System.err.println("\n\tSaldo insuficiente para realizar la operacion (Saldo actual: $"+Consulta.saldo+".");
        }else{
            Consulta.saldo = saldoFin;
            String dia = dtf.format(LocalDateTime.now());
            String fecha = dia.substring(0, 10);
            String hora = dia.substring(11, 19);
            ArrayList<String> lista=new ArrayList<String>();
            lista.add(fecha);
            lista.add(hora);
            switch((""+retiro).toString().length()){
                case 3:
                    lista.add("$   "+retiro);
                    break;
                case 4:
                    lista.add("$  "+retiro);
                    break;
                case 5:
                    lista.add("$ "+retiro);
                    break;
                case 6:
                    lista.add("$"+retiro);
                    break;
            }
            Movimientos.movimientos.add(lista);
            System.out.println("\n\tSaldo actual: $"+Consulta.saldo+".");
        }
    }
    
}
