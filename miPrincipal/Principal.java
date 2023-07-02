package miPrincipal;

import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
		
		System.out.println("Leyendo matriz A...");
		
        Matriz m1= Util_CreaMatriz.CreaMatriz("./Resources/m1.mat.txt");
		System.out.println("Leyendo matriz B...");
		Matriz m2=Util_CreaMatriz.CreaMatriz("./Resources/m2.mat.txt");
		System.out.println();
		int[][] matResultado1=new int[m1.getNumRenglones()][m1.getNumColumnas()];
		System.out.println("Sumando Matrices:");
		
		
	   	System.out.println();
	   	System.out.println("Multiplicando Matrices:");
	   	System.out.println(m1.RegresaMatriz());
		System.out.println("*");
		System.out.println(m2.RegresaMatriz());
		System.out.println("=");

		int [][] matResultado2=m1.multiplicaMatriz(m2);
		salida="";
		
	   System.out.println();
    }
}
