package sec06.ch05;

import java.util.Scanner;

public class MethodMission7 {
	//남자 평균키 : 175, 여자 평균키 : 163
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer = null;
		
		do {
		
		System.out.print("성별: ");
		String gender = scan.next(); // 성별은 무조건 남, 여 로만 받을수있게!
		
		System.out.print("키 : ");
		int height = scan.nextInt();
		
		String result = chk(gender, height);
		System.out.println(result);
		//성별 : 남, 키: 170cm, 평균미만
		//성별 : 여, 키 : 163cm, 평균
		
		System.out.print("계속 하시겠습니까?(y, n)");
		answer = scan.next();
		
		}while(answer.equals("y"));
		System.out.println("끝");
	}
	
	public static String chk(String n1, int n2) {
		/*
		final int MAN_STAND = 175;
		final int WOMAN_STAND = 163;
		
		int stand = MAN_STAND;
		
		if(n1.equals("여")) {
			stand = WOMAN_STAND;
		}
		
		if(n2 < stand) {
			return "성별 : " + n1 + ", 키 : " + n2 + "cm" + ", 평균미만";
		}else if(n2 > stand) {
			return "성별 : " + n1 + ", 키 : " + n2 + "cm" + ", 평균초과";
		}else {
			return "성별 : " + n1 + ", 키 : " + n2 + "cm" + ", 평균";
		}
		*/
		/*// 선생님답
		int stand = 163;
		String result = "평균";
		
		switch(n1) {
		case "남":
			stand = 175;
			break;
		}
		
		if(n2 > stand) {
			result = "평균 초과";
			
		}else if(n2 < stand) {
			result = "평균미만";
		}
		return "성별: " + n1 + ", 키: " + n2 + "cm, " + result;
		
		*///성별 잘못 입력했을경우
		int stand = 0;
		String result = "평균";
		
		switch(n1) {
		case "여": case "여자": case "woman": case "girl":
			stand = 163;
			break;
		case "남" : 
			stand = 175;
			break;
		default:
			return "성별을 잘 못 입력하셨습니다.";
		}
		
		if(n2 > stand) {
			result = "평균 초과";
			
		}else if(n2 < stand) {
			result = "평균미만";
		}
	
		
		return String.format("성별: %s, 키: %dcm, %s", n1, n2, result);  // -> 얘는 문자열을 만드는데 목표! printf는 콘솔에 찍는게 목표
		
		//return "성별: " + n1 + ", 키: " + n2 + "cm, " + result;
	}

}
