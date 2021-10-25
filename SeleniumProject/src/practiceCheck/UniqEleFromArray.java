package practiceCheck;

public class UniqEleFromArray {

	public static void main(String[] args) {
		int arr[] = { 1, 5, 9, 1, 4, 9, 6, 5, 9, 7 };

		int i, j;
		//System.out.print("The array is: ");

		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < i; j++) {
				if (arr[i] == arr[j])
					break;

			}
			if (i == j)
				System.out.print(arr[i] + " ");
		}
	}

}
