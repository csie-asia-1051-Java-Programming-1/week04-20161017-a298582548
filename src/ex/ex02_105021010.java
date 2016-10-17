package ex;
/*
 * Topic: 寫一個程式讓使用者輸入兩個正整數 n 與 m，然後顯示n x m 的乘法表，顯示完後問使用者是否繼續(Y/n) ，Y 可以重新輸入 n 則結束程式。
 * Date: 2016/10/17
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class ex02_105021010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("請輸入2個(1~9)的值:");
		Scanner scn = new Scanner(System.in);
		char checkChar;
		while(true){
		int a = scn.nextInt();
		int b = scn.nextInt();
		for(int i=1;i<=a;i++){
	            for(int j=1;j<=b;j++){
	                System.out.print((i*j)+"\t");      
		        }
	            System.out.println();   
	            }
		System.out.print("是否繼續打?(y/n):");
		checkChar = scn.next().charAt(0);
		if(checkChar == 'n' || checkChar == 'N'){
		System.out.print("謝謝使用");
			break;
		}
		
		
	    }
	}
}

