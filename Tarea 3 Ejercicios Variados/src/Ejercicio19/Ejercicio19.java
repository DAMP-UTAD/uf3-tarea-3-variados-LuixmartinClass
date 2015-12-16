package Ejercicio19;
/**
 * 
 * @author luis.tallafigo
 *
 */
public class Ejercicio19 {
	public static void main(String[] args) {
		int resul = 8;
		System.out.print(resul + " - ");
        while (resul<500){
             resul+=8;
             if (resul<=500){
            	 System.out.print(resul + " - "); 
             }
             
        }
        System.out.println();
	}
}
/*Mostrar los múltiplos de 8 hasta el valor 500. Debe aparecer en pantalla 8 - 16 -
24, etc.*/