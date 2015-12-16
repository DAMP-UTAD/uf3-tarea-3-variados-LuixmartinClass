package Ejercicio30;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio30 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca 4 puntos: ");
		for (int v = 1; v <= 4; v++) {
			System.out.println("introduzca x: ");
			int x = scan.nextInt();

			System.out.println("introduzca y: ");
			int y = scan.nextInt();

			if (x == 0 || y == 0) {
				System.out
						.println("el valor de x e y ha de ser diferente de 0.");
			} else if (x > 0 && y > 0) {
				System.out.println("El punto (" + x + "," + y
						+ ") está en el primer cuadrante.");
			} else if (x < 0 && y > 0) {
				System.out.println("El punto (" + x + "," + y
						+ ") está en el segundo cuadrante.");
			} else if (x > 0 && y < 0) {
				System.out.println("El punto (" + x + "," + y
						+ ") está en el tercer cuadrante.");
			} else if (x < 0 && y < 0) {
				System.out.println("El punto (" + x + "," + y
						+ ") está en el cuarto cuadrante.");
			}
		}
	}
}
/*
 * Escribir un programa que pida ingresar coordenadas (x,y) que representan
 * puntos en el plano.
 */