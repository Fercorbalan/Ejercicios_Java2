import javax.swing.JOptionPane;

/*Pedir un numero N, introducir N sueldos, y mostrar el sueldos maximo */

public class Ejercicio20 {
    public static void main(String[] args) {
        int cantSueldos;
        float sueldos, sueldoMaximo = 0;

        cantSueldos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de sueldos a Contabilizar"));

        for (int i = 1; i <= cantSueldos; i++) {
            sueldos = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el sueldos Nº: "+i));
            if (sueldos >= sueldoMaximo) {
                sueldoMaximo = sueldos;
            }
           
        }
        JOptionPane.showMessageDialog(null, "De los "+ cantSueldos + " sueldos ingresados el Maximo fue de: " + sueldoMaximo);
        
    }
}
