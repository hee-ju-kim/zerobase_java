import java.util.Scanner;

public class Practice2 {
    public static void solution() {
        Scanner sc = new Scanner(System.in);
        System.out.print("알파벳입력 : ");
        char input = sc.nextLine().charAt(0);
        int output = 0;

        int step = (int)'a' - (int)'A';
        if (input >= 'a' && input <= 'z') {
            output = (int)input - step;
            System.out.print("대문자 변환 = " + (char)output);
        } else if (input >= 'A' && input <= 'Z') {
            output = (int)input + step;
            System.out.print("소문자 변환 = " + (char)output);
        } else {
            System.out.println("알파벳이 아님");
        }
    }

    public static void reference() {
        int a = (int)'a';
        System.out.println("a = " + a);
        int z = (int)'z';
        System.out.println("z = " + z);
        int A = (int)'A';
        System.out.println("A = " + A);
        int Z = (int)'Z';
        System.out.println("Z = " + Z);
        int etc = (int)'%';
        System.out.println("etc = " + etc);
    }

    public static void main(String[] args) {
        reference();    // 아스키 코드 참고
        solution();
    }
}