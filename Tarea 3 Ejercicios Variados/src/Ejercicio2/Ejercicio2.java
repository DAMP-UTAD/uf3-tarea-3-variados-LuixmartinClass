package Ejercicio2;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio2 {
	public static void main(String[] args) {
		int media;
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca nota de x: ");
		int n1 = scan.nextInt();

		System.out.println("introduzca nota de y: ");
		int n2 = scan.nextInt();

		System.out.println("introduzca nota de z: ");
		int n3 = scan.nextInt();

		media = (n1 + n2 + n3) / 3;

		if (media >= 7) {
			System.out.println("promocionado");
		} else if (media < 7) {
			System.out.println("no promocionado");
		}
	}
}
/*
 * Se ingresan tres notas de un alumno, si el promedio es mayor o igual a siete
 * mostrar un mensaje "Promocionado".
 */