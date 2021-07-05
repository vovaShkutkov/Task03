package com.training.unit03_.main;

import java.util.Random;
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {


		Random rnd= new Random();
		int array [][];
		Scanner sc = new Scanner(System.in);
		int n;
		int m;
		int count=0;

		
		System.out.println("Введите кол-во строк массива N");
		System.out.println("N=");
		
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введено некорретное значение");
			
		}
		
		n = sc.nextInt();
		
		
		System.out.println("Введите кол-во столбцов массива M");
		System.out.println("M=");
		
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введено некорретное значение");
			
		}
		
		m = sc.nextInt();
		
		array = new int [n][m];
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				array[i][j]= rnd.nextInt(10);
			}
		}
		
		System.out.println("Исходный массив:");
		
		for (int i=0, j=0; i<array.length; i++) {
			
			for (j=0; j<array[i].length; j++) {
					
				System.out.printf("[%4d]",array[i][j],"\n");
			}
			
				System.out.println("");
		}
		
		for (int i=0; i<array.length; i++) {
			for (int j=0; j<array[i].length; j++) {
				if (array[i][j]==7) {
					count++;
				}
			}
		}
	
	System.out.println ("Кол-во цифр 7 в массиве ="+count+" ");
	}

}
