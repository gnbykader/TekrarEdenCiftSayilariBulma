import java.util.Arrays;

public class Main {
	static boolean ishave(int[] arr, int value) {
		for (int i : arr) {
			if (i == value) {
				return true;
			}
		}
		return false;

	}

	public static void main(String[] args) {
		int[] list = { 2, 3, 2, 2, 4, 6, 7, 3, 12, 8, 3, 12, 4 };
		int[] duplicate = new int[list.length];
		int startIndex = 0;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				if (list[i] % 2 == 0) {
					if ((i != j) && (list[i] == list[j])) {
						if (!ishave(duplicate, list[i])) {
							duplicate[startIndex++] = list[i];
						}
						break;
					}
				}
			}
		}
        System.out.println("Listede Cift Olan Ve Kendini Tekrar Eden Sayilar: ");
		for (int value : duplicate) {
			if (value != 0) {
				System.out.println(value);
			}
		}

	}

}
