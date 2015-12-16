package Ejercicio23;

import java.util.Scanner;

/**
 * 
 * @author luis.tallafigo
 *
 */
public class ejercicio23 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int total = 0;
		boolean a = true;
		while(a){
			System.out.println("introduzca numero de cuenta");
			int numCuenta = scan.nextInt();
			System.out.println("introduzca saldo");
			int saldo= scan.nextInt();
			if(saldo>0){
				System.out.println(numCuenta+ " tiene un saldo de: "+saldo+ " Acreedor");
				total+=saldo;
				a=true;
			}else if(saldo<0){
				System.out.println(numCuenta+ " tiene un saldo de: "+saldo+ " Deudor");
				a=false;
			}else if(saldo==0){
				System.out.println(numCuenta+ " tiene un saldo de: "+saldo+ " Nulo");
				a=true;
			}	
		}
		System.out.println("saldo total de los acreedores: "+total);
	}
}
/*
 * En un banco se procesan datos de las cuentas corrientes de sus clientes. De
 * cada cuenta corriente se conoce: número de cuenta y saldo actual. El ingreso
 * de datos debe finalizar al ingresar un valor negativo en el número de cuenta.
 * Se pide confeccionar un programa que lea los datos de las cuentas corrientes
 * e informe:
 */
/*
 * a) De cada cuenta: número de cuenta y estado de la cuenta según su saldo,
 * sabiendo que: Estado de la cuenta'Acreedor' si el saldo es >0. 'Deudor' si el
 * saldo es <0. 'Nulo' si el saldo es =0.
 */
/* b) La suma total de los saldos acreedores */