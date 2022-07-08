import javax.swing.JOptionPane;

//Pedir 10 numero, y mostrar al final si se ha introducido alguno negativo.

public class Ejercicio21 {
    public static void main(String[] args) {
        int num, negativo = 0;

        for (int i = 1; i <= 10; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Nº: "+i));
            if (num < 0) {
                negativo ++;
            }
        }
        if (negativo > 0) {
            JOptionPane.showMessageDialog(null, "Se han introducido "+negativo +" numeros negativos");
                   
        }
        else{
            JOptionPane.showMessageDialog(null , "No se han introducido numeros negativos");
        }

    }
}
