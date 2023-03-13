/*
 Escriba un programa en el cual se ingrese un valor límite positivo, 
y a continuación solicite números al usuario hasta que la suma de los 
números introducidos supere el límite inicial.

 */
package Guia3Encuentros4y5y6;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        int num,suma=0;
        System.out.print("Ingrese un valor limite positivo: ");
        num=leer.nextInt();
        do{
            System.out.print("Ingrese el siguiente numero a sumar: ");
            suma+=leer.nextInt();
            
            if(suma>num){
                System.out.println("La suma a superado a tu limite en "+(suma-num)+" unidades");
            }else{
                System.out.println("suma: "+suma);
            }
            
        }while(suma<num);
    }
}
