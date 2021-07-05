package com.training.unit03_.main;

public class Task03 {

	public static void main(String[] args) {
		
		int [] mas = new int [] {-33, 0, 12, 89, 0 , -15, 0};
		int otr=0;
		int zero=0;
		int pol=0;
		
							
		System.out.println("Кол-во элементов последовательности n =" +mas.length);
		
		for (int i=0; i< mas.length; i++ ) {
			
			if (mas[i]>0) {
				otr++;
			} else if (mas[i]==0) {
				zero++;
			} else if (mas[i]<0) {
				pol++;
			}
		}
					
		System.out.printf("К-во отриц-х элементов = "+otr+"\n");
		System.out.printf("К-во 0-вых элементов = "+zero+"\n");
		System.out.printf("К-во положит-х элементов = "+pol+"\n");
		
	}

}
