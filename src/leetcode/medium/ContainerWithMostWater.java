package leetcode.medium;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int water = 0, left = 0, right = height.length - 1;
        while (left < right) {
            int i = Math.min(height[left], height[right]);
            water = Math.max(water, (right - left) * i);
            while (height[left] <= i && left < right) left++;
            while (height[right] <= i && left < right) right--;
        }
        return water;
    }

    public static void main(String[] args) {
        ContainerWithMostWater cwmw = new ContainerWithMostWater();
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(cwmw.maxArea(height));
    }
}
