
public class Practice3 {
    public static String solution(char[] str, char[] find, char[] to) {
        int idx = 0;
        String replaceStr = "";
        char[] replaceBucket = str.clone();

        do {
            idx = findIdx(replaceBucket, find);

            if (idx != -1) {
                for (int i = 0; i < idx; i++) {
                    replaceStr += replaceBucket[i];
                }

                for (int i = 0; i < to.length; i++) {
                    replaceStr += to[i];
                }

                for (int i = find.length + idx; i < replaceBucket.length; i++) {
                    replaceStr += replaceBucket[i];
                }

                replaceBucket = replaceStr.toCharArray();
                replaceStr = "";
            }
        } while (idx != -1);

        replaceStr = new String(replaceBucket);
        return replaceStr;
    }

    public static int findIdx(char[] str, char[] find) {
        int idx = -1;
        boolean isMatch = false;

        for (int i = 0; i < str.length; i++) {
            if (str[i] == find[0] && str.length - i >= find.length) {
                isMatch = true;
                for (int j = 1; j < find.length; j++) {
                    if (str[i + j] != find[j]) {
                        isMatch = false;
                        break;
                    }
                }
            }

            if (isMatch) {
                idx = i;
                break;
            }
        }

        return idx;
    }

    public static void main(String[] args) {
        // Test code
        String str = "Hello Java, Nice to meet you! Java is fun!";
        String find = "Java";
        String to = "자바";

        // 기존 String replace
        System.out.println(str.replace(find, to));

        // 자체 구현 replace
        char[] strExArr = str.toCharArray();
        char[] findArr = find.toCharArray();
        char[] toArr = to.toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));

        strExArr = "POP".toCharArray();
        findArr = "P".toCharArray();
        toArr = "W".toCharArray();
        System.out.println(solution(strExArr, findArr, toArr));
    }
}
