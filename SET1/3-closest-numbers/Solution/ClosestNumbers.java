import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClosestNumbers {
    public static void closestNumbers(List<Integer> numbers) {
        Collections.sort(numbers);
        int min = Integer.MAX_VALUE;
        int n = numbers.size();
        for (int i = 1; i < n; i++) {
            min = Math.min(Math.abs(numbers.get(i - 1) - numbers.get(i)), min);
        }

        for (int i = 1; i < n; i++) {
            int a = numbers.get(i - 1);
            int b = numbers.get(i);
            if(Math.abs(a - b) == min)
                System.out.println(a + " " + b);
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {6, 2, 4, 10}; // 2 4, 4 6
        int[] arr2 = {4, 2, 1, 3}; // 1 2, 2 3, 3 4
        int[] arr3 = {4, -2, -1, 3}; // -2 -1, 3 4

        ArrayList<Integer> input = new ArrayList<>();
        for(int num : arr3) input.add(num);
        closestNumbers(input);
    }
}
