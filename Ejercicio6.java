/*
Realizar un programa que pida dos números enteros positivos 
por teclado y muestre por pantalla el siguiente menú:El usuario 
deberá elegir una opción y el programa deberá mostrar el resultado 
por pantalla y luego volver al menú. El programa deberá ejecutarse 
hasta que se elija la opción 5. Tener en cuenta que, si el usuario 
selecciona la opción 5, en vez de salir del programa directamente, 
se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro 
que desea salir del programa (S/N)? Si el usuario selecciona el carácter 
‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.

 */
package Guia3Encuentros4y5y6;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Ejercicio6 {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        
        int num1,num2,opc;
        String opcion;
        boolean continuar=false;
        
        do{
            num1 = (int) Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
            num2 = (int) Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
        
            opc=(int) Integer.parseInt(JOptionPane.showInputDialog("    MENU\n"+"1.Sumar\n"+"2.Restar\n"+"3.Multiplicar\n"+"4.Dividir\n"+"5.Salir\n"+"Elija la opcion: "));
            switch(opc){
                case 1:
                    JOptionPane.showMessageDialog(null,"La SUMA es: "+(num1+num2));
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null,"La RESTA es: "+(num1-num2));
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null,"El Producto es: "+(num1*num2));
                    break;
                case 4:
                    if(!(num2==0)){
                        JOptionPane.showMessageDialog(null,"El Cociente es: "+(num1/num2));
                    break;
                    }else{
                        JOptionPane.showMessageDialog(null,"No se puede divivir entre cero");
                    }
                case 5:
                    opcion = JOptionPane.showInputDialog("Esta seguro de que desea salir? (s/n)");
                    if(opcion.equals("s")){
                        continuar=true;
                    }else{
                        continuar=false;
                    }
            }
            opcion = JOptionPane.showInputDialog("Desea continuar? (s/n)");
                    if(opcion.equals("s")){
                        continuar=false;
                    }else{
                        continuar=true;
                    }
        }while(continuar==false);
    }
}
