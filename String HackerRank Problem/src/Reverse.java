public class Reverse<Static> {
    static String reverseWords(String S){
      String[] strings = S.split("\\.");
      StringBuilder rev = new StringBuilder();
        for(int i=strings.length-1;i>=0;--i){
            rev.append(strings[i]);
            if (i==0){
                break;
            }
            rev.append(".");
        }
        return rev.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("I.like.very.much"));
    }
}
