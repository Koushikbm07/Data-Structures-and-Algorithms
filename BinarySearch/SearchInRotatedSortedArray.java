public class SearchInRotatedSortedArray {

    public static void main(String[] args) {
        int[] nums={3,4,5,6,7,0,1,2};
        int target=0;
        int pivot=findPivotIndex(nums);
        int n=nums.length-1;
        if(pivot==-1){
            System.out.println(binarySearch(nums,0,n,target));
        }

        if(target==nums[pivot]) {
            System.out.println(pivot);
        }
        if(target<=nums[0]) {
            System.out.println( binarySearch(nums,pivot+1,n,target));
        }
        else{
            System.out.println( binarySearch(nums,0,pivot-1,target));
        }


    }

    public static int findPivotIndex(int[] nums){
        int start=0;
        int end=nums.length-1;

        while(start<=end){
            int mid=start+(end-start)/2;

            if(mid<end && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(mid>start && nums[mid]<nums[mid-1]){
                return mid-1;
            }
            if(nums[mid]>=nums[start]){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return -1; // pivot Not found
    }
    public static int binarySearch(int nums[] ,int start ,int end, int target){

        while(start<=end){
            int mid=start+(end-start)/2;
            if(nums[mid]>target){
                end=mid-1;
            }
            else if(nums[mid]<target){
                start=mid+1;
            }
            else{
                return mid;

            }
        }
        return -1;
    }
}
