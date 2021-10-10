import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ShuffledAnagrams {
    public static void main(String[] args) {
        String one = "start";
        boolean flag2 = true;
        boolean flag1 = true;
        boolean flag3 = true;
        int loop = 0;
        while (flag1){
            String shuffled = ShuffleString(one);
            System.out.println(shuffled);
            char[] c1 = one.toCharArray();
            char[] c2 = shuffled.toCharArray();
            if (shuffled.equals("tarts")) System.out.println("========================");
            for (int i = 0; i < one.length()-1; i++) {
                if (c1[i] == c2[i]) {
                    flag2 = false;
                    break;
                }
            }
            System.out.println("--------------------------------     "+shuffled);
            if (flag2){
                flag1= false;
                flag3 = false;

            }
            loop++;
            if (loop==100){
                flag1=false;
            }
        }
        if (flag3){
            System.out.println("IMPOSSIBLE");
        }

    }
    public static String ShuffleString(String s){
        List<Character> charList = new ArrayList<>();
        for (char c: s.toCharArray()){
            charList.add(c);
        }
        Collections.shuffle(charList);

        StringBuilder anagram = new StringBuilder();
        for (char c: charList){
            anagram.append(c);
        }
        return anagram.toString();
    }
    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        HashMap<Character, Integer> mapA = makeMap(a);
        HashMap<Character, Integer> mapB = makeMap(b);
        return mapA.equals(mapB);
    }
    public static HashMap<Character, Integer> makeMap(String a) {
        char[] arrA = a.toLowerCase().toCharArray();
        HashMap<Character, Integer> mapA = new HashMap();

        for (char i : arrA) {
            if (mapA.containsKey(i)) {
                int p = mapA.get(i);
                p += 1;
                mapA.remove(i);
                mapA.put(i, p);
            } else {
                mapA.put(i, 1);
            }
        }
        return mapA;
    }
}
