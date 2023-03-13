/*
    Realizar un programa que lea 4 números (comprendidos entre 1 y 20) 
    e imprima el número ingresado seguido de tantos asteriscos como 
    indique su valor. Por ejemplo:

    5 *****
    3 ***
    11 ***********
    2 **

 */
package Guia3Encuentros4y5y6;
import java.util.Scanner;

/*
 @author VictorHerrera
 */
public class Ejercicio10DeLaTeoria {
    public static void main (String[] args){
        Scanner leer = new Scanner(System.in);
        
        int numeros[] = new int [4];
        
        System.out.println("Ingrese los cuatro valores");
        
        for (int i=0; i<numeros.length; i++){
            System.out.print((i+1)+") = ");
            numeros[i] = leer.nextInt();
            
            while (numeros[i] < 1 || numeros[i] > 20) {
                System.out.println("Solo se permiten valores entre 1 y 20");
                System.out.print((i + 1) + ") = ");
                numeros[i] = leer.nextInt();
            }
        }
        
         System.out.println("");
        for(int ateriscos:numeros){
            System.out.print(ateriscos);
            for (int i=0; i<ateriscos; i++){
                System.out.print("*");
            }
             System.out.println("");
        }
    }
    
}
