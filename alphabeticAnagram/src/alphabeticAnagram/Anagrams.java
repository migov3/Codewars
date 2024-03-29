package alphabeticAnagram;

import java.math.BigInteger;
import java.util.Arrays;

public class Anagrams {

	public static void main(String args[]) {
		System.out.println(listPosition("ABAB")); //24572
	}

	public static BigInteger listPosition(String word) {
		BigInteger res = BigInteger.ZERO;
		int count = 0;
		char[] w = word.toCharArray();
		for(int i = 0; i < w.length-1; i++) {
			for(int j = i+1; j < w.length; j++) {
				if(w[i] > w[j]) count++;
			}// number of letters before current letter in the alphabet (count) * number of anagrams that could be made with remaining letters (perms of w2)
			char[] w2 = Arrays.copyOfRange(w, i, w.length); //remaining letters
			int[] c = getUniqueLetters(new String(w2));
			res = res.add(BigInteger.valueOf(count).multiply(permutations(w2.length-1, c)));
			count = 0;
		}
		return res.add(BigInteger.ONE);
	}

	public static BigInteger factorial(int n) {
		if(n == 0) return BigInteger.ZERO;
		BigInteger res = BigInteger.ONE;
		for(long i = n; i > 0; i--) res = res.multiply(BigInteger.valueOf(i));
		return res;
	}

	private static BigInteger permutations(int l, int[] c) { // formula: n!/(m[i]!)
		if(l == 0) return BigInteger.ZERO;
		BigInteger res = factorial(l);
		for(int i = 0; i < c.length; i++) if(c[i]!=0) {
			res = res.divide(factorial(c[i]));
		}
		return res;
	}

	public static int[] getUniqueLetters(String w) { //O(n)
		int[] c = new int[256];
		for (int i = 0; i < w.length(); i++) {
			c[(int)w.charAt(i)]++;
		}
		return c;
	}
}