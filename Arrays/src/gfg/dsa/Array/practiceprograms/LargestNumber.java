package gfg.dsa.Array.practiceprograms;

public class LargestNumber {

	public static void main(String[] args) {
		int[] arr= {5,22,55,54};
		System.out.println(findLargestElement(arr));
	}
	static int findLargestElement(int arr[]){
		 int idx=1;
		 for (int i = 0; i < arr.length; i++) {
			if(arr[i]>arr[idx])
				idx=i;
		}
		 return idx;
	}
		 
	

}
