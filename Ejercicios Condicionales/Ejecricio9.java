import javax.swing.JOptionPane;
import javax.lang.model.util.ElementScanner6;

// Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo que todos los meses son de 30 días.

public class Ejecricio9 {
    public static void main(String[] args) {
        int dia, mes, año; 

        dia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el día: "));
        mes = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Mes: "));
        año = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Año: "));

        if (dia < 31 && mes < 13 && dia > 0 && mes > 0 && año > 0){
            JOptionPane.showMessageDialog(null, "La Fecha Ingresada es Correcta: " + dia + "/" + mes + "/" + año);
        }
        else{
            JOptionPane.showMessageDialog(null,"La fecha ingresada es incorrecta");
        }
    }
}
