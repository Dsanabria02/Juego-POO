
package juego;

/**
 *
 * @author Diana
 */
public class Ficha {
    private String color;
    private int posicion;
    Dado dado=new Dado(6);
    
    public Ficha(){
    }
    
    public Ficha(String color,int posicion ){
    this.color=color;
    this.posicion=posicion; 
    }
    
    public int getPosicion (){
        return posicion ;
    }
    
    public String getColor (){
        return color ;
    }
    
    
    public void avanzar(){
    int pasos=dado.lanzar();
    this.posicion+=pasos;
    
    
    }
    
    
    
}

