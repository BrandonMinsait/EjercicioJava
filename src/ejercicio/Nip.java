package ejercicio;

public class Nip {
    
    protected static int nip = 1235;
    
    public boolean verificarNIP(int pin){
        if(pin == nip){
            return true;
        }else{
            return false; 
        }
    }
    
}
