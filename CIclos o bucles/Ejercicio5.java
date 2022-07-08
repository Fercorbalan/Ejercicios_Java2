import javax.swing.JOptionPane;

//Realizar un juego para adivinar un numero. Para ello generar un numero aleatorio entre 0-100 y luego ir pidiendo 
//numeros indicados "es mayor" o "es menor" segun sea mayor o menor con respecto a N. 
//El proceso termina cunado el usuario acierta y mostrar el numero de intentos

public class Ejercicio5 {
    public static void main(String[] args) {
        int num, aleatorio, contador = 0;
        
        aleatorio = (int) (Math.random()*100);

        do{
            num =Integer.parseInt(JOptionPane.showInputDialog("ingrese el valor:"));
            if(aleatorio > num){
                JOptionPane.showMessageDialog(null, "Digite un numero Mayor");
            }
            else if( aleatorio < num){
                JOptionPane.showMessageDialog(null, "Digite un numero Menor");
            }
            else{
                JOptionPane.showMessageDialog(null, "¡¡¡ FELICIDADES ENCONTRASTE EL NUMERO !!!");
            }
            contador++;
            
        }while(num != aleatorio);
        
        JOptionPane.showMessageDialog(null, "Genial acertaste en el intento Nº: " + contador);

    }
}
