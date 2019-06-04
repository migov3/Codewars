package sumOfDivided;

import java.util.ArrayList;
import java.util.TreeMap;

public class SumOfDivided {
	public static void main(String[] args) {
		String res = sumOfDivided(new int[] {100000, 1000000}); //(2 -61548)(3 -4209)(5 -28265)(23 -4209)(31 -31744)(53 -72769)(61 -4209)(1373 -72769)(5653 -28265)(7451 -29804)
		System.out.print(res);
	}

	public static String sumOfDivided(int[] l) {
		// your code
		ArrayList<Integer> fprimos = new ArrayList<Integer>();
		TreeMap<Integer, ArrayList<Integer>>lista = new TreeMap<Integer, ArrayList<Integer>>();
		for(int x : l) {
			fprimos = FactoresPrimos(x);
			lista.put(x, fprimos);
		}
		TreeMap<Integer, Integer>nLista = new TreeMap<Integer, Integer>();
		int aux = 0, occs = 0, aux2 = 1;
		for(int j : lista.keySet()) {
			for(int x : lista.get(j)) {
				if(nLista.get(x)!=null) aux = nLista.get(x);
				for (int g : l) {
					if(g==j) {
						aux2 = j * occs;
						occs++;
					}
				}
				nLista.put(x, aux2+aux+j);
				aux=0; occs=0; aux2=0;
			}
		}
		String res = new String();
		for(int h : nLista.keySet()) {
			res = res+"("+h+" "+nLista.get(h)+")";
		}
		return res;
	}

	static ArrayList<Integer> FactoresPrimos(int n) {
		ArrayList<Integer> pFactors = new ArrayList<Integer>();
		while(n%100==0) n=n/10;
		if(n<0) {
			for(int i=1; i>(n/2)-1;i--) {
				if(esPrimo(-i) && (n%(-i)==0)) {
					pFactors.add(-i);
				}
			}
		}else {
			for(int i=1; i<(n/2)+1;i++) {
				if((esPrimo(i)) && (n%i==0)) {
					pFactors.add(i);
				}
			}
		}
		if(esPrimo(n)) pFactors.add(n);
		else if (esPrimo(-n)) pFactors.add(-n);
		return pFactors;
	}

	private static boolean esPrimo(int n) {
		int count = 0;
		for(int i=1;i<(n/2)+1;i++) {
			if(n%i==0) count++;
			if(count==2) break;
		}
		return (count < 2 && n>1);
	}
}