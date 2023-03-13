/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y 
el promedio de n números (n>0). El valor de n se solicitará al principio del 
programa y los números serán introducidos por el usuario. Realice dos versiones 
del programa, una usando el bucle “while” y otra con el bucle “do - while”.

 */
package Guia3Encuentros4y5y6;
import java.util.Scanner;

public class Extra7p1 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        int max=0,min=0,n,num,i=0;
        float acumulador=0,promedio;
        System.out.print("Ingrese la cantidad de numeros a evaluar: ");
        n=leer.nextInt();
        
        do{
            System.out.print("Ingrese el siguiente numero: ");
            num=leer.nextInt();
            if(i==0){
                min=num;
                max=num;
            }
            if(num>max){
                max=num;
            }
            if(num<min){
                min=num;
            }
            
            acumulador+=num;
            
            i++;
        }while(i<n);
        
        promedio=acumulador/n;
        
        System.out.println("El promedio de los numeros ingresados es de: "+promedio);
        System.out.println("El mayor es de: "+max);
        System.out.println("El menor es de: "+min);
    }
}
