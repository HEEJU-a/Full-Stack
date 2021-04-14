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
		
		return arr[a];
	}
	
	
//	@Override
//	public void remove(int a) {
//		int[] temp = new int[arr.length - 1];
//		
//		for(int i = 0; i < a; i++) {
//			
//			temp[i] = arr[i];
//		}
//		
//		for(int i = a; i < temp.length; i++) {
//			temp[i] = arr[i+1];
//		}
//		arr = temp;
//	}
	
	@Override
	public int remove(int index) {
		int delVal = arr[index];
		
		int[] temp = new int[arr.length - 1];
		
		for(int i = 0; i < temp.length; i++) {
			if(i == index) {
				temp[i] = arr[i+1];
			}else {
				temp[i] = arr[i];
			}
		}
		arr = temp;
		
		return delVal;
	}
	

	@Override
	public void add(int index, int value) {
		int[] temp = new int[arr.length + 1];
		int cnt = 0;
		
		for(int i = 0; i < temp.length; i++) {
			if(i == index) {
				temp[i] = value;
			}else {
				temp[i] = arr[cnt++];
			}
		}
		arr = temp;
	}
	
}
