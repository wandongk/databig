package 삼항연산자;

import java.util.Scanner;

public class Ex02삼항연산자예제 {

	public static void main(String[] args) {

		// 정수를 입력받아 홀수인지 짝수인지 판별하는 프로그램을 만들어보자!
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 입력하세요 : ");
		
		int num1 = sc.nextInt();
		
		String result = num1%2 == 0 ? num1 +"는(은) 짝수입니다." : num1 + "는(은) 홀수입니다.";
		
		System.out.println(result);
		
		// 1.입력도구 꺼내오기 
		// Scanner sc = new Scanner(System.in);
		// 2.정수를 입력하세요. 출력하기(개행없이)
		// System.out.print("정수를 입력하세요 : ");
		// 3.정수 입력받기
		// int num1 = sc.nextInt();
		// 4.입력받은 정수가 짝수인지 홀수인지 확인하기
		// String result = num%2 == 1 ? num1 +"는(은) 짝수입니다." : num1 + "는(은) 홀수입니다.";
		// 5.결과 출력하기
		// System.out.println(num + "은(는)" + result+ "입니다.");
		
		
	}

}
