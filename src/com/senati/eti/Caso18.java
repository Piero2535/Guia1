package com.senati.eti;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.print("Ingrese la base del triangulo : ");
        int base = sc.nextInt();

        System.out.print("Ingrese la altura del triangulo : ");
        int altura = sc.nextInt();

        int area = (base*altura)/2;

        System.out.println("\n---------------------");
        System.out.println("Resultados " );
        System.out.println("---------------------");
        System.out.println("Área del Triangulo: "+ df.format(area));
	}

}
