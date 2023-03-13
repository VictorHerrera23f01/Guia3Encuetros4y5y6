/*
Leer la altura de N personas y determinar el promedio de estaturas que se 
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package Guia3Encuentros4y5y6;
import java.util.Scanner;

public class Extra6 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        float acumulador=0,j=0,acumuladorGral=0,estatura;
        int n;
        System.out.print("Ingrese la cantidad de personas: ");
        n=leer.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.print("Ingrese la siguiente estatura: ");
            estatura=leer.nextFloat();
            if(estatura<1.60){
                acumulador+=estatura;
                j++;
            }
            acumuladorGral+=estatura;
                       
        }
        
        System.out.println("El Promedio de los petisos es de: "+(acumulador/j)+" metros");
        System.out.println("El Promedio de los demas es de: "+(acumuladorGral/n)+" metros");
    }
}
