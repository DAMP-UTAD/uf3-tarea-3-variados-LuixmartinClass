package Ejercicio24;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio24 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca numero de triangulos:");
		int a = scan.nextInt();
		double sup;
		int triN= 0;
		for(int v=0;v<a;v++){
			System.out.println("introduce base: ");
			double bas = scan.nextDouble();
			System.out.println("introduce altura: ");
			double alt = scan.nextDouble();
			sup= (bas*alt)/2;
			System.out.println("El triangulo de base "+bas+" y altura "+alt+" tiene una superficie de "+sup);
			if(sup>12){
				triN++;
			}
		}
		if (triN!=0){
			System.out.println("hay "+triN+" triangulos de superficie mayor de 12");
		}else{
			System.out.println("no hay triangulos con superficie mayor de 12");
		}
	}
}
/*
 * Confeccionar un programa que lea n pares de datos, cada par de datos
 * corresponde a la medida de la base y la altura de un triángulo. El programa
 * deberá informar:
 */
/* a) De cada triángulo la medida de su base, su altura y su superficie. */
/* b) La cantidad de triángulos cuya superficie es mayor a 12. */