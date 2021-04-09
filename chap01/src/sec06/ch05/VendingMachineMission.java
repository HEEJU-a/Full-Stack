package sec06.ch05;

import java.util.Scanner;

public class VendingMachineMission {
	public static void main(String[] args) {
		/*
		 * 아래는 콘솔에 출력해야 하는 내용입니다. <메뉴> 0. 종료 1. 콜라(1,000원) 2. 사이다 (1,200원) 3. 환타(1,300원)
		 * 선택> 1 콜라를 선택하셨습니다.
		 * 
		 * <메뉴> 0. 종료 1. 콜라(1,000원) 2. 사이다 (1,200원) 3. 환타 (1,300원) 선택> 3 환타를 선택하셨습니다.
		 * 
		 * <메뉴> 0. 종료 1. 콜라(1,000원) 2. 사이다 (1,200원) 3. 환타 (1,300원) 선택> 4 잘못 선택하셨습니다.
		 */
		/*
		 * int coke = 1000; int sprite = 1200; int fanta = 1300;
		 * 
		 * System.out.printf("<메뉴>\n1. 콜라 (%d원)\n2. 사이다 (%d원)\n3. 환타 (%d원)\n", coke,
		 * sprite, fanta);
		 */
		Scanner scan = new Scanner(System.in);

		String[] menuNmArr = { "콜라", "사이다", "환타" };
		int[] menuPriceArr = { 1000, 1200, 1300 };

		while (true) {

			System.out.println("<메뉴>");
			for (int i = 0; i < menuNmArr.length; i++) {
				System.out.printf("%s. %s(%d원)\n", i + 1, menuNmArr[i], menuPriceArr[i]);
			}
			System.out.print("선택 > ");
			int choice = scan.nextInt();
			System.out.println();

			if (choice == 0) {
				break;
			} else if (choice >= 1 && choice <= menuNmArr.length) {
				System.out.printf("%s를 선택하셨습니다.\n", menuNmArr[choice - 1 ]);
			} else {
				System.out.println("잘 못 선택하셨습니다.");
			}
			
			
			
			
			/*
			 * else if(choice ==1) { System.out.println("콜라를 선택하셨습니다."); }else if(choice
			 * ==2) { System.out.println("사이다를 선택하셨습니다."); }else if(choice ==3) {
			 * System.out.println("환타를 선택하셨습니다."); }else {
			 * System.out.println("잘못 선택하셨습니다."); }
			 */

		}
		System.out.println("종료!!");
		scan.close();
		
	}
}
