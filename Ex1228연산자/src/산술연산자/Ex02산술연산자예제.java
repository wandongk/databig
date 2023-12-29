package 산술연산자;

import java.util.Scanner;

public class Ex02산술연산자예제 {

	public static void main(String[] args) {
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 입력받기
//		String name = sc.next();
//		
//		System.out.println("입력받은 글자는 >> " + name);
//		
//		System.out.print("숫자를 입력하세요 >> ");
//		// 3. 정수형 숫자 입력받기
//		int num1 = sc.nextInt();
		// 주석 단축키 : ctrl /
		
		// 1. 정수입력 글자 출력
		System.out.print("첫번째 정수입력 : ");
		// 2. 정수 입력
		double num3 = sc.nextDouble();
		// 3. 정수입력 글자 출력
		System.out.print("두번째 정수입력 : ");
		// 4. 정수 입력
		double num4 = sc.nextDouble();
		
		// 5. 결과 값들 출력
		System.out.println("더한 결과 값 : " + (int)(num3 + num4));
		System.out.println("뺀 결과 값 : " + (int)(num3 - num4));
		System.out.println("곱한 결과 값 : " + (int)(num3 * num4));
		// System.out.println("나눈 결과 값 : " + (double)num3/num4); > 한개만 실수로 적용
		System.out.println("나눈 결과 값 : " + (num3 / num4));
		// 한 줄 복사 단축키 : ctrl alt ↓
		
		
		
		
		
		
		
		
		
	}

}
