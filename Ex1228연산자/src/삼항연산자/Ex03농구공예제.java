package 삼항연산자;

import java.util.Scanner;

public class Ex03농구공예제 {

	public static void main(String[] args) {
		// 농구공을 담기 위해 필요한 상자의 개수를 구하는 프로그램을 만들어보자!
		// 상자 하나에는 농구공이 최대 5개 들어갈 수 있다.
		// 만일 농구공이 '23'개라면 필요한 상자의 개수는'5'개이다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("농구공의 개수를 입력하세요 : " );
		
		int num1 = sc.nextInt();
		int num2 = num1/5;
		int result = (num1%5)>0 ? num2+1 : num2;
		
		System.out.println("필요한 상자의 수 : " + result);
		
		// 1. 입력도구 꺼내오기
		// Scanner sc = new Scanner(System.in);
		// 2. 농구공의 개수를 입력하세요. 출력하기
		// System.out.print("농구공의 개수를 입력하세요 : " );
		// 3. 농구공의 개수 데이터 입력하기
		// int ball = sc.nextInt();
		// 4. 필요한 상자의 수 구하기
		// int result = ball % 5 == 0 ? ball / 5 : ball / 5 + 1
		// 5. 결과 출력하기
		// System.out.println("필요한 상자의 수 : " + result);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
