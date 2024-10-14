import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Java6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("총 진행할 투표수를 입력해주세요.");
            int votes = sc.nextInt();
            System.out.print("가상 선거를 진행할 후보자 인원을 입력해주세요.");
            int numOfPeople =  sc.nextInt();
            String[] names = new String[numOfPeople];
            HashMap<String, Integer> map = new HashMap();
            sc.nextLine();
            for (int i = 0; i < names.length; i++) {
                System.out.printf("%d번째 후보자 이름을 입력해주세요.", i + 1);
                names[i] = sc.nextLine();
                map.put(names[i], 0);
            }

            for (int i = 1; i <= votes; i++) {
                int idx = new Random().nextInt(numOfPeople);
                System.out.printf("[투표진행률]: %.2f%%, %d명 투표 => %s\n", (double)i / votes * 100 , i, names[idx]);
                map.put(names[idx], map.get(names[idx]) + 1);
                for (int j = 0; j < names.length; j++) {
                    double aver2 = (double)map.get(names[j]) / votes * 100;
                    System.out.printf("[기호:%d]\t%s\t%.2f%%\t(투표수: %d)\n", j+1, names[j], aver2, map.get(names[j]));
                }
            }


            int maxIdx = 0;
            int maxValue = 0;
            for (int i = 0; i < names.length; i++) {
                if (maxValue < map.get(names[i])) {
                    maxIdx = i;
                    maxValue = map.get(names[i]);
                }
            }
            System.out.printf("[투표결과] 당선인 : %s", names[maxIdx]);
        } catch (Exception e) {
            System.out.println("e = " + e);
        } finally {
            sc.close();
        }
    }
}