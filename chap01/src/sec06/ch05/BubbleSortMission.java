package sec06.ch05;

import java.util.Arrays;

public class BubbleSortMission {

	public static void main(String[] args) {
		int[] arr = { 8, 7, 3, 1, 6 };

		// 비교했을 때 오른쪽이 더 작으면 (왼쪽이 더 크면) 스와핑함
		// 7, 8, 3. 1. 6
		// 7, 3, 8, 1, 6
		// 7, 3, 1, 8, 6
		// 7, 3, 1, 6, 8
		// -> 원사이클 끝!

		// 3, 7, 1, 6, 8
		// 3, 1, 7, 6, 8
		// 3, 1, 6, 7, 8
		// -> 두번째 끝

		// 1, 3, 6, 7, 8
		
		for(int j = arr.length; j > 0; j--) {
			for(int i = 0; i < j-1; i++) {
				if(arr[i] > arr[i+1]) {
				int temp = arr[i+1];
				arr[i+1] = arr[i];
				arr[i] = temp;			
				}
			}
			System.out.println(Arrays.toString(arr));
		}
	}

}
