package Ejercicio1;
/**
 * @author luis.tallafigo
 */
import java.util.Scanner;

public class Ejercicio1 {
	public static void main(String[] args) {
		int resultado;
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca el numero de numeros: ");
		int n1 = scan.nextInt();
		System.out.println("introduzca el numero de numeros: ");
		int n2 = scan.nextInt();
		
		if (n1>n2){
			resultado = n1 + n2;
			System.out.println(n1 + " + " + n2 + " = " + resultado);
			resultado = n1 - n2;
			System.out.println(n1 + " - " + n2 + " = " + resultado);
		} else if (n1<n2){
			resultado = n1 * n2;
			System.out.println(n1 + " * " + n2 + " = " + resultado);
			resultado = n1 / n2;
			System.out.println(n1 + " / " + n2 + " = " + resultado);
		} else {
			System.out.println("Son iguales.");
		}
	}
}
/*
 * Realizar un programa que lea por teclado dos números, si el primero es mayor
 * al segundo informar su suma y diferencia, en caso contrario informar el
 * producto y la división del primero respecto al segundo.
 */