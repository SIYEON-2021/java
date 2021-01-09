
public class VarEx1 {
	public static void main(String[] args) {
		//byte type -128~127
		//변수 < 리터럴일 경우 에러
		final int score = 100;
		//score =200;
		boolean power = true;
		
		int oct = 010; // 8진수, 10진수로 8
		int hex =0x10; // 16진수, 10진수로 16
		long I = 10_000_000000L;
		
		float f = 3.14f;
		double d = 3.14;
		double h = 3.14f; // d>f 오류가 실행되지 않는다.
		
		char ch = 'A';
		String s1 = "A" + 7; 
		System.out.println(s1);
		//숫사-> 문자열로 변환하여 값을 출력 (왼,오 순서)
		
		//문자열 + any type -> 문자열
		//any type+ 문자열 -> 문자열
		
		System.out.println(score);
		System.out.println(power);
		System.out.println(oct);
		System.out.println(hex); //진수표현을 위해선 printf사용
		
		System.out.println(10.);
		System.out.println(.10);
		System.out.println(10f);
		System.out.println(1e3);
		//접미사는 출력되지 않는다
	}
}
