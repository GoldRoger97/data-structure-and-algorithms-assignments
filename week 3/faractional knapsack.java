import java.util.Scanner;

public class FractionalKnapsack {
    private static double getOptimalValue(int capacity, int[] values, int[] weights) {
        double value = 0;
        int n = values.length;
        for (int i = 0; i < n; i++) {
            if (capacity <= 0)
                return value;
            int maxValue = 0;
            double maxValuePerUnit = (values[0] * 1.0) / weights[0];
            for (int j = 1; j < n; j++) {
                double ValuePerUnit = (values[j] * 1.0) / weights[j];
                if (weights[j] > 0 && ValuePerUnit > maxValuePerUnit) {
                    maxValuePerUnit = ValuePerUnit;
                    maxValue = j;
                }
            }
            int taken = Math.min(capacity, weights[maxValue]);
            value += (taken * (values[maxValue] * 1.0) / weights[maxValue]);
            weights[maxValue] -= taken;
            capacity -= taken;
        }
        return value;
    }
    public static void main(String[] args) {
        // write your code here
        Scanner sn = new Scanner(System.in);
        int n = sn.nextInt();
        int capacity = sn.nextInt();
        int[] values = new int[n];
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            values[i] = sn.nextInt();
            weights[i] = sn.nextInt();
        }
        System.out.println(getOptimalValue(capacity, values, weights));
    }
} 
