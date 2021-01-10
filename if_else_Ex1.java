import java.util.Scanner;
class if_else_Ex1 {
	public static void main(String[] args)	{
		int score = 0;
		char grade=' ';
		
		System.out.println("점수를 입력하세요");
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
		System.out.println("당신의 학점은"+ grade +"입니다");
	  }
}
