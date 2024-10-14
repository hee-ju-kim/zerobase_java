import java.util.ArrayList;
import java.util.Scanner;

public class Java8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("[과세금액 계산 프로그램]");
            System.out.print("연소득을 입력해주세요.: ");
            int input = sc.nextInt();

            int[] standard = {12000000, 46000000, 88000000, 150000000, 300000000, 500000000, 100000000};
            int[] tax = {6, 15, 24, 35, 38, 40, 42, 45};
            ArrayList<Integer> split = new ArrayList<Integer>();
            int idx = 0;
            int tmp = input;
            int diff = 0;
            int sum = 0;
            while (sum < input) {
                if (idx == 0) {
                    diff = standard[0];
                } else if (idx <= (standard.length - 1)) {
                    diff = standard[idx] - standard[idx - 1];
                }
                tmp = input - standard[idx] > 0 ? diff : input - sum;
                split.add(tmp);
                sum += tmp;
                idx++;
                if (idx == (standard.length - 1)) {
                    break;
                }
            }
            int rest = input - sum;
            if (rest > 0) {
                split.add(rest);
            }

            for (int i = 0; i < split.size(); i++) {
                int amount = split.get(i);
                double tmp2 = (double)amount * ( (double)tax[i] / 100);
                System.out.printf("%-8d * %-2d%% = %10d\n", amount, tax[i], (int)tmp2);
            }
        } catch (Exception e) {
            System.out.println("e = " + e);
        } finally {
            sc.close();
        }
    }
}
