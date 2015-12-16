package Ejercicio29;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio29 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca un numero de triangulos: ");
		int n = scan.nextInt();
		int equi = 0;
		int isos=0;
		int esca=0;
		for (int v = 0; v < n; v++) {
			System.out.println("introduce primer lado: ");
			int l1 = scan.nextInt();
			System.out.println("introduce primer lado: ");
			int l2 = scan.nextInt();
			System.out.println("introduce primer lado: ");
			int l3 = scan.nextInt();
			if(l1==l2&&l2==l3){
				System.out.println("es equilátero");
				equi++;
			}else if(l1==l2 ||l1==l3||l2==l3){
				System.out.println("es isósceles");
				isos++;
			}else if(l1!=l2 ||l1!=l3||l2!=l3){
				System.out.println("es escaleno");
				esca++;
			}
		}
		System.out.println("Hay "+equi+" triangulos equilátero hay "+isos+" triangulos isósceles hay "+esca+" triangulos escalenos");
		if (equi > isos) {
			if (equi > esca) {
				System.out.println("Hay mas equiláteros");
			} else if (isos > esca) {
				System.out.println("Hay mas isósceles");
			} else {
				System.out.println("Hay mas escalenos");
			}
		} else if (isos > esca) {
			System.out.println("Hay mas isósceles");
		} else {
			System.out.println("Hay mas escalenos");
		}
	}
}

/*
 * Realizar un programa que lea los lados de n triángulos, e informar: a) De
 * cada uno de ellos, qué tipo de triángulo es: equilátero (tres lados iguales),
 * isósceles (dos lados iguales), o escaleno (ningún lado igual) b) Cantidad de
 * triángulos de cada tipo. c) Tipo de triángulo que posee menor cantidad.
 */