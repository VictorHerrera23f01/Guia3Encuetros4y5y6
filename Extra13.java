/*
Crear un programa que dibuje una escalera 
de números, donde cada línea de números 
comience en uno y termine en el número 
de la línea. Solicitar la altura de la 
escalera al usuario al comenzar. 

Ejemplo: si se ingresa el número 3 
1 
12 
123
*/

package Guia3Encuentros4y5y6;
import java.util.Scanner;

public class Extra13 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner leer=new Scanner(System.in);
        
        System.out.println("Ingrese la altura de la escalera: ");
        int altura= leer.nextInt();
        System.out.println("");
        
        for(int i=1; i<=altura;i++){
            for(int j=1; j<=altura;j++){
                
                if(j<=i){
                    System.out.print(j);
                }
            }
            System.out.println("");
        }
    }
    
}