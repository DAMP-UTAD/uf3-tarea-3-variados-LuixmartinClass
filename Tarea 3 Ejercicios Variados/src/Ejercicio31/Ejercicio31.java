package Ejercicio31;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio31 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int neg = 0;
		int pos = 0;
		int mul = 0;
		int par = 0;
		System.out.println("introduzca 10 numeros: ");
		for (int v = 1; v <= 1; v++) {
			System.out.print("introduzca un numero: ");
			int n = scan.nextInt();
			if (n < 0) {
				neg++;
			} else if (n > 0) {
				pos++;
			} else if (n % 2 == 0) {
				par++;
			}
			if (15 % n == 0) {
				mul++;
			}

		}
		System.out.println("Hay " + neg + " numeros negativos ," + pos
				+ " numeros positivos, " + mul + " multiplos de 15 y " + par
				+ " como sumatorio total de pares.");
	}
}
/*
 * Se realiza la carga de 10 valores enteros por teclado. Se desea conocer: a)
 * La cantidad de valores ingresados negativos. b) La cantidad de valores
 * ingresados positivos. c) La cantidad de múltiplos de 15. d) El valor
 * acumulado de los números ingresados que son pares.
 */