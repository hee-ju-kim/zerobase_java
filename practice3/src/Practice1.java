import java.util.Arrays;

public class Practice1 {
    public static void solution(int[] nums) {
        int[] arr = Arrays.stream(nums).distinct().sorted().toArray();
        for (int item: arr) {
            System.out.print(item + " ");
        }
        System.out.println();

        int idx = 0;
        for (int item: nums) {
            if (idx == 0 || item > nums[idx - 1]) {
                nums[idx++] = item;
            }
        }

        System.out.print(idx + " : ");
        for (int i = 0; i < idx; i++) {
            System.out.print(nums[i] + "  ");
        }
        System.out.println();

    }

    public static void main(String[] args) {
        // Test code
        solution(new int[] {1, 1, 2});
        solution(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
    }
}
