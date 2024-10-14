import java.util.*;
import java.util.stream.Stream;
import java.util.stream.Collectors;

public class Java7 {
    public static void main(String[] args) {
        System.out.println("[로또 당첨 프로그램]");
        System.out.println();
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("로또 갯수를 입력해주세요.(숫자: 1~10):");
            int input = sc.nextInt();

            ArrayList<List<Integer>> arr = new ArrayList<>();
            HashSet<Integer> set1 = new HashSet<Integer>();
            for (int i = 0; i < input; i++) {
                for (int j = 0; set1.size() < 6; j++) {
                    set1.add(new Random().nextInt(45 + 1));
                }

                System.out.printf("%c\t", (char) ('A' + i));

                List<Integer> tmp = set1.stream().sorted().collect(Collectors.toList());
                arr.add(tmp);
                String result = String.join(",", tmp.stream().map(String::valueOf).toArray(String[]::new));
                System.out.println(result);
                set1.clear();
            }

            HashSet<Integer> answer = new HashSet<>();
            for (int j = 0; answer.size() < 6; j++) {
                answer.add(new Random().nextInt(45 + 1));
            }
            List<Integer> answerList = answer.stream().sorted().collect(Collectors.toList());
            System.out.println("[로또 발표]");
            String result = String.join(",", answerList.stream().map(String::valueOf).toArray(String[]::new));
            System.out.println("\t\t" + result);
            System.out.println();

            for (int i = 0; i < input; i++) {
                int cnt = 0;
                for (int j = 0; j < arr.get(i).size(); j++) {
                    if (answerList.contains(arr.get(i).get(j))) {
                        cnt++;
                    }
                }

                String result2 = String.join(",", arr.get(i).stream().map(String::valueOf).toArray(String[]::new));
                System.out.printf("%c\t %s => %d개 일치\n", (char) ('A' + i), result2, cnt);
            }
        } catch (Exception e) {
            System.out.println("e = " + e);
        } finally {
            sc.close();
        }
    }
}

