
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10/3);//����/���� = ���-���� 3
		System.out.println(10.0/3);//�Ǽ����� �������
		System.out.printf("%d\n", 15);
		System.out.printf("%d", 15);
		
		
		float f =123.45678f;//7�ڸ������� �����
		double d =123.45678;//15�ڸ����� �����մϴ�.
		
		
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%5d]%n", 12345678);// ������� ��µ�
		System.out.printf("[%-5d]%n", 10); // ���� ����
		System.out.printf("[%05d]%n", 10); // ������ 0���� ���ڸ� ä���
		
		double a =1.23456789;
		System.out.printf("%14.10f \n ",a); //���� ���ڸ�  0���� ���
		// ��ü�ڸ�.�ڿ� ���� �ڸ��ΰ�
		
		System.out.printf("[%s]\n", "www.codechobo.com");
		System.out.printf("[%20s]\n", "www.codechobo.com"); //���� ���� ���� 20�ڸ� �ذ�
		System.out.printf("[%-20s]\n", "www.codechobo.com"); //���� ����
		System.out.printf("[%.10s]\n", "www.codechobo.com"); //10�ڸ��� ©�� ��µ�
		
		
		
		
		
	}

}
