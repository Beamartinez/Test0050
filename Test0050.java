
/**
 * Write a description of class Test0050 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test0050
{
    /**
     * Constructor for objects of class Test0050
     */
    public Test0050(){  
    }
    
    /*
     * Multiplica dos numeros enteros
     */
    public int multNum(int base, int sumo){
        int resultado = 0;
        if(base != 0){
            if(sumo > 0){
                for (int contador = 1; contador <= sumo; contador++){
                    resultado += base;
                }
            }else if(sumo < 0){
                for (int contador = -1; contador >= sumo; contador--){
                    resultado += -base;
                }
            }
        }
        return resultado;
    }
}
