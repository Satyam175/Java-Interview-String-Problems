public class Factorial {
    public static void main(String[] args) {
        System.out.println(calcfact(5));
    }

    static int calcfact(int n) {
        if (n == 2) {
            return 2;
        }
        return n * calcfact(n - 1);
    }
}
