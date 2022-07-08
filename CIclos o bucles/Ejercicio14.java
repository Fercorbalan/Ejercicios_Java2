import javax.swing.JOptionPane;

/*Pedir 10 Sueldos. Mostrar su suma y cuantos hay mayores de $1000 */

public class Ejercicio14 {
    public static void main(String[] args) {
        int sueld, contador = 1,cont1000 = 1, suma = 0;

        sueld = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Primer sueldo: $"));

        while (contador < 10) {
            suma += sueld;
            contador ++;
            if (sueld > 1000) {
                cont1000 ++;
            }
        
            sueld = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el " + contador +"º sueldo: $ "));

        }
        suma += sueld;
        JOptionPane.showMessageDialog(null, "\n La sumatoria de todos los sueldos es: $ " + suma 
        + "\n Y los sueldos mayores a $ 1000.- son: "+ cont1000);
    }
}
