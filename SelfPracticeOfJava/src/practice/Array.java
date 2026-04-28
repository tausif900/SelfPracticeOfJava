package practice;

public class Array {
	public static void main(String[] args) {
		int myArr[] = new int[6];
		myArr[0] = 25;
		myArr[1] = 5;
		myArr[2] = 2;
		myArr[3] = 6;
		myArr[4] = 10;
		myArr[5] = 9;
		System.out.println(myArr[3]);

		int myArr1[] = { 1, 8, 9, 6 };
		System.out.println(myArr1[1]);

//		Array traversal. from 0 to last index ghumke aagy
		for (int i = 0; i < myArr.length; i++) {
			System.out.println(myArr[i]);
		}
	}
}
