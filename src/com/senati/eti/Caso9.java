package com.senati.eti;

import java.util.Scanner;

public class Caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese lado 1 : ");
        int l1 = sc.nextInt();

        System.out.print("Ingrese lado 2 : ");
        int l2 = sc.nextInt();

        int area = l1 * l2;
        int peri = (l1 + l2) * 2 ;

        System.out.println("\n---------------------");
        System.out.println("Resultados " );
        System.out.println("---------------------");
        System.out.println("�rea del rectangulo: "+ area);
        System.out.println("Per�metro del rectangulo: "+ peri);

	}

}
