// 조건문
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. if
		System.out.println("== if ==");
		int waterTemperature = 100;
		if (waterTemperature >= 100) {
			System.out.println("dd");
		} else {
			System.out.println("nn");
		}
		
		int score = 60;
		char grade = 0;
		
		if (score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'F';
		}
		
		System.out.println("grade = " + grade);
		
		// 2. switch
		System.out.println("== switch ==");
		
		String fruit = "apple2";
		switch (fruit) {
		case "apple":
			System.out.println(fruit + "은 5000원 입니다.");
			break;
		case "blueberry":
			System.out.println(fruit + "은 10000원 입니다.");
			break;
		default:
			System.out.println("과일이 없");
			break;
		}
		
		
		// number의 값이 홀수인지 짝수인지 판단하는 코드를 작성
		int number = 1;
		if (number % 2 == 0 ) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
		
		
		// score에 따라 grade 출력
		int score2 = 100;
		char grade2 = 0;
		switch (score2 / 10) {
		case 10:
		case 9:
			grade2 = 'A';
			break;
		case 8:
			grade2 = 'B';
			break;
		case 7:
			grade2 = 'C';
			break;
		default:
			grade2 = 'F';
			break;
		}
		
		System.out.println("grade2 = " + grade2);
	}

}
