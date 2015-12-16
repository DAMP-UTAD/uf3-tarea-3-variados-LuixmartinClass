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
 * Se ingresa por teclado un número positivo de uno o dos dígitos (1..99)
 * mostrar un mensaje indicando si el número tiene uno o dos dígitos. (Tener en
 * cuenta que condición debe cumplirse para tener dos dígitos, un número entero)
 */