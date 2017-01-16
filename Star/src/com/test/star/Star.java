package com.test.star;

import java.util.Scanner;

public class Star {
	public static void main(String args[]){
		
		System.out.println("──────────────────────");
		System.out.println("숫자를 입력해보세요^.^");
		System.out.println("──────────────────────");

		int n=0;

		int i,j,k=0;


		
		while(true){
			Scanner scanner = new Scanner(System.in);
			String inputString;
			n=scanner.nextInt();
			System.out.println("입력된 숫자 : " +n );
		if(n==1)
		{
		    //1을 입력했을 때

			for(i=0;i<5;i++){
				for(j=0;j<=i;j++){
				System.out.print("*");
				}
				for(k=4;k>i;k--){
				System.out.print(" ");
				}
			System.out.println();
			}System.out.println("다시 해보겠습니까?");
		}
		if(n==2){
			//2를 입력했을때 
			for(i=0;i<5;i++){
				for(j=3;j>=i;j--){
				System.out.print(" ");
				}
				for(k=0;k<=i;k++){
					System.out.print("*");
				}
			System.out.println();
			}System.out.println("다시 해보겠습니까?");
		}
		if(n==3){
			//3을 입력했을 때
			for(i=0;i<5;i++){
				for(j=0;j<i;j++){
				System.out.print(" ");
				}
				for(k=5;k>i;k--){
					System.out.print("*");
				}
			System.out.println();
			}System.out.println("다시 해보겠습니까?");
		}
		if(n==4){
			//4를 입력했을 때
			for(i=0;i<5;i++){
				for(j=3;j>=i;j--){
				System.out.print("*");
				}
				for(k=0;k<=i;k++){
					System.out.print(" ");
				}
			System.out.println();
			}System.out.println("다시 해보겠습니까?");
		  }
		else{
			System.out.println("1,2,3,4 중 하나만 입력하세요");
		}
		}

	}

	/*
public static void main2(String args[]){
	int start1, start2,inc1, inc2;
	char char1, char2;
	Scanner scanner = new Scanner(System.in);
	do{
	   System.out.println("숫자를 입력하세요");
	   String select=scanner.nextLine();
	   if(select.equals("1")){
		   start1=1; start2=4; inc1=1; inc2=-1;
		   char1='*'; char2=' ';
	   }
	   else if(select.equals("2")){
		   start1=4; start2=1; inc1=-1; inc2=1;
		   char1=' '; char2='*';
	   }
	   else if(select.equals("3")){
		   start1=4; start2=1; inc1=1; inc2=-1;
		   char1=' '; char2='*';
	   }
	   else{
		   start1=4; start2=1; inc1=-1; inc2=1;
		   char1='*'; char2=' ';
	   }
	   for(int i=0;i<5;i++){
		   for(int j=start1; j<=5 || j>=0; j+=inc1)
			   System.out.print(char1);
		   for(int j=start2; j<=5 || j>=0; j+=inc2)
			   System.out.print(char2);
	   }
	   
	}
}*/
	
}
