
package juego;

import java.util.Random;

/**
 *
 * @author Diana
 */
public class Dado {
    private int caras;
    
    
    public Dado(){
    }  
     
    public Dado(int caras){
        this.caras=caras;
    }
    
    public int lanzar(){
    
    Random rand= new Random();
    int num=rand.nextInt(caras+1);
    return num;
    
    }
    
    
}



