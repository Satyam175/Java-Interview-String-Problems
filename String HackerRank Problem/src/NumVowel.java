import java.util.ArrayList;

public class NumVowel {
    public static void main(String[] args) {
        System.out.println(findVowel("Hi There "));
    }

    static int findVowel(String S) {
        String s = S.toLowerCase();
        ArrayList<Character> lists = new ArrayList<Character>();
        lists.add('a');
        lists.add('e');
        lists.add('i');
        lists.add('o');
        lists.add('u');
        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            if (lists.contains(s.charAt(i))) {
                num++;
            }
        }
        return num;
    }
}
