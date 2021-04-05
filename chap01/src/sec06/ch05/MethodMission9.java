package sec06.ch05;

import java.util.Arrays;

public class MethodMission9 {

	public static void main(String[] args) {
		int[] arr = {4, 8, 10, 11, 45};
		
		//System.out.println(Arrays.toString(arr));
		
		String result = toString(arr);
		System.out.println(result);
		
		//4, 8, 10, 11, 45,
	}
	
	public static String toString(int[] a){
		
		String n = "[";
		for(int i =0; i < a.length; i++) {
			if(i == a.length-1) {
				n = n + a[i] + "]";
			}else {
			n = n + a[i] + ",";
			}
		}
		return n;
		
	

	}
}
