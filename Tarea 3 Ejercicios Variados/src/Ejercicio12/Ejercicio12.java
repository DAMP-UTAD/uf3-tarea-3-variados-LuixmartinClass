package Ejercicio12;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca x: ");
		int x = scan.nextInt();

		System.out.println("introduzca y: ");
		int y = scan.nextInt();
		
		if (x==0 || y==0){
			System.out.println("el valor de x e y ha de ser diferente de 0.");
		}else if(x > 0 && y > 0){
			System.out.println("Está en el primer cuadrante.");
		}else if (x < 0 && y > 0){
			System.out.println("Está en el segundo cuadrante.");
		}else if(x > 0 && y < 0){
			System.out.println("Está en el tercer cuadrante.");
		}else if(x < 0 && y < 0){
			System.out.println("Está en el cuarto cuadrante.");
		}
	}
}
/*
 * Escribir un programa que pida ingresar la coordenada de un punto en el plano,
 * es decir dos valores enteros x e y (distintos a cero). Posteriormente
 * imprimir en pantalla en que cuadrante se ubica dicho punto. (1º Cuadrante si
 * x > 0 Y y > 0 , 2º Cuadrante: x < 0 Y y > 0, etc.)
 */