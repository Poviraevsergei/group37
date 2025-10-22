package Tasks;

import java.util.Arrays;

public class Task2 {
    /**
     * 2. Максимальная сумма подмассива
     * Условие: Найдите непрерывный подмассив с наибольшей суммой.
     * Пример: [-2, 1, -3, 4, -1, 2, 1, -5, 4] → 6                      (подмассив [4,-1,2,1])
     */
    public static void main(String[] args) {
        int[] nums = {100, -2, 100, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSum(nums));
    }

    public static int maxSum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];

        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(currentSum, maxSum);
        }

        return maxSum;
    }

    //public static int[] maxSum(int[] nums) {
    //        int maxSum = Arrays.stream(nums).min().getAsInt();
    //        int currentSum;
    //        int currentIndex = 0;
    //        int currentIndexLast = 0;
    //        int[] tempNums;
    //
    //
    //        for (int i = 0; i < nums.length; i++) {
    //            currentSum = Arrays.stream(nums).sum();
    //            if (currentSum > maxSum) {
    //                maxSum = currentSum;
    //                currentIndex = i;
    //            }
    //        }
    //        tempNums = Arrays.copyOf(nums, currentIndex);
    //
    //        for (int i = tempNums.length - 1; i >= 0; i--) {
    //            currentSum = Arrays.stream(tempNums).sum();
    //            if (currentSum > maxSum) {
    //                maxSum = currentSum;
    //                currentIndexLast = i;
    //            }
    //        }
    //
    //        return Arrays.copyOfRange(tempNums, 0, currentIndexLast);
    //    }
}
