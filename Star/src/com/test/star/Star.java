package com.test.star;

import java.util.Scanner;

public class Star {
	public static void main(String args[]){
		
		System.out.println("���������������");
		System.out.println("숫자를 입력하세요");
		System.out.println("���������������");

		int input_num=0;
		int i,j,k=0;


		
		while(true){
			Scanner m = new Scanner(System.in);
			input_num=m.nextInt();
			System.out.println("입력한 숫자 : " +input_num );
		if(input_num==1)
		{
		    //1�� �Է����� ��

			for(i=0;i<5;i++){
				for(j=0;j<=i;j++){
				System.out.print("*");
				}
				for(k=4;k>i;k--){
				System.out.print(" ");
				}
			System.out.println();
			}System.out.println("다시 입력하시겠습니까?");
		}
		else if(input_num==2){
			//2�� �Է������� 
			for(i=0;i<5;i++){
				for(j=3;j>=i;j--){
				System.out.print(" ");
				}
				for(k=0;k<=i;k++){
					System.out.print("*");
				}
			System.out.println();
			}System.out.println("다시 입력하시겠습니까?");
		}
		else if(input_num==3){
			//3�� �Է����� ��
			for(i=0;i<5;i++){
				for(j=0;j<i;j++){
				System.out.print(" ");
				}
				for(k=5;k>i;k--){
					System.out.print("*");
				}
			System.out.println();
			}System.out.println("다시 입력하시겠습니까?");
		}
		else if(input_num==4){
			//4�� �Է����� ��
			for(i=0;i<5;i++){
				for(j=3;j>=i;j--){
				System.out.print("*");
				}
				for(k=0;k<=i;k++){
					System.out.print(" ");
				}
			System.out.println();
			}System.out.println("다시 입력하시겠습니까?");
		  }
		else{
			System.out.println("1,2,3,4만 입력하세요");
		}
		}

	}

	/*
public static void main2(String args[]){
	int start1, start2,inc1, inc2;
	char char1, char2;
	Scanner scanner = new Scanner(System.in);
	do{
	   System.out.println("���ڸ� �Է��ϼ���");
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
