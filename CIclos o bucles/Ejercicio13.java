import javax.swing.JOptionPane;

/*Pedir 10 numeros. Mostrar la media de los numeros positivos, la media de los numeros negativos y la cantidad de ceros.*/

public class Ejercicio13 {
    public static void main(String[] args) {
        int positivos = 0,conPos = 0, negativos = 0,conNeg = 0, ceros = 0, num, contador = 0;
        float medneg, medpos;

        num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el 1er numero: "));

        while (contador < 10){
            if (num > 0) {
                positivos = num + positivos;
                conPos ++;
            }
            else if (num < 0) {
                negativos = num + negativos;
                conNeg ++; 
            } 
            else if (num == 0) {
                ceros ++;
            }                
            contador ++;
            num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Siguiente Numero: "));
        }
        medpos = (float) positivos / conPos;
        medneg = (float) negativos / conNeg;

        JOptionPane.showMessageDialog(null, "\nLa media de los Negativos es: " + medneg
        + "\n La media de los Positivos es: " + medpos
        + "\n La cantidad de Ceros es: " + ceros);

    }
}
