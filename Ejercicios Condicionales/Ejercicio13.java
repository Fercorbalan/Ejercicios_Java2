import javax.swing.JOptionPane;

/* Hacer un programa que simule un cajero automatico con un saldo Inicial de $1000 Dólares, con el siguiente menu de opciones:
1. Ingresar dinero a la cuenta
2. Retirar dinero de la cuenta
3. Salir
*/

public class Ejercicio13 {
    public static void main(String[] args) {
        float deposito, extraccion, saldofinal, saldoInicial;
        int opcion;
        saldoInicial = 1000;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("Bienvenido al su cajero Automatico\n"
        + "1. Ingresar dinero a la cuenta\n"
        + "2. Retirar dinero de la cuenta\n"
        + "3. Salir\n"));

        switch (opcion) {
            case 1: deposito = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea Ingresar: $ "));
                    saldofinal = deposito + saldoInicial;
                    JOptionPane.showMessageDialog(null, "El saldo actual $" + saldofinal);
                break;
            case 2: extraccion = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea Retirar: $ "));
                    if (extraccion > saldoInicial){
                        JOptionPane.showMessageDialog(null,"EL importe seleccionado es mayor al saldo, Ingrese un valor menor a: $ " + saldoInicial);
                        extraccion = Float.parseFloat(JOptionPane.showInputDialog("Digite la cantidad que desea Retirar: $ "));
                        saldofinal = saldoInicial - extraccion;
                        JOptionPane.showMessageDialog(null, "El saldo actual $" + saldofinal);
                    }
                    else {
                        saldofinal = saldoInicial - extraccion;
                        JOptionPane.showMessageDialog(null, "El saldo actual $" + saldofinal);
                    }
                break;
            case 3: JOptionPane.showMessageDialog(null,"Gracias por Operar con este cajero, su saldo es $ " + saldoInicial);
                break;
            default:
                JOptionPane.showMessageDialog(null,"su opcion es incorrecta");
                break;
        }
            
    }

}

