package ex;
import java.util.Scanner;
/*
 * Topic: 請寫一個函式 (不是遞迴) 進行十進制數字轉換成二進制數字，例如十進制的 13 會輸出二進制的 1101
 * Date: 2016/11/21
 * Author: 105021027 周永振老師
 */

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner scn = new Scanner(System.in);
     fun(scn.nextInt());
	}
	public static void fun(int n){
		int sum=0,a=1,sum2=0;
		while(n>=1){
		sum=n%2;
		n=n/2;
		sum2=sum2+sum*a;
		a=a*10;
	
		}
		System.out.print(sum2);
	}
	
	
	
	
}




//*System.out.println(Integer.toBinaryString(a));