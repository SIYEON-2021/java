import java.util.Scanner;
class if_else_Ex1 {
	public static void main(String[] args)	{
		int score = 0;
		char grade=' ';
		
		System.out.println("������ �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		score= scanner.nextInt();
		
		if (score >= 95) {
			grade= 'A';
		} else if (score >= 85) {
			grade ='B';
		} else if (score >=75) {
			grade= 'C';
		} else {
			grade= 'D';
		}
		System.out.println("����� ������"+ grade +"�Դϴ�");
	  }
}
