package hw;
/*
 * Topic: 程式個程式讓使用者連續輸入整數 (正數、負數及零)，直到使用者輸入 999 時停止，然後顯示正數有多少個，0 有幾個，負數總共有幾個，使用者可以重覆執行直到使用者輸入n


 * Date: 2016/10/17
 * Author: 105021010 邱信喆
 */
import java.util.Scanner;
public class hw03_105021010 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int v2 = 0;
		int v3 = 0;
		int v4 = 0;
		char checkChar;
		while(true){
		int v1 = scn.nextInt();
		if(v1<0){
			v2++;
			}else if(v1>0){
			v3++;
			}else if(v1==0){
			v4++;
			}
		
		if(v1==999){
			System.out.println("正數有幾個:"+v3);
			System.out.println("負數有幾個:"+v2);
			System.out.println("0有幾個:"+v4);
			System.out.print("還想繼續打嗎?(y/n):");
			checkChar = scn.next().charAt(0);
			if(checkChar == 'n'|| checkChar =='N'){	
			System.out.print("謝謝使用");
			break;
		}
		}

	}


	}

}
