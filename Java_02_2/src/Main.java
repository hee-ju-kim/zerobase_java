// 변수와 자료형 2

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 자료형 - 숫자
		int intNum = 10;
		System.out.println("intNum " + intNum);
		
		System.out.println(Integer.MIN_VALUE); // int의 최솟값
		System.out.println(Integer.MAX_VALUE); // int의 최댓값
		
		int intNum2 = Integer.MAX_VALUE;
		int intNum3 = Integer.MIN_VALUE;
		
		System.out.println("intNum2 " + intNum2);
		System.out.println("intNum3 " + intNum3);
		
		long longNum = (long)Integer.MAX_VALUE + 1;
		
		System.out.println("longNum " + longNum);
		
		// 1-2 실수
		float flatNum = 1.23f;
		double doubleNume = 1.23;
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
		
		// 1-3 2, 8, 16진
		int numBase2 = 0b1100;
		int numBase8 = 014;
		int numBase16 = 0xC;
		
		// 그냥 출력하면 10진수로 변환되어 출력됨
		System.out.println("numBase2 " + numBase2);
		System.out.println("numBase8 " + numBase8);
		System.out.println("numBase16 " + numBase16);
		
		System.out.println("0b" + Integer.toBinaryString(numBase2));
		System.out.println("0" + Integer.toOctalString(numBase8));
		System.out.println("0x" + Integer.toHexString(numBase16));
		
		
		// 2. 자료형 - boolean
		System.out.println("== boolean ==");
		boolean isPass = true;
		boolean isOk = false;
		
		System.out.println("isPass " + isPass);
		System.out.println("isOk " + isOk);
		
		// 3. 자료형 - 문자 
		System.out.println("== 문자 ==");
		char keyFirst = 'a';
		char keyLast = 'z';
		
		System.out.println("keyFirst " + keyFirst);
		System.out.println("keyLast " + keyLast);
		
		System.out.println((int)keyFirst);
		System.out.println((int)keyLast);
	}

}
