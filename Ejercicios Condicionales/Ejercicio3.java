//DIgitar una letra y verificar si es Mayuscula

import javax.swing.JOptionPane;

public class Ejercicio3 {
    public static void main(String[] args) {
        char letra;

        letra = JOptionPane.showInputDialog("Digite una letra").charAt(0);

        if(Character.isUpperCase(letra)){
            JOptionPane.showMessageDialog(null, "Esta es una letra mayuscula");
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Esta es una letra minuscula");
        }
    }
}
