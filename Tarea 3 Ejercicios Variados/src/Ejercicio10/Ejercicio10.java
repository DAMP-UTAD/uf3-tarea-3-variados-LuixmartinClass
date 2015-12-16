package Ejercicio10;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio10 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca un numero: ");
		int n1 = scan.nextInt();

		System.out.println("introduzca un numero: ");
		int n2 = scan.nextInt();

		System.out.println("introduzca un numero: ");
		int n3 = scan.nextInt();

		if (n1 < 10 && n2 < 10 && n3 < 10) {
			System.out.println("todos los numeros son menores de 10.");
		} else {
			System.out.println("no todos los numeros son menores de 10.");
		}
	}
}
/*
 * Se ingresan por teclado tres números, si todos los valores ingresados son
 * menores a 10, imprimir en pantalla la leyenda "Todos los números son menores
 * a diez".
 */