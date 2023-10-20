/*
- Método préstamo que incremente el atributo correspondiente cada vez que se realice un préstamo del libro. No se podrán prestar libros de los que no queden ejemplares disponibles para prestar. Devuelve true si se ha podido realizar la operación y false en caso contrario.
- Método devolución que decremente el atributo correspondiente cuando se produzca la devolución de un libro. No se podrán devolver libros que no se hayan prestado. Devuelve true si se ha podido realizar la operación y false en caso contrario.
- Método toString para mostrar los datos de los libros. Este método se heredada de Object y lo debemos modificar (override) para adaptarlo a la clase Libro.
- Escribe un programa para probar el funcionamiento de la clase Libro.
 */
package acciones;

import modelos.Libro;

public class Libreria {
    
    public void prestamo(Libro libro){
        if (libro.getNumeroEjemplares() == libro.getNumeroEjemplaresPrestados()){
            System.out.println("No quedan ejemplares disponibles de "+libro.getTituloLibro());
        } else {
         libro.setNumeroEjemplaresPrestados(libro.getNumeroEjemplaresPrestados()+1);           
        }
    }
    public void devolucion(Libro libro){
        if (libro.getNumeroEjemplares() == libro.getNumeroEjemplaresPrestados()){
            System.out.println("El libro "+libro.getTituloLibro()+" no se encuentra prestado");
        } else {
         libro.setNumeroEjemplaresPrestados(libro.getNumeroEjemplaresPrestados()+1);           
        }
    }
}

