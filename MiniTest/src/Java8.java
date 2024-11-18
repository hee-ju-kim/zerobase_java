import java.util.Scanner;

public class Java8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("[과세금액 계산 프로그램]");
            System.out.print("연소득을 입력해주세요: ");
            int input = sc.nextInt();
            int input2 = input;
            int[] standard = {12000000, 34000000, 42000000, 62000000, 150000000, 200000000, 500000000};
            int[] taxes = {6, 15, 24, 35, 38, 40, 42, 45};

            int tax1 = 0;
            int index = 0;
            for (int i = 0; i < standard.length && input > 0; i++) {
                int tmp = i < standard.length - 1  ? Math.min(input, standard[i]) : input;
                double tmpTax = (double)tmp * ((double)taxes[i] / 100);
                tax1 += (int)tmpTax;
                System.out.printf("%d * %2d = %10d\n", standard[i], taxes[i], (int)tmpTax);
                input -= tmp;
                index = i;
                if (input <= 0) {
                    break;
                }
            }
            System.out.println();
            System.out.printf("[세율에 의한 세금]: %d\n", tax1);

            int[] taxes2 = {0, 1080000, 5220000, 14900000, 25400000, 35400000, 65400000};
            long price2 = Math.round((double)input2 * ((double)taxes[index] / 100)) - taxes2[index];
            System.out.printf("[누진공제 계산에 의한 세금]: %d\n", price2);
        } catch (Exception e) {
            System.out.println("e = " + e);
        } finally {
            sc.close();
        }
    }
}
