import java.util.LinkedHashMap;
import java.util.Map;

public class MaxChar {
    public static void main(String[] args) {
        getMaxChar("hello world");
    }

    public static Character getMaxChar(String S) {
        String s = S.toLowerCase();
        char[] arr = s.toCharArray();
        LinkedHashMap<Character, Integer> CharMap = new LinkedHashMap<>();
        for (char a : arr) {
            if (CharMap.containsKey(a)) {
                int val = CharMap.get(a) + 1;
                CharMap.remove(a);
                CharMap.put(a, val);
            } else {
                if (a==' '){
                    continue;
                }
                CharMap.put(a, 1);
            }
        }
        int maxval = 0;
        char maxChar = 0;
        for (Map.Entry<Character, Integer> entry : CharMap.entrySet()) {
            if (entry.getValue() > maxval) {
                maxval = entry.getValue();
                maxChar = entry.getKey();
            }
//            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println(CharMap);
        System.out.println("Max Char " + maxChar + " : " + maxval);
        return maxChar;
    }
}
