import java.util.Scanner;

public class Ciclofor {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int contador;

            System.out.print("Digite la cantidad de terminos: ");
                contador = entrada.nextInt();
            
            for(int i=0; i<=contador; i+=2){ // for(inicializador; condicion; aumento o decremento)
                System.out.println(i);
            }
        }
     
    }
}
