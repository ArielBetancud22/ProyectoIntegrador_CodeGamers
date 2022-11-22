
package Sopa;


public class Jugar {
    public Sopa sopa;
    
    
    // Constructor
    Jugar(Sopa sopa) {
        this.sopa = sopa;
    }
    
    /*
    Metodo cantEncontradas
    Contabiliza la cantidad de palabras de la sopa de letras
    que aun no fueron encontradas
    */
    public int cantEncontradas() {
        
        int cantEncontradas = 0;
        for (int i = 0; i < sopa.Palabras.length; i++) {
            if(sopa.Palabras[i].encontrada == true)
                cantEncontradas ++;
        }
        return cantEncontradas;
    }

    // Verifica si la palabra se encuentra en la sopa de letras
    boolean verificarPalabra(String palabraEncontrada) {
        for (int i = 0; i < sopa.Palabras.length; i++) {
            if(sopa.Palabras[i].palabra.equals(palabraEncontrada)) {
                sopa.Palabras[i].encontrada = true;
                return true;
            }
        }
        return false;
    }
}
