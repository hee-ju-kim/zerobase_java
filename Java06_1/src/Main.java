// 다차원배열
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. 1차원 배열
		System.out.println("== 일차원 배열 ==");
		int[] myArr = {1, 2, 3};
		System.out.println("myArr[1] = " + myArr[1]);
		
		for (int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}
		
		for (int i: myArr) {
			System.out.println(i);
		}
	
		// 2.이차원 배열 
		System.out.println("== 이차원 배열 ==");
		int[][] myArr2 = {{1,2,3}, {4,5,6}};
		System.out.println("myArr2[1][2] = " + myArr2[1][2]);
	
		for(int i = 0; i < myArr2.length; i++) {
			for (int j = 0; j  < myArr2[i].length; j++) {
				System.out.println(myArr2[i][j]);
			}
		}
		
		for (int[] ints: myArr2) {
			for(int anInt: ints) {
				System.out.println("anInt" + anInt);
			}
		}
		
		
		// 3*3 행렬이 2차원 배열로 초기화 되어있다
		// 모든 원소를 1로 변경하고 대각원소는 10으로 변경하시오.
		int[][] testArr = {{0,0,0}, {0,0,0}, {0,0,0}};
		for (int i = 0; i < testArr.length; i++) {
			for (int j = 0; j < testArr[i].length; j++) {
				testArr[i][j] = i == j ? 10 : 1;
			}
		}
		
		for (int[] arr: testArr) {
			for(int ele: arr) {
				System.out.print(ele + " ");
			}
			System.out.println();
		}
		
	}

}
