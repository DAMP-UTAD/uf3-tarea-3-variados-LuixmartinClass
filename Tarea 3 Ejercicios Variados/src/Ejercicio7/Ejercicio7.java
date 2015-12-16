package Ejercicio7;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio7 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca numero de preguntas: ");
		int total = scan.nextInt();

		System.out.println("introduzca numero de respuestas: ");
		int respuestas = scan.nextInt();

		System.out.println("introduzca numero de respuestas correctas: ");
		int bien = scan.nextInt();

		int mal = (total - respuestas) + (respuestas - bien);
		int porcentaje = (100 * bien) / (bien + mal);
		if (porcentaje >= 90) {
			System.out.println("Nivel máximo con: " + porcentaje + "%");
		} else if (porcentaje >= 75 && porcentaje < 90) {
			System.out.println("Nivel medio con: " + porcentaje + "%");
		} else if (porcentaje >= 50 && porcentaje < 75) {
			System.out.println("Nivelregular con: " + porcentaje + "%");
		} else if (porcentaje < 50) {
			System.out.println("Fuera de nivel con: " + porcentaje + "%");
		}
	}
}
/*
 * Un postulante a un empleo, realiza un test de capacitación, se obtuvo la
 * siguiente información: cantidad total de preguntas que se le realizaron y la
 * cantidad de preguntas que contestó correctamente. Se pide confeccionar un
 * programa que ingrese los dos datos por teclado e informe el nivel del mismo
 * según el porcentaje de respuestas correctas que ha obtenido, y sabiendo que:
 */
// Nivel máximo: Porcentaje>=90%
// Nivel medio: Porcentaje>=75% y <90%
// Nivelregular: Porcentaje>=50% y <75%
// Fuera de nivel: Porcentaje<50%
