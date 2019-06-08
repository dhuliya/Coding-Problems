
public class ContinuousSubArraySum {

	public static void main(String args[]) {

		int[] arr = { 5, 6, 7, 9, 10 };
		int sum = 15;

		int[] subArray = getSubArrayIndexPos(arr, sum);

		System.out.println("Sub array : ");

		if (subArray != null) {
			for (int i = 0; i < subArray.length; i++) {
				System.out.print(subArray[i] + " ");
			}
		} else {
			System.out.print("Doesn't Exists");
		}
	}

	private static int[] getSubArrayIndexPos(int[] arr, int sum) {

		int total = 0;
		int lower = 0, upper = 0;

		while (upper < arr.length) {
			int s = total + arr[upper];

			if (s == sum) {
				break;
			} else if (s < sum) {
				total += arr[upper++];
			} else {
				total -= arr[lower++];
			}
		}

		if (upper < arr.length) {
			return new int[] { lower, upper };
		} else {
			return null;
		}
	}
}
