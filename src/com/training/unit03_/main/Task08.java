package com.training.unit03_.main;

import java.util.Random;
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		// Дана матрица. Вывести k-ю строку и p-ый столбец.
		
		Random ran= new Random();
		int matr [][];
		Scanner sc = new Scanner(System.in);
		int l;
		int c;
		int line;
		int column;
		
		
		System.out.println("Введите кол-во строк матрицы ");
		
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введено некорретное значение");
			
		}
		
		l = sc.nextInt();
		
		System.out.println("Введите кол-во столбцов матрицы ");
		
			while(!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Введено некорретное значение");
			
		}
		
			c = sc.nextInt();
		
		matr = new int [l][c];
		
		for (int i=0; i<matr.length; i++) {
			for (int j=0; j<matr[i].length; j++) {
				matr[i][j] = ran.nextInt(100);
			}
		}
		
		System.out.println("Исходный массив:");
		
		for (int i=0, j=0; i<matr.length; i++) {
		
			for (j=0; j<matr[i].length; j++) {
				
				System.out.printf("[%4d]",matr[i][j],"\n");
			}
		
			System.out.println(" ");
			
		}
		
		System.out.println("Введите какую строку вы хотите вывести в диапозоне от 1 до "+l);
		
			while(!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Введено некорретное значение");
		
			}
		
		line = sc.nextInt();
		
								
				
		System.out.println("Введите какой столбец вы хотите вывести в диапозоне от 1 до "+c);
		
			while(!sc.hasNextInt()) {
				sc.nextLine();
				System.out.println("Введено некорретное значение");
			
			}
		
		column = sc.nextInt();
		
				
		System.out.println("Cтрока "+line);
		
		for (int i=0; i<matr.length; i++) {
			for (int j=0; j<matr[i].length; j++) {
				if (i==line-1) {
					System.out.printf("[%4d]",matr[line-1][j]);
				}
				
			}
			
		}
		
		System.out.println("\nCтолбец "+column);
		
			for (int i=0; i<matr.length; i++) {
				for (int j=0; j<matr[i].length; j++) {
					if (j==column-1) {
						System.out.printf("[%4d]",matr[i][column-1]);
					}
					
					
				}
				System.out.println("");
			
			}
					
	}

}
