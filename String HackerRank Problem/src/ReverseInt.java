public class ReverseInt {
    public static void main(String[] args) {
        System.out.println(reverseInt(3564));
    }
    static int reverseInt(int A) {
        int r, sum = 0;
        while (A > 0) {
            r = A % 10;
            sum = (sum * 10) + r;
            A = A / 10;
        }
        return sum;
    }
}
