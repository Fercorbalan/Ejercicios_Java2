import javax.swing.JOptionPane;

public class condicionales1 {
    public static void main(String[] args) {
        int numero, dato = 5;

        // Metodo para ingresar un numero:
        numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));

        //Si numero es igual a dato
        if(numero == dato){
            JOptionPane.showMessageDialog(null, "El numero es 5");
        }
        else{
            JOptionPane.showMessageDialog(null,"El numero es diferente es 5");
        }

    }
}
