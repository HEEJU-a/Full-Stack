package sec06.ch04;

public class ForExam4 {

	public static void main(String[] args) {
		String[] strArr = {"A","B","C","D"};
		
		//거꾸로 나오게 출력하기
		for(int i = strArr.length-1; i >=0 ; i--) {
			
			System.out.println(strArr[i]);
			
		} // -> 이방법이 좋음
		System.out.println("-----------");
		
		
		
		
		for(int i = strArr.length; i > 0 ; i--) {
			
			System.out.println(strArr[i-1]);
			
		}
		System.out.println("-----------");
		
		for(String val : strArr) {
			System.out.println(val);
		}
		

	}

}
