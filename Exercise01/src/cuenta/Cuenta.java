/*
1. Crea una clase Cuenta con los métodos ingreso, reintegro y transferencia. 
La clase contendrá un constructor por defecto, un constructor con parámetros, 
un constructor copia y los métodos getters y setters.
 */
package cuenta;

import java.util.Scanner;

public class Cuenta {
    Scanner entrada = new Scanner(System.in);
    private double monto_cuenta;
    private double ingreso;
    private double transferencia;
    private String cuenta_de_otro;
    private static double suma;
    
    // Constructor vacío
    public Cuenta(){
        
    }
    
    // Constructor con parámetros
    public Cuenta(double monto_cuenta){
    this.monto_cuenta = monto_cuenta;
    
    }
    // Constructor copia
    public Cuenta(double otraClase, String cuenta_ajena){
        this.monto_cuenta = otraClase;
        this.cuenta_de_otro = cuenta_ajena;
    }
    
    
    public void ingreso_cuenta(double ingresoCuenta){
        monto_cuenta += ingresoCuenta;
        System.out.println("Operación realizada con éxito");
        setMonto_cuenta(monto_cuenta);
        System.out.println("El monto en su cuenta es de:");
        System.out.println("$"+getMonto_cuenta());
        System.out.println("--------------------------------------------------------");
    }
    public void transferencia(String contacto, double transferencia_otro){
        suma += transferencia_otro;
        monto_cuenta -= transferencia_otro;
        System.out.println("Se han transferido $"+transferencia_otro+" satisfactoriamente");
        System.out.println("El monto en su cuenta es de $"+getMonto_cuenta());
        System.out.println("--------------------------------------------------------");
        
    }
    public void reingreso_dinero(){
        double reintegro = suma * 0.21;
        System.out.println("reintegro = " + reintegro);
        monto_cuenta += reintegro;
        
        System.out.println("El monto devuelto de tranferencias es de: $"+reintegro);
        System.out.println("Monto en cuenta: $"+getMonto_cuenta());
        
        setMonto_cuenta(monto_cuenta);
        System.out.println("--------------------------------------------------------");
    }

    public double getMonto_cuenta() {
        return monto_cuenta;
    }

    public void setMonto_cuenta(double monto_cuenta) {
        this.monto_cuenta = monto_cuenta;
    }

    public double getIngreso() {
        return ingreso;
    }

    public void setIngreso(double ingreso) {
        this.ingreso = ingreso;
    }

    public double getTransferencia() {
        return transferencia;
    }

    public void setTransferencia(double transferencia) {
        this.transferencia = transferencia;
    }

    public String getCuenta_de_otro() {
        return cuenta_de_otro;
    }

    public void setCuenta_de_otro(String cuenta_de_otro) {
        this.cuenta_de_otro = cuenta_de_otro;
    }

    public static double getSuma() {
        return suma;
    }

    public static void setSuma(double suma) {
        Cuenta.suma = suma;
    }
    
}
