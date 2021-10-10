public class RoundToNearest10 {
    public static void main(String[] args) {
        System.out.println(round("149"));
    }
    static String round(String N){
        long n = Long.parseLong(N);
        long a = (n/10)*10;
        long b = a+10;
        return (n-a)>(b-n)?Long.toString(b):Long.toString(a);
    }
}
