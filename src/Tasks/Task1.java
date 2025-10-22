package Tasks;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.HashMap;

public class Task1 {
    /**
     * 1. Поиск двух чисел в массиве
     * Условие: Дан массив целых чисел и целевое число.
     * Найдите индексы двух чисел, которые в сумме дают целевое число.
     * Пример: nums = [2,7,11,15], target = 22 → [1,3]
     */

    public static void main(String[] args) {
        int[] nums = {2, 2, 7, 11, 15, 16, 15, 45, 4, 11, 22, 33, 44, 55, 66};
        int target = 4;

        System.out.println(Arrays.toString(findSum(nums, target)));
    }

    public static int[] findSum(int[] nums, int target) {
        HashMap<Integer, Integer> numsMap = new HashMap<>();    //11,2 15,3 45,4
        int diff;

        for (int i = 0; i < nums.length; i++) {
            diff = target - nums[i];
            if (numsMap.containsKey(diff)) {
                return new int[]{numsMap.get(diff), i};
            }
            numsMap.put(nums[i], i);
        }
        return new int[]{-1, -1};
    }


/*    public static int[] findSum(int[] nums, int target) {
        if (nums.length < 2) {
            return new int[]{-1, -1};
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{-1, -1};
    }*/
}
