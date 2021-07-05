package com.training.unit03_.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		
		Random ran= new Random();
		int mas [] = new int [10];
		int maxZ=0;
		int minZ=0;
		int total;
				
		System.out.printf("Исходная последовательность:\n");
		
		for (int i=0; i<mas.length; i++) {
			
			mas[i]= ran.nextInt(100);
			
			System.out.printf("Mas["+i+"]"+mas[i]+"; ");
		}
		
				
		maxZ= mas[0];
		
		int min;
		int temp;
		
		for (int i=0; i<mas.length-1; i++) {
			
			min = i;
			
			for (int j=i+1; j<mas.length; j++) {
				if (mas[j]<mas[min]) {
				min = j;
				}
			}
			
			temp = mas [i];
			mas[i]=mas[min];
			mas[min]= temp;
		}
		
		minZ= mas[0];
		maxZ = mas[mas.length-1];
				
		total = maxZ - minZ;
				
		System.out.printf("\nMax значение последовательности = "+maxZ+ "; \n");
		System.out.printf("Min значение последовательности = "+minZ+ "; \n");
		System.out.printf("Min длина числовой оси  = "+total+"; \n");
		
		
	}

}
