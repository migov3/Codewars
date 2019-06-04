package nextBiggerNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Kata {
	public static void main (String args[]) {
		System.out.println(nextBiggerNumber(123456789));
	}
	public static long nextBiggerNumber(long n)
	{
		ArrayList<String> nr = new ArrayList<String>(Arrays.asList(String.valueOf(n).split("")));
		ArrayList<String> aux = new ArrayList<String>();
		long res = -1;
		int v0, v1;
		for(int i = nr.size()-1; i >= 0; i--) {
			v0 = Integer.valueOf(nr.get(i));
			if(i-1!=-1) {
				v1 = Integer.valueOf(nr.get(i-1));
				if(v0 > v1) {
					nr.set(i-1, String.valueOf(v0));
					nr.set(i, String.valueOf(v1));
					int primera = v0;
					for(int j = i+1; j < nr.size(); j++) {
						v0 = Integer.valueOf(nr.get(j));
						if (v0>v1 && v0<=primera) {
							nr.set(i-1, String.valueOf(v0));
							nr.set(j, String.valueOf(primera));
							primera = v0;
						}
					}
					for(int x = i; x < nr.size(); x++) {
						aux.add(nr.get(x));
					}
					Collections.sort(aux);
					int z = 0;
					for(int x = i; x < nr.size(); x++) {
						nr.set(x, aux.get(z));
						z++;
					}
					res = Long.parseLong(String.join("", nr));
					break;
				}
			}
		}
		return res;
	}
}
