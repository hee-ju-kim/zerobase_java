import java.util.Random;
import java.util.Scanner;

public class Java4 {
    public static void main(String[] args) {
        try {
            System.out.println("[주민등록번호 계산]");
            Scanner sc = new Scanner(System.in);
            System.out.print("출생년를 입력해주세요.(yyyy):");
            int year = sc.nextInt();
            System.out.print("출생월을 입력해주세요.(mm):");
            int month = sc.nextInt();
            System.out.print("출생일을 입력해주세요.(dd)");
            int date = sc.nextInt();
            System.out.print("성별을 입력해주세요.(m/f)");
            char sex = sc.next().charAt(0);

            Random rd = new Random();
            String rest = sex == 'm' ? "3" : "4";
            for (int i = 0; i < 6; i++) {
                rest += rd.nextInt(10) + 1;
            }

            System.out.printf("%04d%02d%02d-%s", year, month, date, rest);
        } catch (Exception e) {
            System.out.println("e = " + e);
        }
    }
}
