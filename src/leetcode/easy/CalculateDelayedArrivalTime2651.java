package leetcode.easy;

public class CalculateDelayedArrivalTime2651 {
    public static int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return (arrivalTime + delayedTime) % 24;
    }

    public static void main(String[] args) {

    }
}
