package nb;

import java.util.Arrays;

public class ArrayCopy {
	public static void main(String[] args) {
		int[] arr = {3,7,12,8,4};
		int[] arr1 = Arrays.copyOf(arr, arr.length-2);
		System.out.println("拷贝后的数组为:"+Arrays.toString(arr1));
	}
}