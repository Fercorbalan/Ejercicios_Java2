// Hacer un programa que tome dos numeros y diga si ambos son apres o impares.

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1ro numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 2do numero: "));

        if (num1%2 == 0 && num2%2 == 0){
            JOptionPane.showMessageDialog(null, "Los Numeros ingresados son pares");
        }
        else if(num1%2 != 0 && num2%2 != 0){
            JOptionPane.showMessageDialog(null, "Los 2 numero son Impares");
        }
        else{
            JOptionPane.showMessageDialog(null, "Los numeros no son conjunto de pares o impares");
        }
    }
}
