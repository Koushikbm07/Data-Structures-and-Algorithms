public class SearchInRotatedSortedArrayWithDuplicates {

    public static void main(String[] args) {
        int[] nums = {1,0,1,1,1};
        int target = 0;
        int pivot = findPivotIndexWithDuplicates(nums);
        int n = nums.length - 1;

        if (pivot == -1) { // No rotation -> Regular binary search
            System.out.println(binarySearch(nums, 0, n, target));
        } else {
            if (nums[pivot] == target) {
                System.out.println(pivot);
            } else if (target >= nums[0]) {
                // Target is in left part
                System.out.println(binarySearch(nums, 0, pivot - 1, target));
            } else {
                // Target is in right part
                System.out.println(binarySearch(nums, pivot + 1, n, target));
            }
        }
    }

    public static int findPivotIndexWithDuplicates(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // 🔹 Case 1: If mid > next element → Pivot is at mid
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            // 🔹 Case 2: If mid < previous element → Pivot is at mid - 1
            if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            }

            // 🔹 Case 3: Handle duplicates → Skip duplicates carefully
            if (nums[start] == nums[mid] && nums[mid] == nums[end]) {
                // If elements at start and end are the same, reduce search space
                if (start < end && nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;

                if (end > start && nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // 🔹 Case 4: Left side is sorted → Search in the right side
            else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            }
            // 🔹 Case 5: Right side is sorted → Search in the left side
            else {
                end = mid - 1;
            }
        }
        return -1; // Pivot not found
    }

    public static boolean binarySearch(int nums[], int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
