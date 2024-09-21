// 변수와 자료형
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("== 변수 사용하기 ==");
		int age = 10;
		String country = "Korea";
		
		System.out.println("나이 : " + age);
		System.out.println("나라 : " + country);
		
		System.out.println("== 변수 이름 규칙 ==");
		// 문자, 숫자, _, $ 사용가능
		int apple = 2000;
		int apple3 = 2000;
		int _apple = 2000;
		int $apple = 2000;
		System.out.println($apple);
		
		// 숫자로 시X
//		int 3apple = 2000;
		
		// 대소문자 구분
		int apple5 = 1000;
		int Apple5 = 2000;
		
		// 공백 사용 X
		int one_apple = 1000;
		int oneApple = 1000;

		// 예약어X
//		int true = 1;
		
		// 한글도 사용가능
		int 사과 = 1000;
		
		System.out.println("== 표기법 ==");
		// 카멜케이스(변수, 함수)
		int myAge = 29;
		int oneApplePrice = 1000;
		
		// 파스칼 표기법(클래스)
		int my_age = 10;
		int one_apple_price = 1000;
		
		
		
		
	}

}
