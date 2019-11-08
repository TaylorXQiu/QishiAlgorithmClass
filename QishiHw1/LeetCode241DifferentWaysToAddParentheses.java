// LeetCode 241

public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<Integer>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '-' || c == '+' || c == '*') {
                String a = input.substring(0, i);
                String b = input.substring(i + 1);

                List<Integer> aResults = diffWaysToCompute(a);
                List<Integer> bResults = diffWaysToCompute(b);

                for (int x : aResults) {
                    for (int y : bResults) {
                        if (c == '-') {
                            result.add(x - y);
                        } else if (c == '+') {
                            result.add(x + y);
                        } else if (c == '*') {
                            result.add(x * y);
                        }
                    }
                }
            }
        }
        if (result.size() == 0) result.add(Integer.valueOf(input));
        return result;
    }
}
