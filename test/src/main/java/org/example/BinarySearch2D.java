package org.example;

public class BinarySearch2D {
    public static int[] search(int[][] arr, int target) {
        int rows = arr.length;
        int cols = arr[0].length;

        // Validate target range
        if (target < arr[0][0] || target > arr[rows - 1][cols - 1]) {
            return new int[] {-1, -1}; // Target not found
        }

        int low = 0;
        int high = rows - 1;

        // Outer loop (binary search for row)
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid][0] > target) {
                high = mid - 1;
            } else if (arr[mid][cols - 1] < target) {
                low = mid + 1;
            } else {
                // Potential row found, perform binary search within the row
                int colIndex = binarySearch(arr[mid], target);
                if (colIndex != -1) {
                    return new int[] {mid, colIndex}; // Target found
                }
                break; // Target not found in this row, search next
            }
        }

        return new int[] {-1, -1}; // Target not found
    }

    // Regular binary search within a row (helper function)
    private static int binarySearch(int[] row, int target) {
        int low = 0;
        int high = row.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (row[mid] == target) {
                return mid;
            } else if (row[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return -1; // Target not found in the row
    }

    public static void main(String[] args) {
        int[][] arr = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int target = 30;
        int[] index = search(arr, target);

        if (index[0] != -1) {
            System.out.println("Target found at: [" + index[0] + ", " + index[1] + "]");
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}
