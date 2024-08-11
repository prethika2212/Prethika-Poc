package com.javaPractise1;
import java.util.*;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers= {70,10,6,20,80,8,12};
		
			//System.out.println(numbers);	
		for(int i=0; i<numbers.length;i++) 
		{
			for(int j=i+1;j<numbers.length;j++) {
				int tmp=0;
			if(numbers[i]>numbers[j]) {
				tmp=numbers[i];
				numbers[i]=numbers[j];
				numbers[j]=tmp;
							}
			
			}
		}
		
		for(int i=0;i<numbers.length;i++)
		{
			System.out.println(numbers[i]);
		}
		
	}

}
