import java.util.Scanner;

public class ejerciciocuatro {
    public static void main(String[] args) {
		Scanner escaner= new Scanner(System.in);
		// Mandar mensaje
		System.out.println("Escribe un número:");
		// Leer lo que se introduce
		double numero = escaner.nextDouble();
		// Comparar
		if (numero == 0) {
			System.out.println("El número es neutro");
		} else if (numero < 0) {
			System.out.println("El número es negativo");
		} else {
			System.out.println("El número es positivo");
		}
	}
}
