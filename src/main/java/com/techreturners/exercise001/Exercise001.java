package com.techreturners.exercise001;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise001 {

    // In this Kata, you will be given an array of numbers in which two numbers occur once and the rest occur only twice. 
    // Your task will be to return the sum of the numbers that occur only once.
    // For example, repeats([4,5,7,5,4,8]) = 15 because only the numbers 7 and 8 occur once, and their sum is 15.

    // More examples in exercise001 test cases.

    // Good luck!
	
    public int singles(int [] arr){
        // Add your code here!
        List<Integer> singles_arr= new ArrayList<>();
        int sum=0;
        int size=arr.length;
         Arrays.sort(arr);
        if(arr[0]!=arr[1]){
            singles_arr.add(arr[0]);
        }
        if(arr[size-2] != arr[size-1]){
            singles_arr.add(arr[size-1]);
        }
    	for(int i=1;i<size-1;i++){
    	    if((arr[i]!=arr[i+1]) && (arr[i]!=arr[i-1])){
                singles_arr.add(arr[i]);
            }
        }

      for(int i=0;i<singles_arr.size();i++){
          sum+=singles_arr.get(i);
      }



        return sum;
    }

}
