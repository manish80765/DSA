package GFG;


import java.util.*;

public class PrintSubsets {
    
    public static int[][] PrintSubsets(int[] array) {
        List<List<Integer>> result = new ArrayList<>();
        generateSubsets(array, 0, new ArrayList<>(), result);
        
        // Convert List<List<Integer>> to int[][]
        int[][] subsets = new int[result.size()][];
        for (int i = 0; i < result.size(); i++) {
            List<Integer> subset = result.get(i);
            subsets[i] = new int[subset.size()];
            for (int j = 0; j < subset.size(); j++) {
                subsets[i][j] = subset.get(j);
            }
        }
        return subsets;
    }

    private static void generateSubsets(int[] array, int index, List<Integer> current, List<List<Integer>> result) {
        if (index == array.length) {
            result.add(new ArrayList<>(current));
            return;
        }
        // Include current element
        current.add(array[index]);
        generateSubsets(array, index + 1, current, result);
        current.remove(current.size() - 1);

        // Exclude current element
        generateSubsets(array, index + 1, current, result);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[][] arr2 = PrintSubsets(arr1);
        for (int[] x : arr2) {
            System.out.print(Arrays.toString(x));
        }
    }
}
