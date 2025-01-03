import java.util.ArrayList;

public class Practice3 {
    public static String solution(String input, String cmd) {
        StringBuffer sb = new StringBuffer(input);
        ArrayList<String> cmdArr = new ArrayList<>();

        for(String s: cmd.split(" ")) {
            cmdArr.add(s);
        }

        int cursor = sb.length();
        int cmdIdx = 0;
        while (cmdIdx != cmdArr.size()) {
            String cur = cmdArr.get(cmdIdx);

            if (cur.equals("L")) {
                cursor = Math.max(0, cursor - 1);
            } else if (cur.equals("L")) {
                cursor = Math.min(sb.length(), cursor + 1);
            } else if (cur.equals("B")) {
                if (cursor == 0) {
                    cmdIdx++;
                    continue;
                }
                sb.delete(cursor - 1, cursor);
                cursor = Math.max(0, cursor - 1);
            } else if (cur.equals("P")) {
                String s = cmdArr.get(++cmdIdx);
                sb.insert(cursor, s);
                cursor += 1;
            }

            cmdIdx++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // test code
        System.out.println(solution("aba", "L B"));
        System.out.println(solution("abcd", "P x L P y"));
        System.out.println(solution("abc", "L L L P x L B P y"));
        System.out.println(solution("a", "B B L L D D P a P b P c"));
    }
}
