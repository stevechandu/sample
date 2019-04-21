
public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int intArray[] = new int[] { 15, 19, 18, 12, 11 };
		int b[] = sortArray(intArray);
		for (int i = 0; i < b.length; i++) {
			System.out.println("Sort array is " + b[i]);
		}

	}

	public static int[] sortArray(int[] a) {
		int len = a.length;
		int temp = 0;
		for (int i = 0; i < len; i++) {
				for(int j = 0; j < len; j++){
			if (a[i] < a[j]){
				temp = a[i];
			a[i]=a[j];
			a[j] = temp;
			}
		}
		}
		return a;
	}
}
