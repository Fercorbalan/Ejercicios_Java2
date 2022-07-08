import javax.swing.JOptionPane;

/*Una empresa se dedica a la venta de desifectantes necesita un programa para gestionar las facturas. En cada factura figura: el codigo del articulo, la cantidad
vendida en litros y el precio por litro. Se pide de 5 facturas introdicidas:
* Facturación Total.
* Cantidad en litros vendidos del articulo 1
* Cuantas facturas se emitieron de mas de $ 600.-*/


public class Ejercicio17 {
    public static void main(String[] args) {
        int facTotal = 0, fac600 = 0, cantCodigo1 = 0;
        float precioLitro, codigoArt, lts, precioFac;

        for (int i = 1; i <= 5; i++) {
            codigoArt = Integer.parseInt(JOptionPane.showInputDialog("\n Art"+i+"\nIngrese el codigo del Articulo: "));
            lts = Float.parseFloat(JOptionPane.showInputDialog("\n Art"+i+"Ingrese la cantidad de la cantidad de Litros vendidos: "));
            precioLitro = Float.parseFloat(JOptionPane.showInputDialog("\n Art"+i+"Ingrese el precio por litro: "));
            precioFac = lts * precioLitro; //busqueda de facturas superiores a $600
            facTotal += precioFac; //Facturación Total
                if (precioFac > 600) {
                    fac600 ++;
                }
                if (codigoArt == 1){
                    cantCodigo1 += lts;
                }
            }
    JOptionPane.showMessageDialog(null, "\n Facturación Total: "+facTotal+
    "\nCantidad de Litros vendidos del art 1: "+cantCodigo1 + "Lts" +
    "\nFacturas superiores a los $ 600: "+fac600);
    }
}
