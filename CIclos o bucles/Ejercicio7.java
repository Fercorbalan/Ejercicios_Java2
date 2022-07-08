import javax.swing.JOptionPane;

/* Pedir numeros hasta que se introduzca uno negativo, y calcular la media. */

public class Ejercicio7 {
    public static void main(String[] args) {
        int num, resultado = 0, contador = 0;
        float media;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1er Numero: "));

        while (num >= 0) {
            resultado = num + resultado;
            contador ++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el siguiente Numero: "));
            
        }
        media = (float) resultado / contador;
        JOptionPane.showMessageDialog(null,"La suma de todos los elementos es: " + resultado);
        JOptionPane.showMessageDialog(null,"La media de todos los numeros ingresados es: " + media);
        JOptionPane.showMessageDialog(null,"La cantidad de numero Ingresados es: " + contador);
    }
}
