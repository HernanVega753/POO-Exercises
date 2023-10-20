/*
EJERCICIOS BÁSICOS RESUELTOS POO JAVA
Crea una clase llamada Libro que guarde la información de cada uno de los libros 
de una biblioteca. La clase debe guardar el título del libro, autor, número de 
ejemplares del libro y número de ejemplares prestados. La clase contendrá los 
siguientes métodos:

- Constructor por defecto.
- Constructor con parámetros.
- Métodos Setters/getters
- Método préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. No se podrán prestar libros de los que no queden ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en caso contrario.
- Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. No se podrán devolver libros que no se hayan prestado. Devuelve true si se ha podido realizar la operación y false en caso contrario.
- Método toString para mostrar los datos de los libros. Este método se heredada de Object y lo debemos modificar (override) para adaptarlo a la clase Libro.
- Escribe un programa para probar el funcionamiento de la clase Libro.
 */
package test;

import menu.Menu;
import modelos.Libro;

public class PruebaLibreria {
    public static void main(String[] args) {

    Libro cienaniosSoledad = new Libro("Cien años de soledad","Gabriel García Márquez", 5, 0);
    Libro milNovecientosOchentaYCuatro = new Libro("1984","George Orwel",9,0);
    Libro matarRuiseñor = new Libro("Matar un ruiseñor","Harper Lee",2,0);
    Libro donQuijote = new Libro("Don Quijote de la Mancha","Miguel de Cervantes",5,0);
    Libro enBuscaTiempoPerdido = new Libro("En busca del tiempo perdido","Marcel Proust",1,0);
        
        menu.Menu.MenuPrestamo();
        
      
    }
    
}
