package sec06.ch04;

public class IfMission2Another {
	public static void main(String[] args) {
		String gender= "남"; //"여";
		int height= 162;
		
		final int MAN_STAND = 175;
		final int WOMAN_STAND = 163;
		int stand = MAN_STAND;
		
		if(gender.equals("여")) {
			stand = WOMAN_STAND;
		}
		
	    if(height < stand) {
	    	System.out.println("평균미만");
	    	}else if(height == stand) {
	    		System.out.println("평균");
	    	}else {
	    		System.out.println("평균초과");
	    	}
	}
}
