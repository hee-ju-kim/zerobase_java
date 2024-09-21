
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 문자열
		System.out.println("== 문자열 ==");
		String s1 = "Hellog World!";
		String s2 = "01234";
		System.out.println("s1 " + s1);
		System.out.println("s2 " + s2);
		
		// 1-1 equals
		String s3 = "Hi";
		String s4 = "Hi";
		System.out.println(s3.equals(s4));
		System.out.println(s3 == s4);
		
		String s5 = new String("Hi");
		System.out.println(s3.equals(s5));  // equals 값을 비교
		System.out.println(s3 == s5);		// 객체를 비교
		
		// 1-2 indexOf >> 문자열에서 특정 문자의 위치를 찾아줌
		String s6 = "Hello! World!";
		System.out.println("s6 " + s6);
		System.out.println(s6.indexOf("!"));
		System.out.println(s6.indexOf("!", s6.indexOf("!") + 1));
		
		// 1-3 replace >> 문자를 바꿔줌
		String s7 = s6.replace("Hello", "Bye");
		System.out.println("s7 " + s7);
		
		// 1-4 substring >> 문자 자르기
		System.out.println(s7.substring(0, 3));
		System.out.println(s7.substring(0, s7.indexOf("!") + 1));
		
		// 1-5 toUpperCase >> 전부 대문자로
		System.out.println(s7.toUpperCase());
		
		// 1-6 toLowerCase >> 전부 소문자로
		System.out.println(s7.toLowerCase());
		
		// 2. 자료형 - StringBuffer 
		System.out.println("== StringBuffer ==");
		
		// 데이터 변화가 있어도 원래 객체가 변경됨
		StringBuffer sb1 = new StringBuffer();
		sb1.append("01234");
		System.out.println("sb1 " + sb1);
		sb1.append("56789");
		System.out.println("sb1 " + sb1);
		
		// 데이터에 변화가 있을때마다 객체가 여러번 생성됨 >> 시스템적으로 속도 딜레이가 생김
		String a  = "01234";
		String b = "56789";
		String bak = a;
		
		System.out.println(a == bak);
		
		a += b;
		System.out.println("a" + a);
		System.out.println(a == bak);
		
		// 데이터 변화가 빈번하게 일어나는경우 위의 이유로 StringBuffer를 사용하는것이 좋음 
		
		// 3. 자료형 - 배열
		System.out.println("== 배열 ==");
		int[] myArray1 = {1, 2, 3, 4, 5};
		System.out.println(myArray1[0]);
		System.out.println(myArray1[1]);
		System.out.println(myArray1[2]);
		System.out.println(myArray1[3]);
		System.out.println(myArray1[4]);
		
		char[] myArray2 = {'a', 'b', 'c', 'd', 'e'};
		System.out.println(myArray2[2]);
		
		String[] myArray3 = new String[3];
		myArray3[0] = "Hello";
		myArray3[1] = " ";
		myArray3[2] = "World!";
		
		System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);
		
	}
	
}
