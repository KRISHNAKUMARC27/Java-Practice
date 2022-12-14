package leetcode;

public class PlusOne {

	public static int[] plusOne(int[] digits) {

		int n = digits.length;
		for (int i = n - 1; i >= 0; i--) {
			if (digits[i] < 9) {
				digits[i]++;
				return digits;
			}

			digits[i] = 0;
		}

		int[] newNumber = new int[n + 1];
		newNumber[0] = 1;

		return newNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] out = PlusOne.plusOne(new int[] { 4, 3, 2, 1 });

		for (int k : out) {
			System.out.println(k);
		}

	}

}
