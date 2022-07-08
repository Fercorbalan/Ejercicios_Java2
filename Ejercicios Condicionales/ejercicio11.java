// Arme una calculadora

import javax.swing.JOptionPane;

public class ejercicio11 {
    public static void main(String[] args) {
        char operacion;
        float num1, num2, suma,resta,multiplicacion,division;

        num1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el 1er numero: "));
        operacion = JOptionPane.showInputDialog("Indique la Operacion a realizar: ").charAt(0);
        num2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el 2do numero: "));

        switch (operacion) {
            case 's': 
            case 'S': suma = num1 + num2;
                JOptionPane.showMessageDialog(null, "El resultado de la suma es" + suma);
                break;
            case 'r':
            case 'R': resta = num1 - num2;
                JOptionPane.showMessageDialog(null, "El resultado de la resta es" + resta);
                break;
            case 'm':
            case 'M':
            case 'p':
            case 'P': multiplicacion = num1 * num2;
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es" + multiplicacion);
                break;
            case 'd':
            case 'D': division = num1 / num2;
                JOptionPane.showMessageDialog(null, "El resultado de la división es" + division);
                break;
            default : JOptionPane.showMessageDialog(null, "No es una operación valida");
        }
            
        }

}

