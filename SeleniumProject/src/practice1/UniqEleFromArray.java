package practice1;

public class UniqEleFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 5, 9, 1 };
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < i; j++) {
				if (arr[i] == arr[j])
				break;
			}
			if (i == j)
				System.out.println(arr[i] + " ");
			
		}
	}

}
