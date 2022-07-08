import javax.swing.JOptionPane;

/*Pide un numero (que debe estar entre 0 y 10) y mostrar la tabla de multiplicar de dicho numero*/

public class Ejercicio16 {
    public static void main(String[] args) {
        int num, resultado, contador = 0, mult = 0;

        num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero del 0 al 10"));
        while (num >= 0 && num <= 10) {
            if (num >= 0 && num <= 10) {
                while (contador <= 10) {
                    resultado = num * mult;
                    System.out.println(num+" x "+mult +" = "+resultado);
                    contador ++;
                    mult ++;
                }

            }
            else {
                System.out.println("Fin del programa");
            }
        }
    }

}

