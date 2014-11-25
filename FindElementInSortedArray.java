package com.datastructs;


public class FindElementInSortedArray {
	
	public static void main(String args[]){
		int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
		int ele = 5;
		//Advanced For Loop
		for(int l : arr){
			if(l==5){
				System.out.println("Ele " + ele + " found");
			}
		}
	}

}
