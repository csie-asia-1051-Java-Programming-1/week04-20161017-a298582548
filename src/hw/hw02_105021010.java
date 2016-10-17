package hw;
/*
 * Topic: 使用者輸入正整數 n 與 m 然後計算

 * Date: 2016/10/17
 * Author: 105021010邱信喆
 */
import java.util.Scanner;
public class hw02_105021010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v1 = scn.nextInt();
		int v3 = scn.nextInt();
		int v2 = 1;
		int v4 = 1;
		int v5 = v1-v3;
		int v6 = 1;
		
		for(int i = 0;v1 > 0;v1--){
		v2 = v1*v2;
		}
		for(int i = 0;v3 > 0;v3--){
		v4 = v3*v4;
		}
		for(int i = 0; v5>0;v5--){
		v6 = v5*v6;
		}
		double v7 = v2/(v4*v6);
		System.out.print(v7);
		
		
		
		

	}

}
