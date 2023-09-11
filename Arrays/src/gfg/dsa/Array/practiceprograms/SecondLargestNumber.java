package gfg.dsa.Array.practiceprograms;

public class SecondLargestNumber {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,24,2,55,10};
		System.out.println(getSecondLargest(arr));
	}
	static int getSecondLargest(int arr[]) {
		
		int idx=LargestNumber.findLargestElement(arr);
		int res=0;//to get previous element
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=arr[idx] && arr[i]>arr[res]) {
				res=i;
			}
		}
		
		return (res>=0)?res:-1;
	}
}
