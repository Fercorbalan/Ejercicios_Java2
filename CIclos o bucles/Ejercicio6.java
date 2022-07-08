import javax.swing.JOptionPane;

/* Pedir numeros hasta que se teclee un 0, mostrar la suma de todos los numeros introducidos.*/

public class Ejercicio6 {
    public static void main(String[] args) {
        int num, resultado = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1er Numero a sumar: "));

        while (num != 0){
            resultado = num + resultado;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el siguiente Numero a sumar: "));
        }
        JOptionPane.showMessageDialog(null,"El resultado es: " + resultado);
        JOptionPane.showMessageDialog(null,"Gracias por utilizar este programa");
    }
    
}
