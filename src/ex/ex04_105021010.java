package ex;
/*
 * Topic: 讓使用者輸入 一個正整數 n 及一個字元符號，然後顯示出下列圖形 (例 n = 4,字元符號= @)
    @@@@
    @@@  
    @@  
    @
 * Date: 2016/10/17
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class ex04_105021010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請隨意填入一個值:");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		for(int i=a;i>=1;i--){
			for(int j=i;j>=1;j--){
				System.out.print("@");
			}
			System.out.println("");
		}

	}

}
