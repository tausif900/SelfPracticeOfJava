package practice;

public class Array2D {
	public static void main(String[] args) {
		int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
		System.out.println(arr[1].length);

//		int arr1[][] = new int[2][3];
//		arr1[0][0] = 3;
//		System.out.println(arr1);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
