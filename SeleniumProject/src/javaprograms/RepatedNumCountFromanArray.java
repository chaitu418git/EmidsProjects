package javaprograms;

import java.util.ArrayList;

public class RepatedNumCountFromanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = { 1, 2, 3, 4, 1, 1, 2, 2, 3, 4, 3, 4, 3, 4, 6, 7, 6, 9, 6, 9, 9, 9 };
		ArrayList al = new ArrayList();
		for (int i = 0; i < a.length; i++) {
			int k = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);
				k++;
				for (int j = i + 1; j < a.length; j++) {
					if (a[i] == a[j]) {
						k++;
					}

				}
				System.out.println(a[i] + "--" + k);
			}

		}

	}

}
