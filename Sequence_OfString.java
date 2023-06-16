package backtracking;

import java.util.Arrays;
import java.util.ArrayList;



public class Sequence_OfString {
	
	public static void printSequence(int arr[],int index, ArrayList<Integer> tempArr)
	{
		if(index==arr.length)
		{
			//print the subsequence-- but do not print empty entries
			if(tempArr.size()>0)
			{
				System.out.println(tempArr);
			}
			return;
		}
		
		//recursive call
		
		//include
		printSequence(arr,index+1,tempArr);
		
		//add the value in tempArr
		tempArr.add(arr[index]);
		
		//do not include
		printSequence(arr,index+1,tempArr);
		
		//remove the last value
		tempArr.remove(tempArr.size()-1);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2};
		System.out.println("For the array-"+Arrays.toString(arr));
		printSequence(arr,0,new ArrayList<>());
		
		int arr1[]= {1,2,3};
		System.out.println("For the array-"+Arrays.toString(arr1));
		printSequence(arr1,0,new ArrayList<>());
		
	}

}
