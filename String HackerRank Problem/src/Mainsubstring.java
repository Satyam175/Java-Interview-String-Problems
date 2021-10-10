import java.util.Scanner;

public class Mainsubstring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        in.nextLine();
        int start = in.nextInt();
        int end = in.nextInt();

        String out = S.substring(start, end);
        System.out.println(out);
    }
}