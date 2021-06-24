public class BinarySearch {

    public int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        int mid = (left + right) / 2;
        while (left <= right) {
            if (arr[mid] < target) {
                left = mid + 1;
            } else if (arr[mid] == target) {
                return mid;
            } else{
                right = mid - 1;
            }
            mid = (left + right) / 2;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch bs = new BinarySearch();
        double time = System.nanoTime();
        int[] array = {0, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10};
        int target = 9;
        System.out.println(bs.search(array, target));
        System.out.println((System.nanoTime() - time) / 1000000);
    }

}

