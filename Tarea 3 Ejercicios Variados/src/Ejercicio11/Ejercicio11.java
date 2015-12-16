package Ejercicio11;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca un numero: ");
		int n1 = scan.nextInt();

		System.out.println("introduzca un numero: ");
		int n2 = scan.nextInt();

		System.out.println("introduzca un numero: ");
		int n3 = scan.nextInt();

		if (n1 < 10 || n2 < 10 || n3 < 10) {
			System.out.println("Alguno de los números es menor a diez");
		}
	}
}
/*
 * Se ingresan por teclado tres números, si al menos uno de los valores
 * ingresados es menor a 10, imprimir en pantalla la leyenda "Alguno de los
 * números es menor a diez".
 */