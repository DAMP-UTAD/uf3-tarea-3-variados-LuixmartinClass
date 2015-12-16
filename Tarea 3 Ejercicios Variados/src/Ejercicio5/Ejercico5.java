package Ejercicio5;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercico5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca un numero: ");
		int n = scan.nextInt();
		if(n>0) {
			System.out.println("positivo");
		}else if (n<0){
			System.out.println("negativo");
		}else{
			System.out.println("nulo");
		}
	}
}
/*
 * Se ingresa por teclado un valor entero, mostrar una leyenda que indique si el
 * número es positivo, nulo o negativo.
 */