package ex;
import java.util.*;
/*
 * Topic: 將前一題加強成可以做10以下的各種數字系統轉換
 * Date: 2016/11/21
 * Author: 105021027 周永振老師
 */

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner scn = new Scanner(System.in);
    System.out.print("輸入數字");
    int x =scn.nextInt();
    System.out.print("輸入起始位元");
    int y =scn.nextInt();
    y = y/10;
    int n = 0;
    while(x>0){
    	n = n +(x % 10) * y;
    	x = x /10;
    	y = y*y;
    }
    int z = scn.nextInt();
    fun(n,z);
    
    
	}
	public static void fun(int m,int z){
		int sum=0,a=1,sum2=0;
		while(m>=1){
		sum=m%z;
		m=m/z;
		sum2=sum2+sum*a;
		a=a*10;
	
		}
		System.out.print(sum2);
	}
	
	}

