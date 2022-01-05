package com.tej.generalproblems;

public class LongestSubstring {

	public static void main(String[] args) {
		String str= "calolac";

		findLongest(str);


	}

	private static void findLongest(String str) {
		int maxlen=1;
		int start=0;

		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {

				int flag=1;
				for(int k=0;k<j-i+1;k++) {
					if(str.charAt(i+k)!=str.charAt(j-k)) {
						flag=0;
					}
					if(flag!=0 && (j-i+1)>maxlen) {
						start=i;
						maxlen=j-i+1;
						System.out.println("longest pallindrome substring");
						printSubstr(str,start,start+maxlen-1);
						
					}
				}
			}
		}
	}
	private static void printSubstr(String strF, int start, int end) {

		for(int i=start;i<end;i++) {
			System.out.print(strF.charAt(i));
		}
	}

}
