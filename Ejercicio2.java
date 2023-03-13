/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” 
el programa pondrá un mensaje de Correcto, sino mostrará un mensaje de 
Incorrecto. Nota: investigar la función equals() en Java.

 */
package Guia3Encuentros4y5y6;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese una frase: ");
        String frase = leer.next();
        
        if(frase.equalsIgnoreCase("eureka")){
            System.out.println("Correcto");
        }else{
            System.out.println("La frase ingresada es incorrecta");
        }
        leer.close();
    }
    
}
