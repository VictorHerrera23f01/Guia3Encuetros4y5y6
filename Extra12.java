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

public class Extra12 {
    
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        
        // comvertimos el iterador a cadena de caractes y operamos
        // caractetes en lugar de numeros enteros guardando el iterador
        // en una variable tipo cadena
        for(int i=0;i<10;i++){
            String ci= Integer.toString(i);
            for(int j=0;j<10;j++){
                String cj= Integer.toString(j);
                for(int k=0;k<10;k++){
                    String ck= Integer.toString(k);
                    
                    //averiguamos si el iterador tipo cadena 
                    //toma el valor deseao y modificamos su 
                    //valor en caracteres, y lo modificamos.
                    // la sigla "ck" significa "cadena_del_iterador_k"
                    
                    if(ck.equals("3")){
                        ck="e";
                    }else if(cj.equals("3")){
                        cj="e";
                    }else if(ci.equals("3")){
                        ci="e";
                    }
                    
                    //luego se imprime por pantalla
                    
                    System.out.println(ci+"-"+cj+"-"+ck);
                }
            }
            System.out.println("");
        }
        
    }
    
}








