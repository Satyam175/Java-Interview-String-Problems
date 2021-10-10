public class ReverseString {
    public static void main(String[] args) {
//        System.out.println(revString1("Satyam"));
//        System.out.println(revString2("Satyam"));
//        System.out.println(reverseString3("Kaushik"));
        System.out.println(revStringrec("satyam"));

    }

    public static String revString2(String s) {
        String reversed = "";
        char[] r = s.toCharArray();
        for (char a : r) {
            reversed = a + reversed;

        }
        return reversed;
    }

    static String reverseString3(String S) {
        String rev = "";
        for (int i = S.length() - 1; i >= 0; i--) {
            rev = rev + S.charAt(i);
        }
        return rev;
    }

    public static String revString1(String s) {
        StringBuilder r = new StringBuilder(50);
        r.append(s);
        r.reverse();
        String rev = r.toString();
        return rev;
    }

    public static String revStringrec(String s) {
        if (s == null || s.length() <= 1) {
            return s;
        }

        System.out.print(((s.charAt(s.length() - 1))));

        return revStringrec(s.substring(0, s.length() - 1));
    }
}
