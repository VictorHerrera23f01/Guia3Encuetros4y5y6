/*
Simular la división usando solamente restas. Dados dos números enteros mayores 
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo 
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor 
que el divisor, este resultado es el residuo, y el número de restas realizadas 
es el cociente.

Por ejemplo: 50 / 13:
50 – 13 = 37     una resta realizada
37 – 13 = 24     dos restas realizadas
24 – 13 = 11     tres restas realizadas

dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
¿Aún no lo entendiste? Recomendamos googlear división con restas sucesivas.

 */
package Guia3Encuentros4y5y6;
import java.util.Scanner;

public class Extra9 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        int dividendo,divisor,resto=0,cociente=0,aux=0;
        System.out.print("Ingrese un numero: ");
        dividendo=leer.nextInt();
        System.out.print("Ingrese un divisor: ");
        divisor=leer.nextInt();
        
        while(dividendo>divisor){
            aux=dividendo;
            resto=dividendo-divisor;
            dividendo=resto;
            cociente++;
            System.out.println(aux+"-"+divisor+" : "+resto);
        }
        
        System.out.println("\nEl residuo es de: "+resto);
        System.out.println("El cociente es de: "+cociente);
    }
}
