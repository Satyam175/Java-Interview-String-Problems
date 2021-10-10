// A Java program to find
// if there is a zero sum subarray

import
        java.util.HashSet;
import java.util.Set;

public class AllSubArraysSum0 {
    // Returns true if arr[]
    // has a subarray with sero sum
    static Boolean subArrayExists(int[] arr) {
        // Creates an empty hashset hs
        Set<Integer> hs = new HashSet<>();

        for (int j : arr) {
            int sum = 0;
            // Add current element to sum
            sum += j;

            if (j == 0 || sum == 0 || hs.contains(sum)) return true;

            hs.add(sum);
        }
        // We reach here only when there is
        // no subarray with 0 sum
        return false;
    }

    // Driver code
    public static void main(String[] arg) {
        int[] arr = {6,5,3,-2,-1};
        if (subArrayExists(arr))
            System.out.println("Found a subarray with 0 sum");
        else
            System.out.println("No Such Sub Array Exists!");
    }
}
