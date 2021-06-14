public class BinarySearch {

    public int search(int[] arr, int target) throws InterruptedException {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int mid = (left + right) / 2;
            System.out.println(mid);
            Thread.sleep(500);
            if (arr[mid] == target) {
                return mid;
            } else if (target < arr[mid]) {
                right = mid - 1;
            } else{
                left = mid - 1;
            }
            System.out.println(mid);
        }
        return -1;
    }

    public static void main(String[] args) throws InterruptedException {
        BinarySearch bs = new BinarySearch();
        double time = System.nanoTime();
        int[] arrayTwo = {0, 1, 2, 3, 4, 4, 5, 6, 7, 8, 9, 10};
        int target = 1456;
        System.out.println(bs.search(arrayTwo, target));
        System.out.println((System.nanoTime() - time) / 1000000);
    }

}

