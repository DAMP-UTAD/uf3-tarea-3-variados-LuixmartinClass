package Ejercicio13;
/**
 * @author luis.tallafigo
 */
import java.util.Scanner;

public class Ejercicio13 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca sueldo: ");
		int suel = scan.nextInt();

		System.out.println("introduzca a�os de antiguedad: ");
		int anio = scan.nextInt();

		a Eja = new a();
		
		if (suel < 500 && anio >= 10) {
			Eja.a(suel, anio);
		}else if (suel < 500 && anio < 10){
			Eja.b(suel, anio);
		}else if (suel >= 500){
			Eja.c(suel);
		}
	}
}
/*
 * De un operario se conoce su sueldo y los a�os de antig�edad. Se pide
 * confeccionar un programa que lea los datos de entrada e informe:
 */

