//Leer numero hasta que se introduzca un 0. Para cada uno indicar si es par o impar.
import javax.swing.JOptionPane;

public class ejercicio3 {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a comprobar: "));

        while (num != 0 ) {
            
            if (num%2 == 0) {
                JOptionPane.showMessageDialog(null, "EL numero es Par:");    
            } 
            else{
                JOptionPane.showMessageDialog(null, "EL numero es Impar:");    
            }
        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a comprobar: "));
        }
        JOptionPane.showMessageDialog(null, "Gracias por utilizar esta aplicación");
    }

}

