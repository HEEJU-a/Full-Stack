package sec06.ch08;

public class ExceptionExam2 {

	public static void main(String[] args) {
		//Calc ��üȭ �ϰ� div �޼ҵ� ȣ�� 10�� 2�� ������ ȣ��
		//���ϰ� �ް� �ֿܼ� ���
		
		Calc cal = new Calc();
		int result = cal.div(10, 0);
		System.out.println(result);
		
	}
	
	

}

class Calc{
	int div(int n1, int n2) {
		
		try {
			return n1 / n2;
		}catch(Exception e) {
			System.out.println("���� �߻�");
		//	System.out.println(e);
		} finally {
			System.out.println("������ ����");
		}		
		System.out.println("try �� ����");
		return 0; 
	}
}
