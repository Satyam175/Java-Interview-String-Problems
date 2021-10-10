import java.util.Arrays;

public class SwapArray {

    public static void main(String[] args) {
        int[] a = {4,3,1,2};
        System.out.print(swapArray(a));
    }
    public static int swapArray(int[] arr){
        int swap=0;
        for(int i=0;i<arr.length;i++){
            if(i+1!=arr[i]){
                int t=i;
                while(arr[t]!=i+1){
                    t++;
                }
                int temp=arr[t];
                arr[t]=arr[i];
                arr[i]=temp;
                swap++;
            }
        }
        return swap;
    }
}
