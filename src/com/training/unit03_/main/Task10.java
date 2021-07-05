package com.training.unit03_.main;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		
		int array [][];
		Scanner sc = new Scanner(System.in);
		int n;
		
		
		
		
		System.out.println("Введите размерность квадратной матрицы N");
				
		while(!sc.hasNextInt()) {
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
				if (i==0 || i==array.length-1 || j==0 || j==array[i].length-1) {
					array[i][j]=1;
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
