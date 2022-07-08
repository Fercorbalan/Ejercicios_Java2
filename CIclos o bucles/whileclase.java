import java.util.Scanner;

public class whileclase {
    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            int i=1, contador;

            System.out.print("Digite cuantos numeros quiere en pantalla: ");
            contador = entrada.nextInt();

            while (i<=contador) {
                System.out.println(i); //1,2,.....,10
                i += 2;
            }
        }
    }
}
