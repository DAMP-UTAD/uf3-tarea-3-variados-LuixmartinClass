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
				System.out.println("es equil�tero");
				equi++;
			}else if(l1==l2 ||l1==l3||l2==l3){
				System.out.println("es is�sceles");
				isos++;
			}else if(l1!=l2 ||l1!=l3||l2!=l3){
				System.out.println("es escaleno");
				esca++;
			}
		}
		System.out.println("Hay "+equi+" triangulos equil�tero hay "+isos+" triangulos is�sceles hay "+esca+" triangulos escalenos");
		if (equi > isos) {
			if (equi > esca) {
				System.out.println("Hay mas equil�teros");
			} else if (isos > esca) {
				System.out.println("Hay mas is�sceles");
			} else {
				System.out.println("Hay mas escalenos");
			}
		} else if (isos > esca) {
			System.out.println("Hay mas is�sceles");
		} else {
			System.out.println("Hay mas escalenos");
		}
	}
}

/*
 * Realizar un programa que lea los lados de n tri�ngulos, e informar: a) De
 * cada uno de ellos, qu� tipo de tri�ngulo es: equil�tero (tres lados iguales),
 * is�sceles (dos lados iguales), o escaleno (ning�n lado igual) b) Cantidad de
 * tri�ngulos de cada tipo. c) Tipo de tri�ngulo que posee menor cantidad.
 */