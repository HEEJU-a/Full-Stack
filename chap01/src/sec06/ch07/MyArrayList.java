package sec06.ch07;

public class MyArrayList implements MyList {
	private int[] arr; 
	
	public MyArrayList() {
		arr = new int[0];
		
	}
	
	@Override
	public void add(int a) {
		int[] temp = new int[arr.length + 1];
		
		for(int i = 0; i < arr.length; i++) {
			temp[i] = arr[i];
		}
		temp[arr.length] = a;
		arr = temp;
		
//		for(int v : arr) {
//			System.out.println(v);
//		}
	}

	@Override
	public int size() {
		
		return arr.length;
	}

	@Override
	public int get(int a) {
		
		return 0;
	}
	
}
