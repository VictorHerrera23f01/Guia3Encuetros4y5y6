/*
Se dispone de un conjunto de N familias, 
cada una de las cuales tiene una M 
cantidad de hijos. Escriba un programa 
que pida la cantidad de familias y para 
cada familia la cantidad de hijos para 
averiguar la media de edad de los hijos 
de todas las familias.
*/

package Guia3Encuentros4y5y6;
import java.util.Scanner;

public class Extra14 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        Scanner leer=new Scanner(System.in);
        
        int familias,hijos=0,cantidadHijos=0,acumuladorEdad=0,edad;
        
        System.out.print("Ingrese la cantidad de Familias: ");
        familias= leer.nextInt();
        
        for(int i=0; i<familias; i++){
            System.out.print("Cuantos hijos tiene la familia "+(i+1)+" : ");
            hijos= leer.nextInt();
            cantidadHijos+=hijos;
            for(int j=0; j<hijos; j++){
                System.out.print("Edad del hijo "+(j+1)+" : ");
                edad= leer.nextInt();
                acumuladorEdad+= edad;
            }
        }
        
        System.out.println("El promedio de edad de los chicos registrados es de: "+(acumuladorEdad/cantidadHijos));
        
    }
    
}