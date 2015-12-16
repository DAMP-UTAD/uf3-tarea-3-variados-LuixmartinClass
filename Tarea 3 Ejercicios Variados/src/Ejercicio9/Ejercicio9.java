package Ejercicio9;
/**
 * @author luis.tallafigo
 */
import java.util.Scanner;

public class Ejercicio9 {
	public static void main(String[] args) {
		int resultado;
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca un numero: ");
		int n1 = scan.nextInt();

		System.out.println("introduzca un numero: ");
		int n2 = scan.nextInt();

		System.out.println("introduzca un numero: ");
		int n3 = scan.nextInt();

		if (n1 == n2 && n2 == n3) {
			System.out
					.println("(" + n1 + " + " + n2 + ")" + " * " + n3 + " = ");
			resultado = (n1 + n2) * n3;
			System.out.println(resultado);
		}else {
			System.out.println("no son iguales.");
		}
	}
}
/*
 * Se ingresan tres valores por teclado, si todos son iguales se imprime la suma
 * del primero con el segundo y a éste resultado se lo multiplica por el
 * tercero.
 */