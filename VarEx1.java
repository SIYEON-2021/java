
public class VarEx1 {
	public static void main(String[] args) {
		//byte type -128~127
		//���� < ���ͷ��� ��� ����
		final int score = 100;
		//score =200;
		boolean power = true;
		
		int oct = 010; // 8����, 10������ 8
		int hex =0x10; // 16����, 10������ 16
		long I = 10_000_000000L;
		
		float f = 3.14f;
		double d = 3.14;
		double h = 3.14f; // d>f ������ ������� �ʴ´�.
		
		char ch = 'A';
		String s1 = "A" + 7; 
		System.out.println(s1);
		//����-> ���ڿ��� ��ȯ�Ͽ� ���� ��� (��,�� ����)
		
		//���ڿ� + any type -> ���ڿ�
		//any type+ ���ڿ� -> ���ڿ�
		
		System.out.println(score);
		System.out.println(power);
		System.out.println(oct);
		System.out.println(hex); //����ǥ���� ���ؼ� printf���
		
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		//���̻�� ��µ��� �ʴ´�
	}
}
