package Ejercicio20;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio20 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int a = 1;
		int b = 1;
		int el1 = 0;
		int el2 = 0;
		
        while (a!=16){
        	System.out.println("introduzca numero "+a+" en lista 1: ");
    		int l1 = scan.nextInt();
    		el1+=l1;
            a++;  
        }
        while (b!=16){
        	System.out.println("introduzca numero "+b+" en lista 2: ");
    		int l2 = scan.nextInt();
    		el2+=l2;
            b++;
        }
        System.out.println("lista 1: "+el1+ ", lista 2: "+el2);
        if (el1>el2){
        	System.out.println("la lista uno es mayor");
        }else if(el2>el1){
        	System.out.println("la lista dos es mayor");
        }
	}
}
/*
 * Realizar un programa que permita cargar dos listas de 15 valores cada una.
 * Informar con un mensaje cual de las dos listas tiene un valor acumulado mayor
 * (mensajes "Lista 1 mayor", "Lista 2 mayor", "Listas iguales") Tener en cuenta
 * que puede haber dos o más estructuras repetitivas en un algoritmo.
 */