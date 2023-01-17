package Mypack;

public class arrcmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={12,34,14,33,22,11,19,45,61};
		int tem;
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i]>arr[j]){
					tem=arr[i];
					arr[i]=arr[j];
					arr[j]=tem;
				}
			}
		}
		System.out.println("low array:"+arr[0]);
		System.out.println("high array:"+arr[arr.length-1]);
	}

}
