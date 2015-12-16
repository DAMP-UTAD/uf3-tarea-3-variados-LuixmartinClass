package Ejercicio4;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca un numero: ");
		int n1 = scan.nextInt();
		System.out.println("introduzca un numero: ");
		int n2 = scan.nextInt();
		System.out.println("introduzca un numero: ");
		int n3 = scan.nextInt();

		if (n1 > n2) {
			if (n1 > n3) {
				System.out.println(n1 + " es el mayor.");
			} else if (n2 > n3) {
				System.out.println(n2 + " es el mayor.");
			} else {
				System.out.println(n3 + " es el mayor.");
			}
		} else if (n2 > n3) {
			System.out.println(n2 + " es el mayor.");
		} else {
			System.out.println(n3 + " es el mayor.");
		}

	}
}
/*
 * Se cargan por teclado tres números distintos. Mostrar por pantalla el mayor
 * de ellos
 */