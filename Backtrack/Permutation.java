package Backtrack;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> getPermutations(int[] arr) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(arr, 0, result);
        return result;
    }
    private static void backtrack(int[] arr, int start, List<List<Integer>> result) {
        if (start == arr.length) {
            List<Integer> permutation = new ArrayList<>();
            for (int num : arr) {
                permutation.add(num);
            }
            result.add(permutation);
        } else {
            for (int i = start; i < arr.length; i++) {
                swap(arr, start, i);
                backtrack(arr, start + 1, result);
                swap(arr, start, i); // Backtrack
            }
        }
    }

    // Utility function to swap elements in an array
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    // Main method to test
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        List<List<Integer>> permutations = getPermutations(arr);

        System.out.println("Stored permutations:");
        for (List<Integer> perm : permutations) {
            System.out.println(perm);
        }
    }
}
