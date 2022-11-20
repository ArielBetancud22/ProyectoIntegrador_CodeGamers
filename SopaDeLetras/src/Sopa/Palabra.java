
package Sopa;


public class Palabra {
    public String palabra;
    public int posx; //Ingreso en posicion X
    public int posy; //Ingreso en posicion Y
    public boolean sentidoH;
    public boolean encontrada = false;
    
    public Palabra(String palabra) {
        this.palabra = palabra;
    }
}
