import java.util.ArrayList;

public class DistinctElements {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 1, 1, 1, 2, 2, 3, 2, 4, 5, 3, 4, 5, 4, 2, 4,3};
        System.out.println("brute force");

        ArrayList<Integer> nums = new ArrayList<Integer>();

        for (int i = 0; i < num.length; i++) {
            int count = 1;
            if (nums.contains(num[i])) {
                continue;
            } else {
                for (int j = i + 1; j < num.length; j++) {
                    if (num[i] == num[j]) {
                        count++;
                        nums.add(num[i]);
                    }
                }
            }
            System.out.println(num[i] + "------" + count);
        }
    }
}
