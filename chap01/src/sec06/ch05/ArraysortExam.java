package sec06.ch05;

import java.util.Arrays;

public class ArraysortExam {
	public static void main(String[] args) {
		int[] arr = {88, 65, 23, 1, 900, 42, 95};
		
		//if(arr[0] > arr[1]) 
		
		int temp = arr[1]; //-> 65라는 값이 temp에 잠깐옮겨져있음
		arr[1] = arr[0];
		arr[0] = temp;
		
		// -> 순서중요!!!!
		
		
		
		System.out.println(Arrays.toString(arr));
	}
}
