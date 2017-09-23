package fortinet;

import java.util.*;

public class ArrayDivideIntoKGroups {

	static boolean[] markTable;

	public boolean markVisited(int[] arr, int groupSum, int n) {

		// if(groupSum <0 ) return false;
		if (groupSum == 0)
			return true;

		if (n == 0 && groupSum != 0) {
			for (int i = 0; i < markTable.length; i++)
				markTable[i] = false;
			return false;
		}

		// this is the case where you are not including the last element in the array
		if (markVisited(arr, groupSum, n - 1)) {
			return true;
		}

		// this is the case where you include the last element
		else if (!(markTable[n - 1])) {
			// mark it before we enter
			markTable[n - 1] = true;
			if (markVisited(arr, groupSum - arr[n - 1], n - 1))
				return true;
			// mark it false before we exit recursion loop
			markTable[n - 1] = false;
		}

		return false;
	}

	public boolean processKGroups(int[] arr, int k, int n) {
		int sum = 0;
		for (int i : arr)
			sum += i;

		int groupSum = sum / k;
		if (sum % k != 0)
			return false;

		boolean reached = true;
		for (int i = k; i > 0; i--) {
			if (markVisited(arr, groupSum, n) == false) {
				reached = false;
			}
		}

		if (reached == true)
			return true;
		else
			return false;
	}

	public boolean separate(List<Integer> list, int k) {
		// Your resolution: find subset of sum totalSum/k k times, if we actually run through k times return true.
		
		// Time complexity: O(2^n*k) k times recursion which two branches from each level
		// Space complexity: O(n) for keeping track of visited

		int[] arr = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			arr[i] = list.get(i);
		}
		markTable = new boolean[list.size()];

		if (processKGroups(arr, k, list.size()))
			return true;
		else
			return false;

	}

	public static void main(String[] args) {

	}
}
