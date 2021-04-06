package sec06.ch05;

import java.util.Scanner;

public class MethodMission10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		/*
		Drink[] drinkArr = new Drink[6];
		for(int i = 0; i<drinkArr.length; i++) {
			
			drinkArr[0] = new Drink();
		}
		drinkArr[0].nm = "콜라";
		drinkArr[0].price = 1000;
		*/
		
		String[] menuNmArr = { "콜라", "사이다", "환타", "스프라이트", "망고주스", "포도주스"};
		int[] menuPriceArr = { 1000, 1200, 1300, 1500, 2000, 3000};
		
		
		Drink[] drinkArr = new Drink[6];
		
		for(int i = 0; i<drinkArr.length; i++) {
			Drink drink = new Drink();
			drink.nm = menuNmArr[i];
			drink.price = menuPriceArr[i];
			
			drinkArr[i] = drink;
		}
		
		printMenu3(drinkArr);
		
		/*
		for(int i = 0; i<drinkArr.length; i++) {
			System.out.println(drinkArr[i].nm);
		}
		*/
		/*
		for(int i = 0; i<drinkArr.length; i++) {
			Drink drink = drinkArr[i];
			System.out.printf("%d. %s(%,d원)\n", i+1, drink.nm, drink.price);
		}
		*/
		/*
		printMenu(menuNmArr, menuPriceArr);
		boolean run = true;
		while(run) {
			System.out.print("선택 > ");
			int selectedNum = scan.nextInt();
			
		}
		System.out.println("끝");
		*/
	
	}
	
	public static void printMenu3(Drink[] a) {
		System.out.println("<메뉴>");
		
		for(int i = 0; i < a.length; i++) {
			Drink drink = a[i];
			System.out.printf("%d. %s(%,d원)\n", i+1, drink.nm, drink.price);
			
			
		}
	}
	
	
	
	
	
	//0번을 입력하면 리턴
	public static boolean chooseMenu(Scanner scan, int length) {
		System.out.println("선택 > ");
		int selectedNum = scan.nextInt();
		return true;
	}
	
	//문자열로 만든 다음 한번에 콘솔에 찍는 방식
	public static void printMenu2(String[] nmArr, int[] priceArr) {
		String str = "<메뉴>\n";
		for(int i = 0; i < nmArr.length; i++) {
			str += String.format("%d. %s (%,d원)\n", i+1, nmArr[i], priceArr[i]);
		}
		System.out.println(str);
	}
	
	// 하나하나 찍는 방식
	public static void printMenu(String[] nmArr, int[] priceArr) {
		System.out.println("<메뉴>");
		for(int i = 0; i < nmArr.length; i++) {
			System.out.printf("%d. %s(%,d원)\n", i+1, nmArr[i], priceArr[i] );
			
		}
	}
	

}
