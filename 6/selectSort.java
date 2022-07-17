public class select {

	public static void main(String[] args) {
        int[] arr = {7, 5, 9, 0, 3, 1, 6, 2, 4, 8};
		
		for(int i=0;i<arr.length;i++) {
			int index = i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[index]>arr[j]) {
					index = j;
				}
			}
			int tmp = arr[i];
			arr[i] = arr[index];
			arr[index] = tmp;		
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] +" ");
		}

	}

}
