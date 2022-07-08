import javax.swing.JOptionPane;

// Pedir dos numero y decir cual es el mayor o si son iguales.

public class Ejercicio2 {
    public static void main(String[] args) {
        float num1, num2;

        num1 = Float.parseFloat(JOptionPane.showInputDialog("Digite el 1er numero a comparar"));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Digite el 2do numero a comparar"));
        
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null,"EL numero" + num1 +" es Mayor que " + num2);
        }
        else{
            JOptionPane.showMessageDialog(null, "El numero " + num2 + "es Mayor que " + num1);
        }
    }
}
