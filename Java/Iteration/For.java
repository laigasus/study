package Java.Iteration;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class For {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Supplier<IntStream> supplier = () -> IntStream.rangeClosed(1, 10);
        int[] nums = supplier.get().toArray();
        var it = supplier.get().iterator();

        // 일반 for문
        for (int i = 0; i < nums.length; i++) {
            sb.append(nums[i]).append(' ');
        }
        sb.append('\n');

        // for-each
        for (int num : nums) {
            sb.append(num).append(' ');
        }
        sb.append('\n');

        // do-while
        int idx = 0;
        do {
            sb.append(nums[idx]).append(' ');
        } while (idx++ < nums.length - 1);
        sb.append('\n');

        // Iterator native while문
        while (it.hasNext()) {
            sb.append(it.nextInt()).append(' ');
        }
        sb.append('\n');

        // 중첩 반복문 제어
        pointLoop: for (int i = 1; i <= 11; i++) {
            for (int j = 1; j <= 11; j++) {
                for (int k = 1;; k++) {
                    if (k > 1) {
                        break;
                    }
                }
                if (i + j > 20) {
                    break pointLoop;
                }
                if (i != j) {
                    continue;
                }
                sb.append(j).append(' ');
            }
        }
        sb.append('\n');

        System.out.print(sb);
    }
}