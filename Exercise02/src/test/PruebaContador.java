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
package test;
import domain.Contador;
import java.io.ObjectInputStream;

public class PruebaContador {
    public static void main(String[] args) {
        // Creo objeto con constructor vacío
        Contador contador1 = new Contador();
        // Creo objeto con constructor con parámetros
        Contador contador2 = new Contador(-20);
        // Creo objeto con constructor copia
        Contador contador3 = new Contador(contador2);
        
        System.out.println(contador1.getConteo()+" Es el valor del atributo del objeto creado con el constructor vacío");
        System.out.println(contador2.getConteo()+" Es el valor del atributo del objeto creado con el constructor con parámetros");
        System.out.println(contador3.getConteo()+" Es el valor de la copia del objeto contador2 hecho con el constructor copia");
        
        contador1.IncrementoContador();
        contador2.DecrementoContador();
        
        System.out.println(contador1.getConteo()+" Método de objeto 1 incremento");
        System.out.println(contador2.getConteo()+" Método de objeto 2 decremento");
        System.out.println(contador3.getConteo()+" Prueba de objeto 3 que debe setear a 0 cuando el número es negativo");
        
    }
}
