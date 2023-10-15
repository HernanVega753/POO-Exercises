/*
Crea una clase Contador con los métodos para incrementar y decrementar el 
contador. La clase contendrá un constructor por defecto, un constructor con 
parámetros, un constructor copia y los métodos getters y setters.
Crea una clase llamada Contador que contenga un único atributo entero llamado 
cont.
La clase tendrá los siguientes constructores:
Constructor por defecto
Constructor con parámetros para inicializar el contador con un valor no 
negativo. Si el valor inicial que se recibe es negativo el contador tomará el 
valor cero como valor inicial.
Constructor copia.
 */
package domain;

public class Contador {
    // Atributo
    private int conteo;
    // Constructor por defecto
    public Contador(){
        this.conteo = 0;
    }
    // Constructor con parámetros
    public Contador(int valor){
        if (valor < 0){
            this.conteo = 0;
        } else {
            this.conteo = valor;
        }
    }
    // Constructor copia
    public Contador(Contador Contador1){
        conteo = Contador1.conteo;
    }
    // Métodos getters y setters

    public int getConteo() {
        return this.conteo;
    }

    public void setConteo(int conteo) {
        this.conteo = conteo;
    }
    // Método para incrementar el conteo en uno
    public void IncrementoContador(){
        this.conteo ++;
    }
    public void DecrementoContador(){
        this.conteo --;
    }
}
