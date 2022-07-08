import javax.lang.model.util.ElementScanner6;
import javax.swing.JOptionPane;

//Pedir 3 numero y mostrarlos ordenados de mayor a menor.

public class Ejercicio7 {
    public static void main(String[] args) {
        float num1, num2, num3;
        
        num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el 1er numero: "));
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el 2do numero: "));
        num3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el 3er numero: "));

        if ((num1 > num2)  && (num2 > num3)){
            JOptionPane.showMessageDialog(null, "Este es el orden de los numero de mayor a menor " + num1 + " - " + num2 + " - " + num3);
        }
        else if ((num1 < num2) && (num2 > num3) && (num1 > num3)) {
            JOptionPane.showMessageDialog(null, "Este es el orden de los numero de mayor a menor " + num2 + " - " + num1 + " - " + num3);
        }
        else if ((num1 < num2) && (num2 < num3)){
            JOptionPane.showMessageDialog(null, "Este es el orden de los numero de mayor a menor " + num3 + " - " + num2 + " - " + num1);
        }
        else{
            JOptionPane.showMessageDialog(null,  "Este es el orden de los numero de mayor a menor " + num3 + " - " + num3 + " - " + num1);
        }
    }
}
