import java.util.HashMap;
import java.util.Map;

public class IsomorphicStrings {
    public static void main(String[] args) {
        String s1 = "ppc";
        String s2 = "xxy";
        System.out.println(normalize(s1));
        System.out.println(normalize(s2));
        if (normalize(s1).equals(normalize(s2))){
            System.out.println(true);
        }
    }
    public static String normalize(String str){
        Map<Character,Character> seen = new HashMap<>();
        char next = 'a';
        StringBuilder sb = new StringBuilder();
        for (char c :  str.toCharArray()){
            if (!seen.containsKey(c)){
                seen.put(c,next);
                next++;
            }
            sb.append(seen.get(c));
        }
        return sb.toString();
    }
}
