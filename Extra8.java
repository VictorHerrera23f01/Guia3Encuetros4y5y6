/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break.
 */
package Guia3Encuentros4y5y6;
import java.util.Scanner;

public class Extra8 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        int num,leidos=0,pares=0,impares=0;
        
        do{
            System.out.print("Ingrese el siguiente numero: ");
            num=leer.nextInt();
            if (num > 0) {
                if (num % 2 == 0) {
                    pares++;
                } else {
                    impares++;
                }
            }
            leidos++;
                        
        }while(!(num%5==0));
        
        System.out.println("\nLa cantidad de numeros leidos es de: "+leidos);
        System.out.println("La cantidad de numeros PARES es de: "+pares);
        System.out.println("La cantidad de numeros imPARES es de: "+impares);
    }
}
