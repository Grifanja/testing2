package wholeDividers;

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		searchForNumbers();
	}

	public static void searchForNumbers() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int count = in.nextInt();
		ArrayList<Integer> arr;
		arr = new ArrayList<Integer>();

		int k = count % 2 == 0 ? 2 : 3;
		for (int i = 0; i < count / 2; i++) {
			if (count % (i + 1) == 0) {
				arr.add(i + 1);
			}
		}

		for (int el : arr) {
			System.out.print(el + " ");
			// System.out.print(-el + " ");
		}
		System.out.print(count);
	}
}
