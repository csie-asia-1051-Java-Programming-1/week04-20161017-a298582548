package hw;
/*
 * Topic: 使用者輸入 n 產生 n 個 費氏數列 (例 n = 5 )1, 1, 2, 3, 5

 * Date: 2016/10/17
 * Author: 105021010邱信喆
 */
import java.util.Scanner;
public class hw01_105021010{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = 1;
		int c = 1;
		int d = 0;
		if(a == 1){
			System.out.print("1");
		}else if(a==2){
			System.out.print("1,1");
		}else if(a>=2){
			System.out.print("1,1");
		for(int i = 3; i<=a ; i++){	
		d = b+c;
		c = b;
		b = d;
		System.out.print(","+d);
		
		

	}

		}
	}
}

