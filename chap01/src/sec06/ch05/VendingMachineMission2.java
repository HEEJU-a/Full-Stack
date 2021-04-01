package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission2 {
	public static void main(String[] args) {
		/*
		<메뉴>
		 0. 종료 
		1. 콜라(1,000원) 
		2. 사이다 (1,200원) 
		3. 환타(1,300원)
		 선택> 1 콜라를 선택하셨습니다.
				 
		 <메뉴> 
		0. 종료 
		1. 콜라(1,000원) 
		2. 사이다 (1,200원)
		 3. 환타 (1,300원) 
		선택> 3 환타를 선택하셨습니다.
			 
		<메뉴> 0. 종료 
		1. 콜라(1,000원) 
		2. 사이다 (1,200원)
		 3. 환타 (1,300원) 
		선택> 4 잘못 선택하셨습니다.
		
		선택> 0
		종료 - 사용한 금액은 : 2,300원
		*/
		Scanner scan = new Scanner(System.in);
		
		String[] menuNmArr = {"콜라", "사이다", "환타"};
		int[] menuPriceArr = {1000, 1200, 1300};
		/*
		int money = 0;
		
		while(true) {
		System.out.println("<메뉴>");
		for(int i = 0; i < menuNmArr.length; i++) {
			System.out.printf("%s. %s(%d원)\n", i+1, menuNmArr[i], menuPriceArr[i]);
		}
		
		System.out.print("선택 > ");
		int choice = scan.nextInt();
		
		if(choice == 0) {
			//System.out.printf("종료 - 사용한 금액은 : %d원", money); ->여기놔둬도 됨
			break;
		}else if(choice >=1 && choice <= menuNmArr.length) {
			System.out.printf("%s를 선택하셨습니다.\n", menuNmArr[choice -1]);
			money = money + menuPriceArr[choice -1];
		}else {
			System.out.println("잘못 선택하셨습니다.");
		}

		}
		System.out.printf("종료 - 사용한 금액은 : %d원", money);
	  */
		
		
		System.out.println("<메뉴>");
		for(int i = 0; i < menuNmArr.length; i++) {
			System.out.printf("%s. %s(%d원)\n", i+1, menuNmArr[i], menuPriceArr[i]);
		}
		int usePrice = 0;
		while(true) {
			System.out.print("선택 >");
			int choice = scan.nextInt();
			
			if(choice ==0) {
				break;
			}else if(choice < 0 || choice > menuNmArr.length) {
				System.out.println("잘못선택하셨습니다.");
				continue;
			}
			int selectedIdx = choice -1;
			System.out.printf("%s를 선택하셨습니다.\n", menuNmArr[selectedIdx]);
			usePrice += menuPriceArr[selectedIdx];
		}
		System.out.printf("종료 - 사용한 금액 : %,d원", usePrice);
		
	}
}
