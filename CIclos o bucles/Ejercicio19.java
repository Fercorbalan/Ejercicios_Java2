import javax.swing.JOptionPane;

/* Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (=4) y suspensos*/

public class Ejercicio19 {
    public static void main(String[] args) {
        int aprobados = 0, condicionados = 0, suspensos = 0;
        float notas;

        for (int i = 1; i <= 6; i++) {
            do{
                notas = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la nota del alumno Nº:" +i));
            } while (notas <0 || notas>10);
            if (notas >=5) {
                aprobados ++;
            }
            else if (notas == 4) {
                condicionados ++;
            }
            else if (notas < 4) {
                suspensos ++;
            }
        }
        JOptionPane.showMessageDialog(null, "Alumnos aprobados es: " + aprobados + "\n Alumnos condicionados" + condicionados + "\n Alumnos suspensos" +suspensos);
    }
}
