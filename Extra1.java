/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, 
si el usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 
1 día, 2 horas.
 */
package Guia3Encuentros4y5y6;

import javax.swing.JOptionPane;

public class Extra1 {
    public static void main(String[]args){
        
        int min= (int) Integer.parseInt(JOptionPane.showInputDialog("Ingrese los minutos deseados: "));
        int horas= min/60;
        int dias= horas/24;
        horas %= 24;
        int minsobrantes = min;
        minsobrantes %= 60;
                
        JOptionPane.showMessageDialog(null,"Los "+(min)+" Minutos Equivales a: "+(dias)+" Dias "+(horas)+" Horas "+(minsobrantes)+" Minutos");
    }
    
}
