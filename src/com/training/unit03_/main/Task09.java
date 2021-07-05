package com.training.unit03_.main;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
		int array [][];
		Scanner sc = new Scanner(System.in);
		int n;
		int k=1;
		
		
		
		
		System.out.println("Введите размерность квадратной матрицы N(n-четное)");
				
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введено некорретное значение");
			
		}
		
		n = sc.nextInt();
		
		if (n%2!=0) {
			sc.nextLine();
			System.out.println("Введено некорретное значение");
		}
		n = sc.nextInt();
				
		array = new int [n][n];
		
		System.out.println("Исходная матрица размером ["+n+"] на ["+n+"]");
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				System.out.printf("[%3d]", array[i][j]);
			}
			
			System.out.println(" ");
		}
		
		System.out.println(" Матрица по заданному образцу размером ["+n+"] на ["+n+"]");
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				
				if (i+j==n-1) {
					array[i][j]=k;
					k++;
				}
			}
		}
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				System.out.printf("[%3d]", array[i][j]);
				
			}
			
			System.out.println(" ");
		}

	}

}
