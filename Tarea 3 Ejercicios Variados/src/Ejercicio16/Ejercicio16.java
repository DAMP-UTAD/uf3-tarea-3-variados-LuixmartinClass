package Ejercicio16;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca numero de personas: ");
		int p1 = scan.nextInt();
		double p2=p1;
		double p3=0;
		double resultado;
		while (p1>0){
			System.out.println("introduzca altura: ");
			double Alt = scan.nextDouble();
			p3+=Alt;
			p1--;
		}
		resultado=p3/p2;
		System.out.println(resultado+" m de promedio.");
	}
}
/*
 * Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la
 * altura promedio de las personas.
 */