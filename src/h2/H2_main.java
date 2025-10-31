package h2;

public class H2_main {

	public static void main(String[] args) {

		int i = 0;
		int j = 1;
		int k = 1;
		int min = 1;
		int max = 1;

		if (i < j && i < k) {
			min = i;

		} else if (j < i && j < k) {
			min = j;

		} else if (k < i && k < j) {
			min = k;

		}

		if (i > j && i > k) {
			max = i;
			
		} else if (j > i && j > k) {
			max = j;

		} else if (k > i && k > j) {
			max = k;

		}
	}

}
