package Ejercicio27;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio27 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca un numero del 1 al 10: ");
		int n = scan.nextInt();
		while(n<1 || n>10){
			if(n<1 || n>10){
				System.out.println("introduzca un numero del 1 al 10: ");
				n = scan.nextInt();
			}
		}
		for (int v = 1; v <= 12; v++) {
			System.out.println(n + " * " + v + " = " + n * v);
		}
		
	}
}
/*
 * Confeccionar un programa que permita ingresar un valor del 1 al 10 y nos
 * muestre la tabla de multiplicar del mismo (los primeros 12 términos) Ejemplo:
 * Si ingreso 3 deberá aparecer en pantalla los valores 3, 6, 9, hasta el 36.
 */