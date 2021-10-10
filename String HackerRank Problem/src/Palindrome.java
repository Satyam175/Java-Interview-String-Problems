import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
//        System.out.println(checkPalindrome(909));
        System.out.println(checkPalindrome("PO"));
    }
    public static boolean checkPalindrome() {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        StringBuilder rev = new StringBuilder(50);
        rev.append(A);
        rev.reverse();
        String r = rev.toString();
        return A.equals(r);
    }
    static boolean checkPalindrome(String s) {
        if (s == null || s.isEmpty()) return true;
        int l = 0, r = s.length() - 1;
        while (l < r) {
            char chL = s.charAt(l), chR = s.charAt(r);
            if (!Character.isLetterOrDigit(chL)) {
                l++;
                continue;
            }
            if (!Character.isLetterOrDigit(chR)) {
                r--;
                continue;
            }
            if (chL >= 'A' && chL <= 'Z') chL = Character.toLowerCase(chL);
            if (chL >= 'A' && chR <= 'Z') chR = Character.toLowerCase(chR);
            if (chL != chR) return false;
            l++;
            r--;
        }
        return true;
    }
    static boolean checkPalindrome(int A) {
        int r, sum = 0;
        int temp = A;
        while (A > 0) {
            r = A % 10;
            sum = (sum * 10) + r;
            A = A / 10;
        }
        return temp == sum;
    }
}
//python code

//# function to check string is
//        # palindrome or not
//        def isPalindrome(str):
//
//        # Run loop from 0 to len/2
//        for i in range(0, int(len(str)/2)):
//        if str[i] != str[len(str)-i-1]:
//        return False
//        return True
//
//        # main function
//        s = "malayalam"
//        ans = isPalindrome(s)
//
//        if (ans):
//        print("Yes")
//        else:
//        print("No")

