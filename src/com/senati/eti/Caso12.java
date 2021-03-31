package com.senati.eti;

public class Caso12 {

	public static void main(String[] args) {
		String frase = "ESCUELA DE TECNOLOGIA E INFORMATICA";
		String pl1 = frase.substring(0, 7); //ESCUELA
		String pl2 = frase.substring(11, 21); //TECNOLOGIA
		String pl3 = frase.substring(24, 35); //INFOMATICA
		
		System.out.println("\n========= RESULTADO ==========");
		System.out.println("palabra 1...: " + pl1);
		System.out.println("palabra 2...: " + pl2);
		System.out.println("palabra 3...: " + pl3);
		
		

	}

}
