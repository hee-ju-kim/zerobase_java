//놀이공원 입장료 할인은 일반 할인과 특별 할인이 있습니다.
//조건은 아래와 같습니다.
//입장료 할인은 중복할인 되지 않으며, 중복될 경우 가장 할인을 많이 받은 금액으로 정해집니다.
//        - 3세미만이면 무료 입장
//- 복지카드와 국가유공자의 경우 일반 할인 적용
//- 13세미만이면 특별 할인 적용
//- 17시이후에 입장하면 특별 할인 적용
//기본 입장료 : 10,000원
//특별 할인의 경우 : 4,000원
//일반 할인의 경우 : 8,000원

import java.util.Scanner;

public class Java3 {
    public static void main(String[] args) {
        try {
            System.out.println("[입장권 계산]");
            Scanner sc = new Scanner(System.in);
            System.out.print("나이를 입력해주세요.(숫자):");
            int age = sc.nextInt();
            System.out.print("입장시간을 입력해주세요.(숫자):");
            int time = sc.nextInt();
            System.out.print("국가유공자여부를 입력해주세요.(y/n):");
            String merit = sc.next();
            System.out.print("복지카드 여부를 입력해주세요.(y/n):");
            String card = sc.next();

            int amount = 10000;
            if (age < 3) {
                amount = 0;
            } else if (age < 13 || time >= 17) {
                amount = 4000;
            } else if (card.equals("y") || merit.equals("y")) {
                amount = 8000;
            }

            System.out.printf("입장료: %d", amount);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }
}
