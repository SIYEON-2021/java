
public class PrintfEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(10/3);//정수/정수 = 결과-정수 3
		System.out.println(10.0/3);//실수형의 방식으로
		System.out.printf("%d\n", 15);
		System.out.printf("%d", 15);
		
		
		float f =123.45678f;//7자리까지만 제대로
		double d =123.45678;//15자리까지 가능합니다.
		
		
		System.out.printf("[%5d]%n", 10);
		System.out.printf("[%5d]%n", 12345678);// 상관없이 출력됨
		System.out.printf("[%-5d]%n", 10); // 왼쪽 정렬
		System.out.printf("[%05d]%n", 10); // 공백대신 0으로 빈자리 채우기
		
		double a =1.23456789;
		System.out.printf("%14.10f \n ",a); //뒤의 빈자린  0으로 출력
		// 전체자리.뒤에 나올 자리인것
		
		System.out.printf("[%s]\n", "www.codechobo.com");
		System.out.printf("[%20s]\n", "www.codechobo.com"); //남은 공간 공백 20자를 준거
		System.out.printf("[%-20s]\n", "www.codechobo.com"); //왼쪽 정렬
		System.out.printf("[%.10s]\n", "www.codechobo.com"); //10자리만 짤라서 출력됨
		
		
		
		
		
	}

}
