/*
 Crear un programa que dado un número determine si es par o impar.
 */
package Guia3Encuentros4y5y6;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[]args){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        int num = leer.nextInt();
        
        if(num%2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("Es impar");
        }
    }
}
