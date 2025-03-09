import java.util.SortedSet;

public class BinarySearch {

    public static void main(String[] args){
        int[] arr={1,2,4,5,6,8,9,10};
        int target=10;


        int index=binarySearch(arr,target);
        System.out.println("The Index of Target is " + index);
    }

    public static int binarySearch(int[] nums,int target ){
        int start=0;
        int end=nums.length-1;
        int ans=-1;
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
