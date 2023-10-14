
package menu;
import cuenta.Cuenta;
import java.util.Scanner;

public class Menu {
    Scanner entrada = new Scanner(System.in);
    int opcion = 10;
    Cuenta miCuenta = new Cuenta();
    public void menu_inicio(){
            while (opcion != 0){
                System.out.println("Monto en cuenta: $"+miCuenta.getMonto_cuenta());
                System.out.println("¿Qué desea hacer?");
                System.out.println("1 - Ingresar dinero");
                System.out.println("2 - Transferir dinero");
                System.out.println("3 - Solicitar reintegro");
                System.out.println("0 - Salir");
                opcion = Integer.parseInt(entrada.nextLine());
                System.out.println("--------------------------------------------------------");
                switch (opcion){

                case 1: 
                    System.out.println("Ingrese el monto a depositar");
                    double ingreso = Double.parseDouble(entrada.nextLine());
                    miCuenta.ingreso_cuenta(ingreso);
                    System.out.println("--------------------------------------------------------"); break;
                case 2:
                    String contacto;
                    double monto_a_transferir;
                    System.out.println("Ingrese el contacto al que desea transferi:");
                    contacto = entrada.nextLine();
                    System.out.println("Usted transferirá a: "+contacto);
                    System.out.println("Ingrese el monto a transferir");
                    monto_a_transferir = Double.parseDouble(entrada.nextLine());
                    miCuenta.transferencia(contacto, monto_a_transferir);
                    System.out.println("--------------------------------------------------------"); break;
                case 3:
                    System.out.println("Se le reintegrará el 21% de las transacciónes realizada");
                    miCuenta.reingreso_dinero();
                    System.out.println("--------------------------------------------------------"); break;
                    
            }
        }
    }
}
