package com;

public class FindNumInArray {

	public static void main(String[] args) {

		int[] a=new int[] {1,2,3,4,5};
		int num=8;
		boolean numFound=checkBS(a,num);
		System.out.println(numFound);

	}

	static boolean check(int[] arr,int n) {
		boolean result=false;
		if(!arr.equals(null) && n<arr.length) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==n) {
					result=true;
					break;
				}
				else {
					result=false;
				}
			}
		}
		return result;
	}
	
	static boolean checkBS(int[] arr,int n) {
		boolean result=false;
		int len=arr.length;
		int s=arr[0];
		int e=arr[len-1];
		
		
		if(!(arr==null && n<arr.length)) {
			
			for(int i=0;i<len-1;i++) {
				
				int m=(s+e)/2;
				if(m==n) {
					result=true;
				}else if(n<m) {
					e=m-1;
					
				}else {
					s=m+1;
						
				}
			}
		}
		return result;
	}
}
