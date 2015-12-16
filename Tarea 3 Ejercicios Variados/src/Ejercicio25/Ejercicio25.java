package Ejercicio25;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio25 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int suma = 0;
		for(int v=0;v<10;v++){
			System.out.println("introduce un numero: ");
			double n = scan.nextDouble();
			if(v>=5){
				suma+=n;
			}
			
		}
		System.out.println(suma);
	}
}
/*
 * Desarrollar un programa que solicite la carga de 10 números e imprima la suma
 * de los últimos 5 valores ingresados.
 */