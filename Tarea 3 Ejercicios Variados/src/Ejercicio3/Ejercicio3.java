package Ejercicio3;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca un numero: ");
		int n1 = scan.nextInt();
		if(n1>0 && n1<10){
			System.out.println("Tiene un digito.");
		} else if (n1>9 && n1<100){
			System.out.println("Tiene dos digitos.");
		} else if (n1<1){
			System.out.println("es nulo o negativo.");
		} else {
			System.out.println("Tiene mas de dos digitos.");
		}
	}
}
/*
 * Se ingresa por teclado un n�mero positivo de uno o dos d�gitos (1..99)
 * mostrar un mensaje indicando si el n�mero tiene uno o dos d�gitos. (Tener en
 * cuenta que condici�n debe cumplirse para tener dos d�gitos, un n�mero entero)
 */