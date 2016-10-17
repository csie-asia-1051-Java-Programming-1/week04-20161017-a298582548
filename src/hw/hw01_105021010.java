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
		int c = 0;
		for(int i=1;i<=a;i--){
		c = b+c;
		
		System.out.print(b+"\t");
		}
		

	}

}
