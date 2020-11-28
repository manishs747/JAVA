package exceptions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Algo {

    public static void main(String[] args) {

    }

    public static boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i : arr) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }

        Set<Integer> countSet = new HashSet<>();
        for (int val : countMap.values()) {
            if (countSet.contains(val)) {
                return false;
            }
            countSet.add(val);
        }
        return true;
    }
}
