package 산술연산자;

import java.util.Scanner;

public class Ex03산술연산자예제 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수입력 : ");
		
		int num1 = sc.nextInt();	
		int num2 = (num1/100);
		System.out.println("결과 값 : " + (100*num2));
		
//      else)
//		int num1 = sc.nextInt();
//		System.out.println("결과 값 : " + num1/100*100);
		
		
		 
	}

}
