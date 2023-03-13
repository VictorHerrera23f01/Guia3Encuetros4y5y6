/*
Necesitamos mostrar un contador con 3 dígitos XXX, 
que muestre los números del 000 al 999, con la particularidad 
que cada vez que aparezca un 3 lo sustituya por una E. 
Ejemplo: 
000 
001 
002 
00E 
004 
012 
01E 

Nota:investigar función equals() y como convertirnúmeros
a String.
*/

package Guia3Encuentros4y5y6;

public class Extra12p1 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        for(int i=0;i<1000;i++){
            String numero= String.format("%03d",i);
            
            if(numero.substring(0,1).equals("3")&&numero.substring(1,2).equals("3")){
                numero= "e"+"e"+numero.substring(2);
            }else if(numero.substring(1,2).equals("3")&&numero.substring(2).equals("3")){
                numero= numero.substring(0,1)+"e"+"e";
            }else if(numero.substring(0,1).equals("3")&&numero.substring(2).equals("3")){
                numero= "e"+numero.substring(1,2)+"e";
            }
            
            if(numero.substring(0,1).equals("3")){
                numero= "e" + numero.substring(1);
            }else if(numero.substring(1,2).equals("3")){
                numero=numero.substring(0,1)+"e"+ numero.substring(2);
            }else if(numero.substring(2).equals("3")){
                numero=numero.substring(0,1)+numero.substring(1,2)+"e";
            }
            
            System.out.println(numero);
        }
        
    }
    
}








