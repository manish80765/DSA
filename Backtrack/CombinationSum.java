package Backtrack;
import java.util.*;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(0, candidates, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int startIndex, int[] candidates, int target, List<Integer> current, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(current));  // Found valid combination
            return;
        }

        if (target < 0) {
            return;  // Invalid path, backtrack
        }

        for (int i = startIndex; i < candidates.length; i++) {
            current.add(candidates[i]);  // Choose
            backtrack(i, candidates, target - candidates[i], current, result);  // Not i+1 because we can reuse same element
            current.remove(current.size() - 1);  // Undo the choice (backtrack)
        }
    }

    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();
        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = cs.combinationSum(candidates, target);
        System.out.println("Combinations that sum to " + target + ": " + result);
    }
}
