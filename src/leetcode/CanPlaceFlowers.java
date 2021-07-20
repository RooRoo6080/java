package leetcode;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] flowerbedExtended = new int[flowerbed.length + 2];
        System.arraycopy(flowerbed, 0, flowerbedExtended, 1, flowerbed.length);
        for (int i = 1; i < flowerbedExtended.length - 1; i++) {
            if (flowerbedExtended[i] == 0 && flowerbedExtended[i - 1] == 0 && flowerbedExtended[i + 1] == 0) {
                n--;
                flowerbedExtended[i] = 1;
            }
            if (n <= 0) return true;
        }
        return false;
    }

    public static void main(String[] args) {
        CanPlaceFlowers cpf = new CanPlaceFlowers();
        int[] flowerbed = {1, 0, 0, 0, 1};
        int n = 2;
        System.out.println(cpf.canPlaceFlowers(flowerbed, n));
    }
}
