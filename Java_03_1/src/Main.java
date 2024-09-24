// 기본 연산자

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 대입 연산, 부호 연산
		// 단항 연산자: 항이 한개
		// 이항 연산자: 항이 두개
		// 삼항 연산자: 항이 세개

		// 대입 연산자 
		// =
		// 우측의 데이터를 좌측의 변수에 대입
		int num = 100;
		num = - 10;
		num = 10;
		num = -10;
		
		// 2. 산술 연산자, 증가/감소 연산자
		// 산술연산자
		// + - * / %
		
		// 증가/감소 연산자
		// ++ --
		// 붙는 위치에 따라 계산 순서가 다름
		System.out.println("== 산술,증가/감소 연산자 ==");
		int numX = 10;
		int numY = 3;
		int result = 0;
		result = numX + numY;
		result = numX - numY;
		result = numX * numY;
		result = numX / numY;
		result = numX % numY;
		
		System.out.println("result = " + result);
		
		int num2 = 1;
		System.out.println(num2++); // ++가 뒤에있으면 원래의 값을 사용 후 값 증
		System.out.println(num2);
		
		num2 = 1;
		System.out.println(++num2); // ++가 앞에있으면 값을 먼저 증가 후 출
		System.out.println(num2);
		
		num2 = 1;
		System.out.println(num2--);
		System.out.println(num2);
		
		num2 = 1;
		System.out.println(--num2);
		System.out.println(num2);
		
		// 3. 관계연산자
		// 관계 연산자
		// >= <= == != > <
		// 두 항의 크기 비교
		// 결과값은 비교 결과에 따라 true, false
		System.out.println("== 관계연산자 ==");
		int num3 = 10;
		int num4 = 9;
		
		System.out.println(num3 > num4);
		System.out.println(num3 < num4);
		System.out.println(num3 == num4);
		System.out.println(num3 != num4);
		
		// 4. 논리 연산자
		// 논리 연산자
		// && ㅣㅣ !
		// 논리식에 대해 참 거짓 판단
		// 판단 결과에 따라 true, false
		
		System.out.println("==논리 연산자==");
		System.out.println((10 > 9) && (1 == 0));
		System.out.println((10 > 9) || (1 == 0));
		
		// 5. 복합 대입 연산자
		// 복합 대입 연산자
		// 대입 연산자와 다른 연산자를 조합한 연산
		// 코드를 간결하게 작성할 때 사용

		System.out.println("== 복합 대입 연산자 ==");
		int num6 = 10;
		int num7 = 5;
		num6 += num7; // num6 = num6 + num7
		System.out.println("num6 = " + num6);
		
		// 6. 삼항연산자
		System.out.println("== 삼항 연산자 ==");
		int a = 100;
		String aResult = (a == 100) ? "Yes" : "No";
		System.out.println("result "+ aResult);
		
	}

}



// 부호 연산자
// + -
// 부호를 나타내는 연산




