
package Sopa;

/** Clase Sopa
 *  Crea una matriz que contiene la sopa de letras
 *  Utiliza las palabras
 */
public class Sopa {
    //  Atributos publicos
    public String lineaTexto;
    public String[] Palabras;
    public  char[][] matriz;
    
    
    // Constructor
    public Sopa(String lineaTexto) {
        this.lineaTexto = lineaTexto;
        
        // Convertimos a minuscula
        this.lineaTexto = this.lineaTexto.toLowerCase();
        
        // Eliminamos espacios en blanco
        this.lineaTexto = this.lineaTexto.replaceAll("\\s*", "");
        
        // Separamos las palabras
        this.Palabras = this.lineaTexto.split(",", 15);
        
        // Inicializamos la sopa de letras
        this.matriz = new char [15][15];
        for (int i=0; i<matriz.length; i++)
            for(int j=0; j<matriz[0].length; j++)
                matriz[i][j] = 'A';
        
        this.imprimirSopa();
    }
    
    /*
    Metodo imprimirSopa
    Imprime la sopa de letra
    */
    public void imprimirSopa() {
        for(int i=0; i<matriz.length; i++) {
            for(int j=0; j<matriz[0].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
