package sec06.ch08;


public class ExceptionExam {

	public static void main(String[] args) {
		
		try {
			//���ܰ� �߻��� ���ɼ��� ���� �ҽ��� ��ġ!!!
			System.out.println("ũũũũũ");
			int result = 10 / 2;
			System.out.println("result : " + result);
			System.out.println("����������");
			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("���� �߻�!!!!");
			System.out.println("���� �߻�!!!!");
			System.out.println("���� �߻�!!!!");
			
		}finally {
			System.out.println("������ ����!!!");
			
		}
		System.out.println("��!!");
		

	}

}
