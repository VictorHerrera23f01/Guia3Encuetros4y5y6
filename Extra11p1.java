/*
Escribir un programa que lea un número entero 
y devuelva el número de dígitos que componen 
ese número. Por ejemplo, si introducimos el 
número 12345, el programa deberá devolver 5. 
Calcular la cantidad de dígitos matemáticamente 
utilizando el operador de división. Nota: recordar 
que las variables de tipo entero truncan los 
números o resultados.
*/

package Guia3Encuentros4y5y6;
import java.util.Scanner;

public class Extra11p1 {
    
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        
        int num1,i=0,cociente;
        
        System.out.print("Ingrese un numero entero: ");
        num1=leer.nextInt();
        
        while(true){
            cociente=num1/10;
            num1=cociente;
            i++;
            
            if(cociente <=0){
                break;
            }
        }
        System.out.print("Cantidad de digitos: "+i);
    }
    
}