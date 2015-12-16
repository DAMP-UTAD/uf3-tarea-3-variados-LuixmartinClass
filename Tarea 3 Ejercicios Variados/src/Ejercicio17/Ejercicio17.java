package Ejercicio17;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio17 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("introduzca numero de empleados: ");
		int Em = scan.nextInt();
		int suelm = 0;
		int suelM = 0;
		int suelT = 0;
		int err = 0;
		while (Em > 0) {
			System.out.println("introduzca numero de sueldo entre 100 y 500: ");
			int suel = scan.nextInt();
			if (suel !=0) {
				if (suel >= 100 && suel <= 300) {
					suelm++;
					suelT += suel;
				} else if (suel > 300) {
					suelM++;
					suelT += suel;
				}else if(suel<100 || suel >500){
					err++;
				}
			}
		Em--;
		}
		System.out.println("Empledos con sueldominimo " + suelm
				+ ", empleados con sueldo superior " + suelM
				+ ", gastos totales de la empresa en salrios: " + suelT);
		if (err !=0){
			System.err.println("se han introducido "+ err+" sueldos erroneamente");	
		}
	}
}
/*
 * En una empresa trabajan n empleados cuyos sueldos oscilan entre $100 y $500,
 * realizar un programa que lea los sueldos que cobra cada empleado e informe
 * cuántos empleados cobran entre $100 y $300 y cuántos cobran más de $300.
 * Además el programa deberá informar el importe que gasta la empresa en sueldos
 * al personal.
 */