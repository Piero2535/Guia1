package com.senati.eti;

import java.util.Scanner;


public class Caso8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese lado: ");
		int lado = sc.nextInt();
		
		int area = (int) Math.pow(lado, 2);
		int perimetro = lado * 4;
		
		System.out.println("\n========= RESULTADO ==========");
		System.out.println("area...........: "   + area);
		System.out.println("perimetro......: "   + perimetro);
		
		
		
		
		
		
		

	}

}
