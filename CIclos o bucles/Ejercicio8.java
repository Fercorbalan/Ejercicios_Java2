

import javax.swing.JOptionPane;

/*Pedir un numero N, y mostrar todos los numeros del 1 al N*/

public class Ejercicio8 {
    public static void main(String[] args) {
        int num, contador = 0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese la cantidad de numeros a visualizar"));

        while (num > contador) {
            contador ++;
            System.out.println(contador);
            
        } 
            
    }
            
}
    

