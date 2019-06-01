import java.util.ArrayList;
import java.util.Collections;

public class SumOfTwoNumbers {
	public static void main(String[] args) {

		ArrayList<Integer> list = new ArrayList<Integer>();
		int k = 0;

		k = 19;

		list.add(10);
		list.add(15);
		list.add(3);
		list.add(7);

		System.out.print("Answer : " + isNumbersExists(list, k));

	}

	private static boolean isNumbersExists(ArrayList<Integer> list, int k) {

		boolean retFlag = false;

		Collections.sort(list);
		Object[] a = list.toArray();

		System.out.println("Sorted list : " + list);

		for (int i = 0, j = a.length - 1; i <= j;) {
			
			int p = (int) a[i];
			int q = (int) a[j];
			int rest = k - p;

			if (q == rest) {
				retFlag = true;
				break;
			} else if (q > rest) {
				j--;
			} else {
				i++;
			}

		}

		return retFlag;
	}
}
