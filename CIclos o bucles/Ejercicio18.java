import javax.swing.JOptionPane;
/**Hacer unas modificaciones al ejercicio anterior suponiendo que no se introduce el precio por litro. Solo existen tres productos con precios:
 * 1- 0.6   $/litro
 * 2- 3     $/litro
 * 3- 1.35  €/litro
 */

public class Ejercicio18 {
    public static void main(String[] args) {
        int facTotal = 0, fac600 = 0, cantCodigo1 = 0;
        float codigoArt, lts, precioFac;

        for (int i = 1; i <= 5; i++) {
            codigoArt = Integer.parseInt(JOptionPane.showInputDialog("\n Art"+i+"\nIngrese el codigo del Articulo: "));
            
            if (codigoArt == 1) {
                lts = Float.parseFloat(JOptionPane.showInputDialog("\n Art"+i+"Ingrese la cantidad de la cantidad de Litros vendidos: "));
                precioFac = lts * (6 / 10);
                facTotal += precioFac; //Facturación Total
                if (precioFac > 600) {
                    fac600 ++;
                }
                if (codigoArt == 1){
                    cantCodigo1 += lts;
                }
            }
            else if (codigoArt == 2) {
                lts = Float.parseFloat(JOptionPane.showInputDialog("\n Art"+i+"Ingrese la cantidad de la cantidad de Litros vendidos: "));
                precioFac = lts * 3;
                facTotal += precioFac; //Facturación Total
                if (precioFac > 600) {
                    fac600 ++;
                }
                if (codigoArt == 1){
                    cantCodigo1 += lts;
                }
            }
            else if (codigoArt == 3) {
                lts = Float.parseFloat(JOptionPane.showInputDialog("\n Art"+i+"Ingrese la cantidad de la cantidad de Litros vendidos: "));
                precioFac = lts * (125/10);
                facTotal += precioFac; //Facturación Total
                if (precioFac > 600) {
                    fac600 ++;
                }
                if (codigoArt == 1){
                    cantCodigo1 += lts;
                }
            }
            
        }
        JOptionPane.showMessageDialog(null, "\n Facturación Total: "+facTotal+
        "\nCantidad de Litros vendidos del art 1: "+cantCodigo1 + "Lts" +
        "\nFacturas superiores a los $ 600: "+fac600);
    }
}