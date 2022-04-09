import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ArrayGame {
    public static long countMoves(List<Integer> numbers) {
        int min = numbers.get(0);
        for (int num : numbers) min = Math.min(num, min);
        long ans = 0;
        for (int num : numbers) ans += num - min;
        return ans;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 2, 2};
        ArrayList<Integer> input = new ArrayList<>();
        for (int num : arr1) input.add(num);
        System.out.println(countMoves(input));
    }
}
