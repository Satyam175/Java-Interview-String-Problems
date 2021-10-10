import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class KAnagrams{
    public static void main(String[] args) {

        String str1 = "fodr";
        String str2 = "gork";
        int k = 2;

        // Function Call
        kAnagrams(str1, str2, k);
        if (kAnagrams(str1, str2, k))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public static boolean kAnagrams(String str1,String str2,int k) {
        int flag = 0;
        List<Character> list = new ArrayList<>();

        // First Condition: If both the
        // strings have different length ,
        // then they cannot form anagram
        if (str1.length() != str2.length())
            System.exit(0);

        // Converting str1 to Character Array arr1
        char[] arr1 = str1.toCharArray();

        // Converting str2 to Character Array arr2
        char[] arr2 = str2.toCharArray();

        // Sort arr1 in increasing order
        Arrays.sort(arr1);

        // Sort arr2 in increasing order
        Arrays.sort(arr2);

        // Iterate till str1.length()
        for (int i = 0; i < str1.length(); i++) {
            // Condition if arr1[i] is
            // not equal to arr2[i]
            // then add it to list
            if (arr1[i] != arr2[i]) {
                list.add(arr2[i]);
            }
        }
        // Condition to check if
        // strings for K-anagram or not
        if (list.size() <= k)
            flag = 1;
        return flag == 1;
    }

}