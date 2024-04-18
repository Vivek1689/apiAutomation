package org.example;

import java.util.HashMap;
import java.util.Map;

public class UniqueLetters {

    public static int minDeletions(String S) {
        // Count occurrences of each letter
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : S.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Count occurrences of each frequency
        Map<Integer, Integer> frequencyCount = new HashMap<>();
        for (int count : frequencyMap.values()) {
            frequencyCount.put(count, frequencyCount.getOrDefault(count, 0) + 1);
        }

        // Calculate the total number of deletions required
        int deletions = 0;
        for (int count : frequencyCount.keySet()) {
            int freq = frequencyCount.get(count);
            if (freq > 1) {
                // If there are multiple letters with the same frequency, we need to delete some
                for (int i = 1; i < freq; i++) {
                    deletions += count;
                }
            }
        }

        return deletions;
    }

    public static void main(String[] args) {
        String input = "aabbbcccdd";
        int minDeletions = minDeletions(input);
        System.out.println("Minimum number of deletions: " + minDeletions);
    }
}
