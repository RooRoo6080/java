package leetcode.medium;

public class MaxChunksToMakeSorted769 {
    public int maxChunksToSorted(int[] arr) {
        int chunks = 0, max = 0;
        for (int i = 0; i < arr.length; i++) if ((max = Math.max(max, arr[i])) == i) chunks++;
        return chunks;
    }

    public static void main(String[] args) {
        MaxChunksToMakeSorted769 mctms = new MaxChunksToMakeSorted769();
        int[] arr = {1,0,2,3,4};
        System.out.println(mctms.maxChunksToSorted(arr));
    }
}
