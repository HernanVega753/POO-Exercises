
package menu;

import java.util.Scanner;

public class Menu {
    
    
    public static void MenuPrestamo(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de Librería PEPE");
        System.out.println("¿Qué libro le gustaría leer hoy?");
        SistemaMenu.mostrar();
        String prestar = new String();
        prestar = entrada.nextLine();
        
    }
}
