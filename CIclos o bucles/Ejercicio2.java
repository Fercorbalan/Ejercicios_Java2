import javax.swing.JOptionPane;

//Leer un numero e indicar si es positivo o negativo. El proceso se repetira hasta que se introduzca un 0;

public class Ejercicio2 {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero a comprobar"));

        while (num != 0) {
            if (num > 0){
                JOptionPane.showMessageDialog(null, "EL numero es positivo");
            }
            else{
                JOptionPane.showMessageDialog(null, "EL numero es negativo");
            }
            num = Integer.parseInt(JOptionPane.showInputDialog("ingrese el numero a comprobar"));
        }
        JOptionPane.showMessageDialog(null,"Gracias por usar nuestro programa");
    }
}
