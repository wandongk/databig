package ifelse문;

import java.util.Scanner;

public class Ex03마트계산대프로그램 {

	public static void main(String[] args) {

		// 다음은 마트 계산대 프로그램입니다.
		// 10000원 짜리 선물세트를 구입했을 때 지불해야하는 금액을 계산해 보세요.
		// 단, 11개 이상 구매 시에는 전체 금액에서 10% 할인이 적용됩니다.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상품의 개수를 입력하세요 : ");
		int num = sc.nextInt();
		
		int money = 0;
		
		if(num >= 11) { 
			money = (int)(num * 10000 * 0.9);
		}else {
			money = num * 10000;
		}
		System.out.println("가격은 " + money + "원입니다.");
		
//		
//		System.out.print("상품의 개수를 입력하세요 : ");
//		int num = sc.nextInt();
//		
//		if(num >= 11) {
//			System.out.println("가격은 " +(int)(num*10000*0.9) + "원입니다.");
//		}else {
//			System.out.println("가격은 " + num*10000 + "원입니다.");
//			}
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
