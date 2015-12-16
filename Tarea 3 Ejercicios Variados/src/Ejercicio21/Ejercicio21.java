package Ejercicio21;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio21 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca el numero de numeros");
		int a = scan.nextInt();
		int c=0;
		while(c<a){
			System.out.println("introduzca un numero");
			int b = scan.nextInt();
			if (b%2==0){
				System.out.println("es par");
			}else{
				System.out.println("es impar");
			}
			c++;
		}
	}
}
/*
 * Desarrollar un programa que permita cargar n números enteros y luego nos
 * informe cuántos valores fueron pares y cuántos impares. Emplear el operador
 * ?%? en la condición de la estructura condicional: if (valor%2==0) //Si el if
 * da verdadero luego es par
 */