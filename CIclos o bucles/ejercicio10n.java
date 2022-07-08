// Pedir 10 numeros y escribir la suma total

import javax.swing.JOptionPane;

public class ejercicio10n {
    public static void main(String[] args) {
        int num, contador = 0, sumador = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1er Numero: "));

        while (contador <= 10) {
             sumador = num + sumador;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el siguiente Numero: "));
            contador ++;
        }
        System.out.println("La suma de los 10 nuermos es :" + sumador);
    }
}
