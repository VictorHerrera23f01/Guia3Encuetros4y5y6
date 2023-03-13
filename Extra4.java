/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre 
su equivalente en romano.

 */
package Guia3Encuentros4y5y6;
import java.util.Scanner;

public class Extra4 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        int num;
        do{
            System.out.print("Ingrese un numero entre 1 y 10: ");
            num=leer.nextInt();
            
            switch(num){
                case 1:
                    System.out.println("Expresado en numeros Romanos es: I");
                    break;
                case 2:
                    System.out.println("Expresado en numeros Romanos es: II");
                    break;
                case 3:
                    System.out.println("Expresado en numeros Romanos es: III");
                    break;
                case 4:
                    System.out.println("Expresado en numeros Romanos es: IV");
                    break;
                case 5:
                    System.out.println("Expresado en numeros Romanos es: V");
                    break;
                case 6:
                    System.out.println("Expresado en numeros Romanos es: VI");
                    break;
                case 7:
                    System.out.println("Expresado en numeros Romanos es: VII");
                    break;
                case 8:
                    System.out.println("Expresado en numeros Romanos es: VIII");
                    break;
                case 9:
                    System.out.println("Expresado en numeros Romanos es: IX");
                    break;
                case 10:
                    System.out.println("Expresado en numeros Romanos es: X");
                    break;
            }
        
        }while(num<0 || num>10);
        
        
    }
}
