package com.senati.eti;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado: ");
		int lado = sc.nextInt();
		
		int perimetro = lado * 3;
		
		
		System.out.println("\n========= RESULTADO ==========");
		System.out.println("perimetro......: "   + perimetro);

	}

}
