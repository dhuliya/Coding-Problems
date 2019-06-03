import java.util.Arrays;

public class LowestPositiveInteger {
	public static void main(String[] args) {

		int[] arr = { 3, 4, -1, 1 };

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		System.out.println("Lowest Positive Integer :" + getLowestPositiveInteger(arr));

	}

	private static int getLowestPositiveInteger(int[] arr) {

		int retVal = -1;
		int prevVal = 0;

		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > 0) {
				if (arr[i] - prevVal != 1) {
					retVal = prevVal + 1;
					break;
				}
				prevVal = arr[i];
			}
		}

		if (retVal == -1) {
			retVal = prevVal + 1;
		}
		return retVal;
	}
}
