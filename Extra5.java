/*
Una obra social tiene tres clases de socios:
    *Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento 
    en todos los tipos de tratamientos.
    *Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento 
    para los mismos tratamientos que los socios del tipo A.
    *Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre 
    dichos tratamientos.
    *Solicite una letra (carácter) que representa la clase de un socio, y luego 
    un valor real que represente el costo del tratamiento (previo al descuento) 
    y determine el importe en efectivo a pagar por dicho socio.

 */
package Guia3Encuentros4y5y6;
import java.util.Scanner;

public class Extra5 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        String tipoSocio;
        int costo;
        System.out.print("Ingrese el tipo de socio: ");
        tipoSocio=leer.next().toLowerCase();
        
        System.out.print("Costo del tratamiento: ");
        costo=leer.nextInt();
        
        switch (tipoSocio) {
            case "a":
                System.out.println("Ud. debe pagar: " + (costo / 2));
                break;
            case "b":
                System.out.println("Ud. debe pagar: " + (costo * 35 / 100));
                break;
            case "c":
                System.out.println("Ud. debe pagar: " + costo);
                break;
            default: System.out.println("Tipo de socio no valido");
        }    
    }
}
