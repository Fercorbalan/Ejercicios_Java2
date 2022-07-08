import javax.swing.JOptionPane;

//Pedir el día, mes y año de una fecha e indicar si la fecha e indicar si la fecha es correcta. Con mese de 28, 30 y 31 días. Sin años Bisiesto.

public class Ejercicio10 {
    public static void main(String[] args) {
        int dia, mes, año;

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año: "));

        if (mes == 2 && mes > 0) {
            if (dia <= 28) {
                                 
               }
            }
        }
    }
}
