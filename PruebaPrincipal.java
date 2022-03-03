
package juego;

/**
 *
 * @author Diana
 */
public class PruebaPrincipal {
    public static void main(String[] args) {
    Tablero unTablero= new Tablero("Blanco y negro",30,"Grande",3);
    
    Ficha ficha1=new Ficha("Rosado",0);
    Ficha ficha2=new Ficha("Celeste",0);
    Ficha ficha3=new Ficha("Lila",0);
    
    unTablero.agregar(ficha1);
    unTablero.agregar(ficha2);
    unTablero.agregar(ficha3);
    
    
    String ganador="";  
    while(ganador==""){
        Ficha fichaActual=unTablero.siguienteTurno();
        fichaActual.avanzar();
        System.out.println("La posición de la ficha "+fichaActual.getColor()+" es: " + fichaActual.getPosicion());
        if(fichaActual.getPosicion()>=unTablero.getNumeroDeCasillas()){
            ganador="Ya hay ganador";
            System.out.println("La ficha ganadora es: "+fichaActual.getColor ());
        
        }
    }
           
    }

    
}
