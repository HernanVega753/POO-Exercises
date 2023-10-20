
package menu;


import modelos.Libro;


public class SistemaMenu {
    public static void mostrar(){
        for (int i = 0; i <= Libro.catalogo.length -1 ; i++){
            System.out.println(Libro.catalogo[i]);
        }
    }
}
