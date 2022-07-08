import javax.swing.JOptionPane;

public class Ejercicio4 {
    public static void main(String[] args) {
        int num; 
        int contador = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero: "));

        while (num > 0) {
            contador ++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el siguiente numero: "));
            }
        JOptionPane.showMessageDialog(null, "La cantidad de numeros ingresados fueron: " + contador);
    }
}
