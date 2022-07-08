import javax.swing.JOptionPane;

//Leer un numero y mostrar su cuadrado, repetir el proceso hasta que se introduzca un numero negativo.

public class Ejercicio1 {
    public static void main(String[] args) {
        int num, cuadrado;

        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero a operar: "));

        while (num >=0 ) {
            cuadrado = (int)Math.pow(num,2);
            JOptionPane.showMessageDialog(null, "El numero " + num + " elevado al cuadrado es " + cuadrado);
            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero a operar: "));
        }

    }    
}
