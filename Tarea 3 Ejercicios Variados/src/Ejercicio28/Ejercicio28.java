package Ejercicio28;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio28 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca un numero de puntos: ");
		int n = scan.nextInt();
		int c1 = 0, c2 = 0, c3 = 0, c4 = 0,c0=0;
		for (int v = 1; v <= n; v++) {
			System.out.println("introduzca x: ");
			int x = scan.nextInt();

			System.out.println("introduzca y: ");
			int y = scan.nextInt();

			if (x == 0 || y == 0) {
				System.out
						.println("el valor de x e y ha de ser diferente de 0.");
			} else if (x > 0 && y > 0) {
				System.out.println("Está en el primer cuadrante.");
				c1++;
			} else if (x < 0 && y > 0) {
				System.out.println("Está en el segundo cuadrante.");
				c2++;
			} else if (x > 0 && y < 0) {
				System.out.println("Está en el tercer cuadrante.");
				c3++;
			} else if (x < 0 && y < 0) {
				System.out.println("Está en el cuarto cuadrante.");
				c4++;
			}
		}
		System.out.println("Hay " + c1 + " puntos en el primer cuadrante, hay "
				+ c2 + " puntos en el segundo cuadrante, hay " + c3
				+ " puntos en el tercer cuadrante y hay " + c4
				+ " puntos en el cuarto cuadrante.");
	}
}
/*
 * Informar cuántos puntos se han ingresado en el primer, segundo, tercer y
 * cuarto cuadrante. Al comenzar el programa se pide que se ingrese la cantidad
 * de puntos a procesar.
 */