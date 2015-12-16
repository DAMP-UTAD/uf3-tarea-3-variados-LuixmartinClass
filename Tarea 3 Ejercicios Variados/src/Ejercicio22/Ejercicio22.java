package Ejercicio22;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio22 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca 9999 para finalizar");
		boolean a = true;
		int total=0;
		while(a){
			System.out.println("introduzca numero: ");
			int b = scan.nextInt();
			if (b==9999){
				a=false;
				System.out.println("fin");
			}else{
				total+=b;
			}
    		
		}
		System.out.println("valor acumulado "+total);
	}
}
/*
 * Realizar un programa que acumule (sume) valores ingresados por teclado hasta
 * ingresar el 9999 (no sumar dicho valor, indica que ha finalizado la carga).
 * Imprimir el valor acumulado e informar si dicho valor es cero, mayor a cero o
 * menor a cero.
 */