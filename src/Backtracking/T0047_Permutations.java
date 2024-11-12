package Backtracking;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-10 14:21
 **/
public class T0047_Permutations {
    List<List<Integer>> result = new LinkedList<>();
    boolean[] used;

    public List<List<Integer>> permuteUnique(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();
        used = new boolean[nums.length];
        Arrays.sort(nums);
        backtrack(nums, track);
        return result;
    }

    void backtrack(int[] nums, LinkedList<Integer> track) {
        if (track.size() == nums.length) {
            result.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i])
                continue;
            if (i > 0 && nums[i] == nums[i - 1] && used[i - 1])
                continue;
            used[i] = true;
            track.add(nums[i]);
            backtrack(nums, track);
            track.removeLast();
            used[i] = false;
        }
    }
}
