package Ejercicio32;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio32 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int man=0;
		int tar=0;
		int noch=0;
		System.out.println("introduzca edad de los alumnos de por la mañana: ");
		for (int v = 1; v <= 50; v++) {
			System.out.println("introduzca edad de los alumno: ");
			int x = scan.nextInt();
			man+=x;
		}
		int medm=(man)/50;
		System.out.println("la edad promedio por la mañana: "+medm);
		System.out.println("introduzca edad de los alumnos de por la tarde: ");
		for (int v = 1; v <= 60; v++) {
			System.out.println("introduzca edad de los alumno: ");
			int c = scan.nextInt();
			tar+=c;
		}
		int medt=(man)/50;
		System.out.println("la edad promedio de por la tarde: "+medt);
		System.out.println("introduzca edad de los alumnos de por la noche: ");
		for (int v = 1; v <= 110; v++) {
			System.out.println("introduzca edad de los alumno: ");
			int z = scan.nextInt();
			noch+=z;
		}
		int medn=(man)/50;
		System.out.println("la edad promedio de por la noche: "+medn);
		int med=(medm+medt+medn)/3;
		System.out.println("la edad promedio es: "+med);
		
		if (medm > medt) {
			if (medm > medn) {
				System.out.println(medm + " es la mayor.");
			} else if (medt > medn) {
				System.out.println(medt + " es la mayor.");
			} else {
				System.out.println(medn + " es la mayor.");
			}
		} else if (medt > medn) {
			System.out.println(medt + " es la mayor.");
		} else {
			System.out.println(medn + " es la mayor.");
		}
	}
}
/*Se cuenta con la siguiente información:
Las edades de 50 estudiantes del turno mañana.
Las edades de 60 estudiantes del turno tarde.
Las edades de 110 estudiantes del turno noche.
Las edades de cada estudiante deben ingresarse por teclado.
Se desea:
a) Obtener el promedio de las edades de cada turno (tres promedios)
b) Imprimir dichos promedios (promedio de cada turno)
c) Mostrar por pantalla un mensaje que indique cual de los tres turnos
tiene un promedio de edades mayor.*/