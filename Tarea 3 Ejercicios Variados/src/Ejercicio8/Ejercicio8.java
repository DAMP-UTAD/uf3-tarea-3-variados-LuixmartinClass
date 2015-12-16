package Ejercicio8;

/**
 *  @author luis.tallafigo
 */
import java.util.Scanner;

public class Ejercicio8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca dia: ");
		int dia = scan.nextInt();

		System.out.println("introduzca mes: ");
		int mes = scan.nextInt();

		System.out.println("introduzca a�o: ");
		int a�o = scan.nextInt();

		if (dia > 30 || dia < 0) {
			System.err.println("ese dia no existe.");
		} else if (mes > 12 || mes < 0) {
			System.err.println("ese mes no existe");
		} else if (dia == 25 && mes == 12) {
			System.out.println("El " + dia + " / " + mes + " / " + a�o
					+ " es navidad");
		} else {
			System.out.println("El " + dia + " / " + mes + " / " + a�o
					+ " no es navidad");
		}
	}

}
/*
 * Realizar un programa que pida cargar una fecha cualquiera, luego verificar si
 * dicha fecha corresponde a Navidad.
 */