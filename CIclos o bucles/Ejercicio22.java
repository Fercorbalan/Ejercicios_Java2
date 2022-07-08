import javax.swing.JOptionPane;

// Pedir 5 calificaiciones de alumnos y decir al final si hay algún suspenso

public class Ejercicio22 {
    public static void main(String[] args) {
        int calificacion, suspensos = 0;
        
        for (int i = 1; i <= 5 ; i++) {
            do{
            calificacion = Integer.parseInt(JOptionPane.showInputDialog("ingrese la nota Nº: "+i));

            }while (calificacion < 0 || calificacion > 10);
            if (calificacion < 4) {
            suspensos ++;
            }
        }
        if (suspensos > 0) {
            JOptionPane.showMessageDialog(null, "Hay "+suspensos+" alumnos suspensos");
        }  
        else{
            JOptionPane.showMessageDialog(null, "No hay alumnos suspensos");
        }

    }
}
