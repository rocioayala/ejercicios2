import java.util.Scanner;

public class ejerciciodos {
    public static void main(String[] args) {
        try {
            Scanner teclado;
            int numero;
            int divi1 = 2;
            int divi2 = 3;
            System.out.print("Introduce un número: ");
            teclado = new Scanner(System.in);
            numero = teclado.nextInt();
            if ((numero % divi2 == 0) && (numero % divi1 == 0));
            System.out.println("El número que has metido, es divisible: " + divi1 + " y " + divi2);
        } catch (Exception e) {
            System.out.println("El número que has metido, no es divisible o no has metido un número.");
        }
    }
}
	

