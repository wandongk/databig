package ifelse문;

import java.util.Scanner;

public class Ex02입장료계산프로그램 {

	public static void main(String[] args) {

		// 다음은 에버랜드 입장료 계산 프로그램입니다.
		// 기본료는 5000원이며 인원수에 따라 지불해야하는 프로그램을 만들어보세요.
		// 단, 20세 미만인 경우 50% 할인이 적용됩니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
		System.out.print("나이를 입력하세요 : " );
		int age = sc.nextInt();
		System.out.print("인원수를 입력하세요 : ");
		int num = sc.nextInt();
		
		if(age>=20) {
			System.out.println("총" + num*5000 + "입니다.");
		}else {
			System.out.println("총" + num*2500 + "입니다.");
		}
		
		
		
//		
//		System.out.println("====에버랜드에 오신 걸 환영합니다!====");
//		System.out.print("나이를 입력하세요 : " );
//		int age = sc.nextInt();
//		System.out.print("인원수를 입력하세요 : ");
//		int people = sc.nextInt();
//		
//		int money = 0;
//      ****지역변수(local variable)****
//		: {} 영역 안에서 선언된 변수는 {}영역 안쪽에서만 사용이 가능하다!
//		---- > {} : scope 		
//		
//		if(age < 20) {
//			 4-1 20세 미만일 경우 입장료 50% 할인(기본 입장료 : 5000원)
//			money = (int) (5000 * people * 0.5);
//		}else {
//			 4-2. 그렇지 않은 경우 입장료 그대로 계산
//			 money = 5000 * people;
//		}
//		// 5. 결과 출력하기
//		System.out.println("입장료는" + money + "원 입니다.");
		
	}

}
