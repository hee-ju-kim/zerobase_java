
public class Practice1 {
    public static void solution(int num) {
        int reverse = 0;
        boolean isMinus = false;

        if (num < 0) {
            isMinus = true;
            num *= -1;
        }

        while (num > 0) {
            int r = num % 10;
            num /= 10;
            reverse = reverse * 10 + r;
        }

        System.out.println(isMinus ? reverse * -1 : reverse);
    }

    public static void main(String[] args) {
        // Test code
        solution(12345);
        solution(-12345);
        solution(100);
        solution(0);
    }
}
