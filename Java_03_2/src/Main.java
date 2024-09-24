// 비트 연산자
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. 비트 논리 연산자
		System.out.println("== 비트 논리 연산자 ==");
		
		// 1.1 and &
		// 두개가 모두 같아야 1
		
		System.out.println("== & ==");
		int num1 = 5;
		int num2 = 3;
		int result = 0;
		
		result = num1 & num2;
		System.out.println("result = " + result);
		System.out.println(Integer.toBinaryString(num1));
		System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
		System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
		System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));
		
		
		// 1.2 or | 
		// 두개 중 하나라도 1 이면 결과도 1
		System.out.println("== | ==");
		
		result = num1 | num2;
		
		System.out.println("result = " + result);
		System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
		System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
		System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));
		
		// 1.3 xor ^
		// 두개 비트 값이 같으면 0, 다르면 1
		System.out.println("== XOR ==");
		
		result = num1 ^ num2;
		
		System.out.println("result = " + result);
		System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
		System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num2)));
		System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));
		
		
		// 1.4 반전연산자 ~
		// 0 -> 1, 1 -> 0
		
		System.out.println("== ~ ==");
		num1 = 5;
		
		result = ~num1;
		System.out.println("result = " + result);
		System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
		System.out.printf("%s\n", Integer.toBinaryString(result));
		
		// 2. 비트 이동 연산자
		System.out.println("== 비트 이동 연산자 ==");
		
		// 2.1 << 연산자
		// 비트를 왼쪽으로 이동
		num1 = 3;
		result = num1 << 1;
		
		System.out.println("result = " + result);
		System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
		System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));
		
		// 2.2 >> 연산자 
		// 비트를 오른쪽으로 이동 > 2로 나누는 겉과 같은 효과
		// 오른쪽자리에 기존 부호비트에 따라 기존값이 0이면 0으로 1이면 1로 채움

		result = num1 >> 1;
		System.out.println("result = " + result);
		System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(num1)));
		System.out.printf("%04d\n", Integer.parseInt(Integer.toBinaryString(result)));
		
		
		// 2.3 >>> 연산자
		// 비트를 오른쪽으로 이동할때 부호비트 상관없이 0으로 채움 
		
		num1 = -5;
		result = num1 >> 1;
		
		System.out.printf("%s\n", Integer.toBinaryString(num1));
		System.out.printf("%s\n", Integer.toBinaryString(result));
		
		result = num1 >>> 1;
		
		System.out.printf("%s\n", Integer.toBinaryString(num1));
		System.out.printf("%s\n", Integer.toBinaryString(result));
	}

}

// 2진법
// 컴퓨터에서 데이터 표현에 사용 > 2를 기반으로 하는 숫자체계

// 2의 보수
// 음수를 의미 > 빠르게 구하려면 101 -> 010 0과 1을 반대로 표시 하고 그 후 + 1
