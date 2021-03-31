package sec06.ch04;

import java.util.Scanner;

public class Exercise07 {
	public static void main(String[] args) {
		boolean run = true;

		int balance = 0;

		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
			System.out.println("------------------------");
			System.out.print("선택 > ");

			int inputVal = scan.nextInt();

			if (inputVal == 1) {
				System.out.print("예금액 > ");
				balance += scan.nextInt();
			} else if (inputVal == 2) {
				System.out.println("출금액 > ");
				int money = scan.nextInt(); // money: 출금액
				if (money > balance) {// 출금액이 잔고보다 클때
					System.out.println("잔고가 없습니다.");
				} else {// 출금액이 잔고보다 작을때
					balance -= money;
				}
			} else if (inputVal == 3) {
				System.out.println("잔고 > " + balance);

			} else if (inputVal == 4) {
				break;
			} else {

				System.out.println("다시입력해주세요");
			}

		}
		scan.close();
		System.out.println("프로그램 종료");
	}
}
