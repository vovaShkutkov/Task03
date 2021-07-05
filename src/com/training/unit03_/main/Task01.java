package com.training.unit03_.main;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int [] mas;
		int [] masChet;
		int n;
		int chet=0;
		
				
		System.out.println("Введите кол-во элементов последовательности N");
		System.out.println(">");
		
		while(!sc.hasNextInt()) {
			sc.nextLine();
			System.out.println("Введено некорретное значение N");
		}
			
		n= sc.nextInt();
			
		mas = new int [n];
					
		System.out.println("Кол-во элементов массива n = " +mas.length);
		
		for (int i=0; i<mas.length; i++) {
			mas[i]=i+1;
			System.out.printf("mas["+i+"] = "+mas[i]+"\n");
		}
		
		for (int i=0; i<mas.length; i++) {
			if ( mas[i]%2==0) {
				
			chet=chet+1;
			
			}
		}	
				masChet = new int [chet];
				
				System.out.printf("Кол-во четных элементов masChet = "+masChet.length+"\n");
				
		for (int i=0, j=0; i<mas.length; i++) {
			if (mas[i]%2==0) {
				masChet[j]=mas[i];
				j++;
				
			}
		}
		
		if (chet ==0) {
			System.out.println("Четных чисел нет");
		} else {
		
		for (int j=0; j<masChet.length; j++) {
			System.out.printf("masChet["+j+"] = "+masChet[j]+"\n");
			}
		}
		
	}

}
