import javax.swing.JOptionPane;

/*Dadas las edades y alturas de 5 alumnos, mostrar la edad y la estatura media, la cantidad de alumnos mayores de 18 años, y la cantidad de alumnos que miden mas de 1.75 */

public class Ejercicio15 {
    public static void main(String[] args) {
        int edad, alturaMay = 0, edad18 = 0;
        float altura, alturaMed = 0, edadMedia = 0;

        

        for (int cantidad = 1; cantidad <= 5; cantidad++) {
            
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del Alumno Nº: "+cantidad));
            altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura del Alumno Nº: "+cantidad));

            edadMedia += edad;
            alturaMed += altura;

            if (edad > 18) {
                edad18 ++;
                
            }
            if (altura > 1.75) {
                alturaMay ++;
            
            }
           
        }

        edadMedia = (float) edadMedia / 5;
        alturaMed = (float) alturaMed / 5;

        JOptionPane.showMessageDialog(null, "\n La altura Promedio es: " + alturaMed 
        + "\n La edad Promedio es: " + edadMedia
        + "\n La cantidad de Alumnos mayores a 18 años es: "+ edad18
        + "\n La cantidad de Alumnos que miden mas de 1.75 es de: " + alturaMay);


    }
}
        

        


