import java.util.Arrays;

public class Chunk {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5};
        int[][] chunks1 = ArrayChunk(array, 1);
        print(chunks1);
        int[][] chunks2 = ArrayChunk(array, 2);
        print(chunks2);
        int[][] chunks3 = ArrayChunk(array, 3);
        print(chunks3);
    }
    public static int[][] ArrayChunk(int[] array, int chunkSize) {

        int numOfChunks = (int) Math.ceil((double) array.length / chunkSize);
        int[][] output = new int[numOfChunks][];
        System.out.println(numOfChunks);

        for (int i = 0; i < numOfChunks; i++) {
            int start = i * chunkSize;
            int length = Math.min(array.length - start, chunkSize);
            int[] temp = new int[length];
            System.arraycopy(array, start, temp, 0, length);
            output[i] = temp;
        }
        return output;
    }
    private static void print(int[][] output) {
        System.out.println("======================");
        for (int[] x : output)
            System.out.println(Arrays.toString(x));
    }
}
