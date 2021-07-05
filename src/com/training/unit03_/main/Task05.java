package com.training.unit03_.main;

import java.util.Scanner;
import java.util.Random;

public class Task05 {

	public static void main(String[] args) {
		
		Random ran= new Random();
		int mas [];
		Scanner scan = new Scanner(System.in);
		int n;
		int temp;
		int j;
		
		System.out.println("Введите кол-во элементов массива N");
		System.out.println(">");
		
		while(!scan.hasNextInt()) {
			scan.nextLine();
			System.out.println("Вы ввели некорректное значение");
			
		}
		
		n = scan.nextInt();
		mas = new int[n];
		
		for (int i=0; i<mas.length; i++) {
			
			mas[i]= ran.nextInt(100);
			System.out.printf("Mas["+i+"]"+mas[i]+"; ");
		}
		
		System.out.println("\nРезультат сортировки методом вставки");
		
		for (int i=1; i<mas.length; i++) {
			temp = mas[i];
			j = i;
			while(j>0 && mas[j-1]>temp){
				mas[j]=mas[j-1];
				--j;
			}
			mas[j]=temp;
		}
		
		for (int i=0; i<mas.length; i++) {
			System.out.printf("mas["+i+"]"+mas[i]);
		}
		
				
	}

}
