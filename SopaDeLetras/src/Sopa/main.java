
package Sopa;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Sopa sopa = new Sopa();
	Scanner Entrada = new Scanner(System.in);
       banner(Entrada);
        
    }
    
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
