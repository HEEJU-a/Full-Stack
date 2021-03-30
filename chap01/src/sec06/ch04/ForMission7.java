package sec06.ch04;

public class ForMission7 {
	public static void main(String[] args) {
		int star = (int)(Math.random() * 5) + 3; // 3~7 랜덤값
		
		
		
		//star = 3
		//* i=0
		//** i=1
		//*** i=2
		
		//star = 5
		//*
		//**
		//***
		//****
		//*****
		
	
		System.out.println("star : " + star);
		
		for(int i = 1; i <= star; i++) {
			for(int n = 0; n < i ; n++) {
				System.out.printf("*");
			}System.out.println();
		}
	}
}
