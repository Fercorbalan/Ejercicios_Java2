import javax.lang.model.util.ElementScanner6;
import javax.swing.JOptionPane;

// Pedir un numero entre 0 y 99.999 y decir cuantas cifras tiene

public class Ejercicio8 {
    public static void main(String[] args) {
        int num1;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero a consultar: "));
        if (num1 <0 ){
            JOptionPane.showMessageDialog(null,"No es un numero dentro de la lista comparable");
        }
        else if (num1 < 10){
            JOptionPane.showMessageDialog(null,"El numero tiene 1 cifras");
        }
        else if (num1 < 100) {
            JOptionPane.showMessageDialog(null,"El numero tiene 2 cifras");
        }
        else if (num1 < 1000) {
            JOptionPane.showMessageDialog(null,"El numero tiene 3 cifras");
        }
        else if (num1 < 10000) {
            JOptionPane.showMessageDialog(null,"El numero tiene 4 cifras");
        }
        else if (num1 < 100000) {
            JOptionPane.showMessageDialog(null,"El numero tiene 5 cifras");
        }
        else{
            JOptionPane.showMessageDialog(null,"No es un numero dentro de la lista comparable");
        }
    }
}
