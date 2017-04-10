package array1;

public class Array {
	private int n, p = 0, g = 1, k = 1;
	int[] array;
	Array(int n) {
		this.n = n;
		array = new int[n];

	}


	void add(int a) {

		if (p < n) {
			array[p] = a;
			p++;
		}
		else System.out.println("not add");
	}

	void sort_ltos() {
		int max = array[0], c = 0;
		int arr[] = new int[n];
		for (int j = 0; j < n; j++) {
			for (int i = 1; i < n; i++) {
				if (array[i] > max) {
					c = i;
					max = array[i];
				}

			}
			arr[j] = max;
			array[c] = -1000;
			max = 0;
		}

	}

	int[] sort_stol() {
		int min = array[0], c = 0;
		int arr[] = new int[n];
		for (int j = 0; j < n; j++) {
			for (int i = 1; i < n; i++) {
				if (array[i] < min) {
					c = i;
					min = array[i];
				}

			}
			arr[j] = min;
			array[c] = 1000;
			min = 0;
		}
		return arr;

	}

	int[] add_sort(int a) {
		int c = n + g - 1;
		int[] add = new int[n + g];
		for (int i = 0; i < n; i++) {
			if (array[i] > a)
				add[i] = array[i];
			else {
				add[i] = a;
				c = i;
				break;
			}

		}
		for (int j = c; j < n + g; j++) {
			add[j + 1] = array[j];
		}
		g++;

		return add;
	}

	int[] delete(int a) {

		int c = n - k + 1;
		int[] del = new int[n - k];
		for (int i = 0; i < n; i++) {
			if (array[i] != a)
				del[i] = array[i];
			else {
				c = i;
				break;
			}

		}
		for (int j = c; j < n + g; j++) {
			del[j] = array[j + 1];
		}

		return del;

	}

	int search(int a) {
		int d = -1;
		for (int i = 0; i < n; i++) {
			if (array[i] == a)
				d = i + 1;
		}

		return d;
	}
}
