package fortinet;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ArrayDivideIntoKGroupsTest {

	@Test
	public void ArraySumTest() {
		
		ArrayDivideIntoKGroups arrDiv = new ArrayDivideIntoKGroups();
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		
		list.add(3);
		list.add(4);
		int k = 2;

		assertTrue(arrDiv.separate(list, k)==true);

	}
	
	@Test
	public void ArraySumTestBiggerList() {
		ArrayDivideIntoKGroups arrDiv = new ArrayDivideIntoKGroups();
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		
		list.add(3);
		list.add(4);

		list.add(5);
		list.add(6);
		
		list.add(7);
		list.add(8);
		
		list.add(10);

		int k = 2;

		assertTrue(arrDiv.separate(list, k)==true);

	}

	
	@Test
	public void ArraySumTestEvenBiggerList() {
		ArrayDivideIntoKGroups arrDiv = new ArrayDivideIntoKGroups();
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		
		list.add(3);
		list.add(4);

		list.add(5);
		list.add(6);
		
		list.add(7);
		list.add(8);
		
		list.add(9);
		list.add(10);
		
		list.add(11);
		list.add(12);

		int k = 3;

		assertTrue(arrDiv.separate(list, k)==true);

	}
	
	@Test
	public void ArraySumTestSumNotContinous() {
		
		ArrayDivideIntoKGroups arrDiv = new ArrayDivideIntoKGroups();
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(5);
		list.add(6);
		list.add(10);
		list.add(11);
		list.add(13);
		list.add(15);
		
		int k = 3;

		assertTrue(arrDiv.separate(list, k)==false);

	}

	@Test
	public void ArraySumTestSumNotContinous2() {
		
		ArrayDivideIntoKGroups arrDiv = new ArrayDivideIntoKGroups();
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(5);
		list.add(8);
		list.add(9);
		list.add(11);
		list.add(12);
		list.add(14);
		
		int k = 3;

		assertTrue(arrDiv.separate(list, k)==true);

	}



	
	@Test
	public void ArraySumTestSumNotDivisibleByK() {
		
		ArrayDivideIntoKGroups arrDiv = new ArrayDivideIntoKGroups();
		List<Integer> list = new ArrayList<>();

		list.add(1);
		list.add(2);
		
		list.add(3);
		list.add(4);
		int k = 3;

		assertTrue(arrDiv.separate(list, k)==false);

	}
	


}
