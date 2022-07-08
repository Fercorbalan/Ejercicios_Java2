import javax.swing.JOptionPane;

//Pedir una nota de 0 a 10 y mostrarla de la forma Insuficiente, Suficiente, Bien, Notable y Sobresaliente

public class ejercicio12 {
    public static void main(String[] args) {
        int nota;
        String resultado;

        nota = Integer.parseInt(JOptionPane.showInputDialog("ingrese la Nota del alumno"));

        switch (nota) {
            case 10: resultado = "Sobresaliente";
                JOptionPane.showMessageDialog(null, "El resultado fue " + resultado);
                break;
            case 9: resultado = "Notable";
                JOptionPane.showMessageDialog(null, "El resultado fue " + resultado);
                break;
            case 8:
            case 7: resultado = "Bien";
                JOptionPane.showMessageDialog(null, "El resultado fue " + resultado);
                break;
            case 6: resultado = "Suficiente";
                JOptionPane.showMessageDialog(null, "El resultado fue " + resultado);
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1: resultado = "Insuficiente";
                JOptionPane.showMessageDialog(null, "El resultado fue " + resultado);
                break;
            default:
            JOptionPane.showMessageDialog(null, "El valor ingresado no es valido");
                break;
        }

    }
}
