
package Sopa;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String lineaTexto; 
        Scanner Entrada = new Scanner(System.in);
                
        // Imprimimos la pantalla inicial
        banner(Entrada);
        
        // Solicitamos las palabras para armar la sopa de letras
        System.out.println("Ingresa las palabras de tu sopa de letras");
        System.out.println("Podes ingresar hasta 15 palabras, separadas por comas");
        System.out.println("Cada palabra puede tener una longitud máxima de 14 caracteres");
        lineaTexto = Entrada.nextLine();
        
        // Creamos la sopa de letras
        Sopa sopa = new Sopa(lineaTexto);
    }
    
    // Metodo: banner
    // Imprime la pantalla inicial del programa
    static void banner(Scanner Entrada) {
        System.out.println("____ ____ ___  ____    ___  ____");
        System.out.println("[__  |  | |__] |__|    |  \\ |___");
        System.out.println("___] |__| |    |  |    |__/ |___");
        System.out.println("");
        System.out.println("_    ____ ___ ____ ____ ____");
        System.out.println("|    |___  |  |__/ |__| [__");
        System.out.println("|___ |___  |  |  \\ |  | ___]");
        System.out.println("");
        System.out.println("Crea tu sopa de letras!");
        System.out.println("Presiona ENTER para continuar");
        Entrada.nextLine();
    }
}
