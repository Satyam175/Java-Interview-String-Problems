import java.util.HashMap;
import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        HashMap<Character, Integer> mapA = makeMap(a);
        HashMap<Character, Integer> mapB = makeMap(b);
        return mapA.equals(mapB);
    }
    static HashMap<Character, Integer> makeMap(String a) {
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

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println((ret) ? "Anagrams" : "Not Anagrams");
    }
}
//Two strings,  and , are called anagrams if they contain all the same characters in the same frequencies.
// For this challenge,
// the test is not case-sensitive. For example, the anagrams of CAT are CAT, ACT, tac, TCA, aTC, and CtA.


//    String a2 = a.toLowerCase();
//    String b2 = b.toLowerCase();
//    char[] arrA = a2.toCharArray();
//    char[] arrB = b2.toCharArray();
//
//    HashMap<Character,Integer> mapA = new HashMap();
//    HashMap<Character,Integer> mapB = new HashMap();

//        for (char i : arrA){
//                if (mapA.containsKey(i)){
//                int p = mapA.get(i);
//                p+=1;
//                mapA.remove(i);
//                mapA.put(i,p);
//                }
//                else {
//                mapA.put(i,1);
//                }
//                }
//
//                for (char i : arrB){
//                if (mapB.containsKey(i)){
//                int p = mapB.get(i);
//                p+=1;
//                mapB.remove(i);
//                mapB.put(i,p);
//                }
//                else {
//                mapB.put(i,1);
//                }
//                }