/*
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
package modelos;




public class Libro {
    // Atributos de Libro
    private String tituloLibro = new String();
    private String autorLibro = new String();
    private int numeroEjemplares;
    private int numeroEjemplaresPrestados;
    public static String[] catalogo = new String[0];
    
    
    // Constructores
    public Libro(){
        
    }
    public Libro(String tituloLibro, String autorLibro, int numeroEjemplares, int numeroEjemplaresPrestados){
        this.tituloLibro = tituloLibro;
        this.autorLibro = autorLibro;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
        this.catalogo[catalogo.length+1] = tituloLibro;
        
    }

     


    public int getNumeroEjemplaresPrestados() {
        return numeroEjemplaresPrestados;
    }

    public void setNumeroEjemplaresPrestados(int numeroEjemplaresPrestados) {
        this.numeroEjemplaresPrestados = numeroEjemplaresPrestados;
    }

    public String getTituloLibro() {
        return tituloLibro;
    }

    public void setTituloLibro(String tituloLibro) {
        this.tituloLibro = tituloLibro;
    }

    public String getAutorLibro() {
        return autorLibro;
    }

    public void setAutorLibro(String autorLibro) {
        this.autorLibro = autorLibro;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }
    
    
    
}
