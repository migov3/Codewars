package integerSquareRoot;

public class integerSquareRoot {

	public static void main(String[] args) {
		int n = 120;
		for(int i = 1; i <= n; i++) {
			for(int j = n-i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = n-1; i > 0; i--) {
			for(int j = n-i; j > 0; j--) {
				System.out.print(" ");
			}
			for(int j = i; j > 0; j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	public static String integerToSquareRoot(String n) {
		String res;
		if(n.length() < 19) res = String.valueOf((int)Math.sqrt(Double.parseDouble(n)));
		else {
			res = n.substring(0, 16);
			float root = (float)Math.floor(Math.sqrt(Long.parseLong(res)));
			res = String.valueOf(root * Math.pow(10, n.length()));
		}
		return res;
	}
}
//9223372036854123
//9223372036854123