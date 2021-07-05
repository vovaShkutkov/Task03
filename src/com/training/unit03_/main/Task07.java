package com.training.unit03_.main;

import java.util.Random;
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		
		Random rand= new Random();
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
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				array[i][j] = rand.nextInt(10);
			}
		}
		
		
		
		System.out.println("Исходный массив:");
		
			for (int i=0, j=0; i<array.length; i++) {
			
				for (j=0; j<array[i].length; j++) {
					
					System.out.printf("[%4d]",array[i][j],"\n");
				}
			
				System.out.println(" ");
				
			}
		
		System.out.println("\nДиагональные элементы массива:");
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length;j++) {
				
				if(i==j) {
					System.out.println("["+array[i][j]+"]");
				}
				
			}
			
		}

	}

}
