
package juego;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Diana
 */
public class Tablero {
    
    private String color;
    private int numeroDeCasillas;
    private String tamanno;
    private int cantidadDeJugadores;
    
    
    private ArrayList<Ficha> listaFichas ;
    
    public Tablero(){  
        
    }
    public void agregar(Ficha fichaAux){
        listaFichas.add(fichaAux);
    }

    public Tablero(String color,int numeroDeCasillas,String tamanno,int cantidadDeJugadores){
    this.color=color;
    this.numeroDeCasillas=numeroDeCasillas;
    this.tamanno=tamanno;
    this.cantidadDeJugadores=cantidadDeJugadores;
    listaFichas= new ArrayList<Ficha>();
    }
    
    public int getNumeroDeCasillas (){
        return numeroDeCasillas ;
    }
    public Ficha siguienteTurno() {
        
        Random rand= new Random();
        int num=rand.nextInt(cantidadDeJugadores);
        //System.out.println("El siguiente turno es de: "+listaFichas.get(num));
        return listaFichas.get(num);
    }  
}
