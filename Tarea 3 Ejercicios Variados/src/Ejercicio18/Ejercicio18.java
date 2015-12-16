package Ejercicio18;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio18 {
	public static void main(String[] args) {
		int terminos = 25;
		int resul = 0;
		while (terminos != 0) {
			resul += 11;
			System.out.println(resul);
			terminos--;
		}
	}
}
/*
 * Realizar un programa que imprima 25 términos de la serie 11 - 22 - 33 - 44,
 * etc. (No se ingresan valores por teclado)
 */