
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1. for
		// 1-1 기본 for 
		System.out.println("== for ==");
		for (int i = 0; i < 5; i++) {
			System.out.println(i);
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0; i < 5; i++) {
			if (i == 2) {
//				continue; // 아래 실행 안하고 바로 i++ 올린 후 코드 진행
				break; // for 실행 중지
			}
			for (int j = 0; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 1-2 for each
		System.out.println("== for each ==");
		int[] nums = {1, 2, 3, 4, 5};
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		System.out.println();
		for (int i : nums) {
			System.out.println(i);
		}
		
		// 2.1 while
		System.out.println("== while ==");
		int i = 0;
		while (i < 5) {
			System.out.println(i++);
		}
		
		System.out.println();
		i = 0;
		while (i < 5) {
			if (i == 2) {
				i++;
				continue;
			}
			System.out.println(i++);
		}		
		
		System.out.println();
		i = 0;
		while (i < 5) {
			if (i == 2) {
				i++;
				break;
			}
			System.out.println(i++);
		}	
		
		
		// 2.2 do-while
		System.out.println("== do-while ==");
		boolean knock = false;
		do {
			System.out.println("knock");
		} while (knock);
		
		// 아래와 같이 별찍기(반복문 + 조건문)
		// *
		// ***
		// *****
		// *******
		
		for (int j = 0; j < 8; j++) {
			if (j % 2 != 0) {
				continue;
			} 
			for (int h = 0; h < j + 1 ; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("other");
		for (int j = 0; j < 8; j+= 2) {
			for (int h = 0; h < j + 1 ; h++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// 반복문 실행할때마다 물온도를 1ㅅ도씩 올리고 100도가 되면 반복문 종료
		// 추가로 10도마다 10, 20도 라고 물온도 출력
		int temperature = 0;
		
		while(temperature < 100) {
			temperature++;
			
			if (temperature % 10 == 0) {
				System.out.println("물 온도  =  " + temperature);
			}
			
		}
	}

}
