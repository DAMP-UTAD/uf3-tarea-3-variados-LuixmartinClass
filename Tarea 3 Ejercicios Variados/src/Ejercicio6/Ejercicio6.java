package Ejercicio6;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio6 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca un numero: ");
		int n = scan.nextInt();

		if (n > -1 && n < 10) {
			System.out.println("una cifra");
		} else if (n > 9 && n < 100) {
			System.out.println("dos cifras");
		} else if (n > 99 && n < 1000) {
			System.out.println("tres cifras");
		} else if (n > 999) {
			System.out.println("es demasiado grande");
		} else {
			System.out.println("es negativo");
		}
	}
}
/*
 * Confeccionar un programa que permita cargar un número entero positivo de
 * hasta tres cifras y muestre un mensaje indicando si tiene 1, 2, o 3 cifras.
 * Mostrar un mensaje de error si el número de cifras es mayor.
 */