import java.util.*;

class Result1 {
    public static List<String> processLogs(List<String> logs, int threshold) {
        HashMap<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        for (String log : logs) {
            String[] arr = log.split(" ");

            int value1 = map.getOrDefault(arr[0], 0) + 1;
            int value2 = map.getOrDefault(arr[1], 0) + 1;

            map.put(arr[0], value1);
            if (!arr[0].equals(arr[1])) {
                map.put(arr[1], value2);
            }
        }

        map.forEach((k, v) -> {
            if (v >= threshold) ans.add(k);
        });

        Collections.sort(ans, (a, b) -> {
            return Integer.valueOf(a) - Integer.valueOf(b);
        });
        return ans;
    }

    public static void main(String[] args) {
        String[] input = {"88 99 200", "88 99 300", "99 32 100", "12 12 15"};
        String[] input1 = {"9 750", "22 7 20", "33 7 50", "22 7 30"};
        ArrayList<String> al = new ArrayList<>();
        for (String str : input1) al.add(str);
        int th = 3;
        System.out.println(processLogs(al, th));
    }
}
