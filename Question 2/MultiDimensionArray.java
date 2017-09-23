package fortinet;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.*;



class MultiDimensionArray {
		static long[][] arr;
		
		MultiDimensionArray(){
			arr = new long[3][3];
			arr[1][2] = 5;
		}
		
	    // This is a provided function, Assume it works
	    public static Long getValue(int... indexOfDimension) {
	        //... 
	    	
	        return arr[indexOfDimension[0]][indexOfDimension[1]];
	    }
	    
	    
	    // lengthOfDeminsion: each dimension's length, assume it is valid: lengthOfDeminsion[i]>0.
	    public static Long sum(MultiDimensionArray mArray, int[] lengthOfDimension) { 
	   // Your resolution 
	   // Time complexity:  
	   // Space complexity: 
			int len = lengthOfDimension.length;
			int[] dimension = new int[len];
			int poc = len-2;
			long sum = 0;
			while (poc >= 0) {
			    for (dimension[len-1] = 0; dimension[len-1] < lengthOfDimension[len-1]; dimension[len-1]++)
			    {
			        sum += getValue(dimension);
			    }
			    while (poc >= 0 && ++dimension[poc] == lengthOfDimension[poc])
			    {
			        dimension[poc--] = 0;
			    }
			    if (poc >= 0) poc = len-2;
			}
			return sum;
	    }
	
    
    public static void main(String[] args) {
    	MultiDimensionArray A =	new MultiDimensionArray();
    	int[] dim = new int[2];
    	dim[0] = 3;
    	dim[1] = 3;
    System.out.println(MultiDimensionArray.sum(A, dim));
    }
}
