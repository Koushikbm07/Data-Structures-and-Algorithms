
public class Array {
		int size=0;
		int arr[]=null;
		int capacity=0;
		Array(int capacity){
			arr = new int[capacity];
			this.capacity=capacity;
			
		}
		Array(){};
		
		boolean search(int ele) {
			for (int i = 0; i < arr.length; i++) {
				if(arr[i]==ele)
					return true;
			}
			return false;
		}
		void insert(int arr[],int pos,int ele) {
			if(size==capacity) 
				return ;
			for(int i=size-1;i>=pos-1;i--) {
				arr[i+1]=arr[i];
			}
			arr[pos-1]=ele;
			
			size++;
		}
}
