/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor 
diferente a cada una. A continuación, realizar las instrucciones necesarias 
para que: B tome el valor de C, C tome el valor de A, A tome el valor de D y D 
tome el valor de B. Mostrar los valores iniciales y los valores finales de cada 
variable. Utilizar sólo una variable auxiliar.

 */
package Guia3Encuentros4y5y6;

import java.util.Scanner;

public class Extra2 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        int a,b,c,d,aux;
        
        System.out.print("Ingrese un valor para A: ");
        a=leer.nextInt();
        System.out.print("Ingrese un valor para B: ");
        b=leer.nextInt();
        System.out.print("Ingrese un valor para C: ");
        c=leer.nextInt();
        System.out.print("Ingrese un valor para D: ");
        d=leer.nextInt();
        
        System.out.println("\nlos valores originales son\n a:"+a+"\n b:"+b+"\n c:"+c+"\n d:"+d);
        aux=b;
        b=c;
        c=a;
        a=d;
        d=aux;
        System.out.println("\nlos valores nuevos son\n a:"+a+"\n b:"+b+"\n c:"+c+"\n d:"+d);
        leer.close();
    }
    
}
