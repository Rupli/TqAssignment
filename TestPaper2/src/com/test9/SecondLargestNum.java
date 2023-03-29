package com.test9;

public class SecondLargestNum {
	
	public static void secondLargestNum(int [] arr)
	
	{
		int largest = arr[0];
		int secondlargest=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i] > largest)
			{
				largest=arr[i];
			}
			else if (arr[i] > secondlargest && arr[i] !=largest)
			{
				secondlargest = arr[i];
			}
		}
		
		System.out.println("second largest number:"+ secondlargest);
	}

	public static void main(String[] args)
	{
		int arr	[] = {64,56,3,5,12,44,63,65};
		secondLargestNum(arr);
}
}