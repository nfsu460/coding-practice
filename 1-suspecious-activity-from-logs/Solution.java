import java.util.*;
import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> logs = new ArrayList<>(
                Arrays.asList("9 7 50", "22 7 20", "33 7 50", "22 7 30"));
        int threshold = 3;
        /*
         * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         * int n = Integer.parseInt(br.readLine());
         * for (int i = 0; i < n; i++) {
         * logs.add(br.readLine());
         * }
         * threshold = Integer.parseInt(br.readLine());
         */

        List<String> result = Result.processLogs(logs, threshold);

        System.out.println(result);
    }
}

class Result {
    public static List<String> processLogs(List<String> logs, int threshold) {
        List<String> result = new ArrayList<>();
        HashMap<String, Integer> hm = new HashMap<>();

        for (String log : logs) {
            String[] logArr = log.split(" ");

            if (logArr[0].equals(logArr[1])) {
                hm.put(logArr[0], hm.getOrDefault(logArr[0], 0) + 1);
            } else {
                hm.put(logArr[0], hm.getOrDefault(logArr[0], 0) + 1);
                hm.put(logArr[1], hm.getOrDefault(logArr[1], 0) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() >= threshold) {
                result.add(entry.getKey());
            }
        }
        Collections.sort(result, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.parseInt(o1) - Integer.parseInt(o2);
            }
        });

        return result;
    }
}