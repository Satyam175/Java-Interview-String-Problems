public class Fibonacci {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.print(pFibonacci(i) + " ");
        }
        System.out.println();
        pfibonaccifor(6);
    }

    public static int pFibonacci(int n) {
        //time complexity O(2^n) exponential
        //space complexity O(n)
        if (n <= 1) {
            return n;
        }
        return pFibonacci(n - 1) + pFibonacci(n - 2);


    }

    static void pfibonaccifor(int n) {
        // time complexity O(n)
        //space compplexity O(1)
        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            int sum = a + b;
            a = b;
            b = sum;
        }
    }
}
