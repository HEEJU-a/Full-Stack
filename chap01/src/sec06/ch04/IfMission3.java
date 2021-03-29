package sec06.ch04;

public class IfMission3 {
	public static void main(String[] args) {
		
		
		final int SCORE = (int)(Math.random() * 20) + 81;
		System.out.println("SCORE : " + SCORE);
	
		
		int mod = SCORE % 10;
		
		String displayScore = "", displaymod = "";
		
		if(SCORE >= 91) {
			displayScore = "A";
		}else if(SCORE >= 81) {
			displayScore = "B";
		}else {
			displayScore = "C";
		}
		
		if(mod >= 7 || mod == 0) {
		    displaymod = "+";
		}else if(mod >= 4) {
			displaymod = "";
		}
		else{displaymod = "-";
		}
		
		System.out.printf("%s%s", displayScore, displaymod);
		
	   
		
		
		/*
		if(score >= 97) {
			System.out.println("A+");
		}else if(score >= 94) {
			System.out.println("A");
		}else if(score >= 91) {
			System.out.println("A-");
		}else if(score >= 87) {
			System.out.println("B+");
		}else if(score >= 84) {
			System.out.println("B");
		}else if(score >= 81) {
			System.out.println("B-");
		}else {
			System.out.println("C");
		}
		*/
				
	}
}
