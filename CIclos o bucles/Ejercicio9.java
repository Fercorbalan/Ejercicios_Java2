//Escribir todos los numeros del 100 al 0 de 7 en 7

public class Ejercicio9 {
    public static void main(String[] args) {
        int sumador = 100;

        do {
            System.out.println(sumador);
            sumador -= 7;
        } while (sumador >= 0);

            System.out.println(sumador);
            sumador -= 7;

        for (int in = 100; in>=0; in-=7){
            System.out.println(in);
        }
    }
}
