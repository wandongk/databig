package ifelse문;

import java.util.Scanner;

public class Ex01ifelse문 {

	public static void main(String[] args) {
		
		// 1. 입력도구 꺼내오기
		Scanner sc = new Scanner(System.in);
		// 2. 점수 입력받기 
		System.out.print("점수를 입력해 주세요 >> ");
		int score = sc.nextInt();
		// 3. 60점 이상인지 조건 판별
		if(score>=60) {
			System.out.println("합격입니다.");
		}else {
			System.out.println("불합격입니다 ㅠㅠ");
		}
		
	}

}
