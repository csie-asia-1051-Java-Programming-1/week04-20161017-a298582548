﻿package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021010邱信喆
 */
import java.util.Scanner;
public class ex01_105021010 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入一個值");
		Scanner scn = new Scanner(System.in);
		int b = 1;
		int c = 0;
		
		while(true){
		int a = scn.nextInt();
		b = a+b;
		c++;
		if(a==-1){
		System.out.println(b);
		System.out.println((float)b/c);
		break;
		}
		

	}
	}
}


