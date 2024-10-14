import java.util.Scanner;

//결재 금액의 10%를 적립한다.
//캐시백포인트 단위는 백원단위이다.(100원, 200원, 300원 등)
//한건의 캐시백 포인트는 최대 300원을 넘을 수 없습니다.

public class Java2 {
    public static void main(String[] args) {
        System.out.println("[캐시백 계산]");
        System.out.print("결제 금액을 입력해주세요.(금액):");
        Scanner sc = new Scanner(System.in);
        try {
            int input = sc.nextInt();

            int tmp = (int)(input * 0.1);
            int answer = 0;
            if (tmp >= 300) {
                answer = 300;
            } else {
                int rest = tmp % 100;
                if (rest > 0) {
                    answer = tmp - rest;
                }
            }

            System.out.printf("결제금액은 %d원이고, 캐시백은 %d원 입니다.", input, answer);
        } catch (Error e) {
            System.out.println("숫자를 입력해주세요" + e);
        }
    }
}
