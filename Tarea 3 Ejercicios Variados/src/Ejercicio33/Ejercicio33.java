package Ejercicio33;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio33 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca numero: ");
		int n = scan.nextInt();
		int prim=0;
		for (int v = 1; v < (n+1); v++) {
			int x=v;
			if(x%v==0){
				System.out.println(v+" es primo.");
				prim++;
			}
		}
		
	}
}
/*
 * Realizar un programa que nos pida un número n, y nos diga cuantos números hay
 * entre 1 y n que son primos.
 */