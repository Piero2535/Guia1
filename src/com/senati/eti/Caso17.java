package com.senati.eti;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso17 {

	public static void main(String[] args) {
		    Scanner sc = new Scanner(System.in);
	        DecimalFormat df = new DecimalFormat("#.00");
	        
	        System.out.print("Ingrese numero de aprobados: ");
	        int aprob = sc.nextInt();
	        
	        System.out.print("Ingrese numero de desaprobados: ");
	        int dsprob = sc.nextInt();
	        
	        System.out.print("Ingrese numero de retirados: ");
	        int retrds = sc.nextInt();
	        
	        float tlt = (aprob+dsprob+retrds);
	        float ap = (aprob*100)/tlt;
	        float dp = (dsprob*100)/tlt;
	        float rp = (retrds*100)/tlt;
	        
	        System.out.println("\n============"); 
	        System.out.println("Resultados");
	        System.out.println("=============="); 
			System.out.println("Aprobados......: " +  df.format(ap)+"%");
			System.out.println("Desaprobados...: " +  df.format(dp)+"%");
			System.out.println("Retirados......: " +  df.format(rp)+"%");

	}

}
