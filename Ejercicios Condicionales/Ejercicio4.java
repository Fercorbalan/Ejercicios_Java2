import javax.swing.JOptionPane;

/*Un obrero necesita calcular su salario semanal, el cual se obtiene de la siguiente manera:
* Si trabaja 40hs o menos se le paga $16 por hora
* Si trabaja mas de 40 hs se le paga $ 16 por cada una de las primeras 40hs y $20 por cada hora extra
*/

public class Ejercicio4 {
    public static void main(String[] args) {
        int HsTrab;
        float Salosem, extras;


        HsTrab = Integer.parseInt(JOptionPane.showInputDialog("Ingrese las Horas trabajadas: "));

        if (HsTrab <= 40){
            Salosem = 16 * HsTrab;
            JOptionPane.showMessageDialog(null, "Iporte a Cobrar: $ " + Salosem + ".-");
        }
        else{
            Salosem = 16 * 40;
            extras = (HsTrab - 40) * 20;
            JOptionPane.showMessageDialog(null, "Importe a Cobrar Hs Basicas: $ " + Salosem + " y por Hs extras: $ " + extras + ".-");
        }

    }
}
