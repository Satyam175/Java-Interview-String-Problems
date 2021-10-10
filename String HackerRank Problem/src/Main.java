import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        int la = A.length();
        int lb = B.length();
        System.out.println(la + lb);
//        String C = capitalize(A);
//        String  D = capitalize(B) ;
        char[] arrA = A.toCharArray().clone();
        char[] arrB = B.toCharArray().clone();

        for (char a : arrA) {
            boolean flag = false;
            boolean flag1 = false;

            for (char b : arrB) {
                if (a > b) {
                    System.out.println("Yes");
                    flag1 = true;
                } else {
                    System.out.println("No");
                    flag = true;
                }
                if (flag1 || flag) {
                    break;
                }
            }

            if (flag1 || flag) {
                break;
            }

        }

        String outA = capitalize(A);
        String outB = capitalize(B);
        System.out.println(outA + " " + outB);


    }

    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}



