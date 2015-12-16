package Ejercicio14;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca tres numeros: ");
		int n1 = scan.nextInt();
		int n2 = scan.nextInt();
		int n3 = scan.nextInt();

		if (n1 == n2 && n2 == n3) {
			System.out.println("Tienen que ser diferentes.");
		} else if (n1 > n2 && n1 > n3) {
			System.out.println(n1 + " es el mayor.");
			if (n2 < n1 && n2 < n3) {
				System.out.println(n2 + " es el menor.");
			} else if (n3 < n2 && n1 > n3) {
				System.out.println(n3 + " es el menor.");
			}
		} else if (n2 > n1 && n2 > n3) {
			System.out.println(n2 + " es el mayor.");
			if (n1 < n2 && n1 < n3) {
				System.out.println(n1 + " es el menor.");
			} else if (n3 < n2 && n1 > n3) {
				System.out.println(n3 + " es el menor.");
			}

		} else if (n3 > n2 && n1 < n3) {
			System.out.println(n3 + " es el mayor.");
			if (n1 < n2 && n1 < n3) {
				System.out.println(n1 + " es el menor.");
			} else if (n2 < n1 && n2 < n3) {
				System.out.println(n2 + " es el menor.");
			}
		}
	}
}

/*
 * Escribir un programa en el cual: dada una lista de tres valores numéricos
 * distintos se calcule e informe su rango de variación (debe mostrar el mayor y
 * el menor de ellos)
 */