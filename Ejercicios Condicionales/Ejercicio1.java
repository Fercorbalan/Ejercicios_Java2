import javax.swing.JOptionPane;

//Hacer un programa que lea un nuermo entero y muestre si el numero es multiplo de 10

public class Ejercicio1 {
    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite el numero entero a comprobar"));

        if (numero%10 ==0) {
            JOptionPane.showMessageDialog(null, "EL numero " + numero + " es multiplo de 10");
            
        }
        else {
            JOptionPane.showMessageDialog(null, "EL numero digitado no es multiplo de 10");
        }
    }
}
