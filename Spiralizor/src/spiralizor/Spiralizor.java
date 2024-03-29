package spiralizor;

public class Spiralizor {
	public static void main(String[] args) {
		int[][] matrix = spiralize(99);
		for (int row = 0; row < matrix.length; row++) {
			for (int col = 0; col < matrix[row].length; col++) {
				System.out.printf("%4s", matrix[row][col]);
			}
			System.out.println();
		}
	}
	public static int[][] spiralize(int size) {
		int[][] res = new int[size][size];
		int f0 = 0, f1 = size-1;
		int c0 = 0, c1 = size-1;
		while(f0<=f1 && c0 <= c1) {
			for(int i = c0-1; i < c1; i++) if(i>=0) res[f0][i] = 1;
			f0+=2;
			for(int i = f0-2; i <= f1; i++) res[i][c1] = 1;
			c1-=2;
			for(int i = c1+1; i > c0; i--) res[f1][i] = 1;
			f1-=2;
			for(int i = f1+2; i >= f0; i--) res[i][c0] = 1;
			c0+=2;
		}
		if (size > 2 && size%2 == 0) { res[size/2][size/2-1] = 1; }
		return res;
	}
}
