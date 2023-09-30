import java.util.Scanner;

public class ejerciciodiez {
    public static void main(String[] argumentos) {
        Scanner sc = new Scanner(System.in);
        int numero, multiplo;
        System.out.println("Ingresa un número: ");
        numero = sc.nextInt();
        System.out.println("Ingresa un múltiplo: ");
        multiplo = sc.nextInt();
        if (numero % multiplo == 0) {
            System.out.printf("%d es múltiplo de %d", numero, multiplo);
        } else {
            System.out.println("No es múltiplo");
        }
    }
}
