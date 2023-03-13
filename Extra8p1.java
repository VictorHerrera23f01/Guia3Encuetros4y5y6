/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco 
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de 
números pares y la cantidad de números impares. Al igual que en el ejercicio 
anterior los números negativos no deben sumarse. Nota: recordar el uso de la 
sentencia break.
 */
package Guia3Encuentros4y5y6;
import java.util.Scanner;

public class Extra8p1 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        int leidos=0,pares=0,impares=0,num;
        
        while(true){
            System.out.print("Ingrese un numero: ");
            num=leer.nextInt();
            
            if(num<0){
                continue;
            }
            if(num%5 == 0){
                break;
            }
            
            leidos++;
            if(num%2==0){
                pares++;
            }else{
                impares++;
            }
        }
        
        System.out.println("Leidos: "+leidos);
        System.out.println("Pares leidos: "+pares);
        System.out.println("Impares leidos: "+impares);
    }
}
