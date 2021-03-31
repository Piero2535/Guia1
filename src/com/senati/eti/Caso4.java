package com.senati.eti;

import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float n1 = 0, n2 = 0;
		
		System.out.print("Primer numero.....: ");
		n1 = sc.nextFloat();
		
		System.out.print("segundo numero.....: ");
		n2 = sc.nextFloat();
		
		float suma = n1 + n2;
		float resta = n1 - n2;
		float mult = n1 * n2;
		float div = n1 / n2;
		float rent = n1 % n2;
				
		
		System.out.println("\n========= valor ingresado =========");
		System.out.println("La suma es...........: "   + suma);
		System.out.println("La resta es...........: "   + resta);
		System.out.println("La multiplicacion es...........: "   + mult);
		System.out.println("La division es...........: "   + div);
		System.out.println("El resto entero es...........: "   + rent);
		
		

	}

}
