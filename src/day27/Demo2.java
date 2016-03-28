package day27;

import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class Demo2 {
	@BeforeClass
	public static void beforeTest() {
		System.out.println("Parparing test development...");
	}
	
	@Test
	public void sort() {
		int[] array = {2, 4, 2, 55, 1, 6, 34};
		for (int i = 0; i < array.length-1; i++) {
			for (int j = i+1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(array));
	}
	
	@AfterClass
	public static void afterTest() {
		System.out.println("Test ending...");
	}
}
