package hw;

import java.util.Scanner;

/*
 * Topic: 讓使用者輸入1, 2, 3, 與4選項，
1.輸入 n 並顯示圖形 (ex: n = 5)
2.輸入 n 並顯示圖形
3.輸入 n (必須是奇數)並顯示圖形
4.結束程式


 * Date: 2016/10/17
 * Author: 105021010邱信喆
 */
public class hw04_105021010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("輸入1,2,3,4(4為關閉):");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		if(a == 1){
			System.out.print("輸入一個值:");
			int b = scn.nextInt();
		    for(int i=b;i>=1;i--){
			for(int j=i;j>=1;j--){
			System.out.print("@");		
			}
            System.out.println("");
		    }
			for(int h=2;h<=b;h++){
			for(int l=1;l<=h;l++){
		    System.out.print("@");	
			}
			System.out.println("");
			}
		    }else if(a == 2){
			System.out.print("輸入一個值:");
			int c = scn.nextInt();
			for(int h=1;h<=c;h++){
			for(int l=1;l<=h;l++){
			System.out.print("@");	
			}
			System.out.println("");
			}
			for(int i=c-1;i>=1;i--){
			for(int j=i;j>=1;j--){
			System.out.print("@");		
			}
		    System.out.println("");
		    }
		    }else if(a == 3){
		    System.out.print("輸入一個值(必為奇數之值):");
		    int d = scn.nextInt();
		    for (int i = 1; i <= d; i++) {
		        for (int j = d; j > i; j--) {
		          System.out.print(" ");
		        }
		        for (int l = d; l < i * 2; l++) {
		          System.out.print("*");
		        }
		        System.out.println();
		      }
		      for (int i = d-1; i > 0; i--) {
		        for (int j = d; j > i; j--) {
		          System.out.print(" ");
		        }
		        for (int l = d; l < i * 2; l++) {
		          System.out.print("*");
		        }
		        System.out.println();
		      }
		    }else if(a == 4){
		    	System.out.print("謝謝使用");
		    }
		  }
}



		
			
			
			
		    
		    
		   


	
		    
		    




	

	







	



	


