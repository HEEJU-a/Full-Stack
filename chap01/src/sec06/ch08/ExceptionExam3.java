package sec06.ch08;

public class ExceptionExam3 {

	public static void main(String[] args) {
		Calc2 c = new Calc2();
		
		
		int result = 0;
		try {
			result = c.div(10, 0);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("���ܰ� �߻��ȴٸ� ó���ϰ� ���� �����");
		} finally {
			System.out.println("������ ����!!");
		}
		System.out.println("result : " + result);
		

	}

}

class Calc2{
	int div(int n1, int n2) throws Exception{  // ������ �߻��Ǹ� ���� catch�� �ö󰡼� ��� ó���ϰڳ�? �ϰ� ó���� ��
		                                       // throw�� �Ⱦ��� ������ return���� �ϵ��ڵ� �Ǿ ��Ÿ��    
		return n1 / n2;
	}
}
