public class FindPeakElementInMountainArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 6, 8, 9, 10, 6, 4, 3, 2, 1, 0};


        int index = findPeakElement(arr);
        System.out.println("The Index of Peak Element in Mountain Array is " + index);
    }

    public static int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] > nums[mid + 1]) {
                end = mid;
            } else if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            }
        }
        return start; //return start or end , since both will point to answer.
    }
}
