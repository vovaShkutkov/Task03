package com.training.unit03_.main;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		
		Scanner scan= new Scanner(System.in);
		int [] array = new int [] {-33, 0, 12, 89,  -15, 2, -4, 899, 567, -555};
		int n;
		
		System.out.printf("Исходный массив из "+array.length+" элементов \n");
		
		for (int i=0; i<array.length; i++) {
			System.out.printf("[ "+i+" ]= "+array[i]+"; ");
		}
		
		System.out.println(" \nВведите [1] если  хотите сортировку выбором \n"+
				"или любое другую цифру, если  хотите сортировку пузырьком ");
		
		while(!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("Вы ввели некорректное значение");
			
		}
		
		n = scan.nextInt();
		
		
		if (n==1) {
			int max;
			int temp;
			
			for (int i=0; i<array.length-1; i++) {
				
				max = i;
				
				for (int j=i+1; j<array.length; j++) {
					if (array[j]>array[max]) {
					max = j;
					}
				}
				
				temp = array [i];
				array[i]=array[max];
				array[max]= temp;
			}
			
			System.out.println("Сортировка  [выбором] произведена: ");
			
			for (int i=0; i<array.length; i++) {
				System.out.printf(" [ "+i+" ]= "+array[i]+"; ");
				}
							
		} else {
			
			boolean sorted = false;
			int temp;
			
			while (!sorted) {
				sorted=true;
						
				for (int i=0; i<array.length-1; i++) {
				
					if(array[i]<array[i+1]) {
					
						temp=array[i+1];
						array[i+1]=array[i];
						array[i]=temp;
						sorted=false;
					
					}
				
				}
			
			}
			
				System.out.println("Сортировка  {пузырьком} произведена: ");
			
					for (int i=0; i<array.length; i++) {
						System.out.printf(" { "+i+" }= "+array[i]+"; ");
					}
					
		}			
					
	}
}
