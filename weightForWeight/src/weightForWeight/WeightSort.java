package weightForWeight;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.TreeMap;

public class WeightSort {
	public static void main(String args[]) {
		orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123");
	}

	public static String orderWeight(String strng) {
		final TreeMap<String, Integer> numW = new TreeMap<String, Integer>();
		final ArrayList<String> repetidos = new ArrayList<String>();
		int i = 0, weight = 0;
		char[] listaChar = strng.toCharArray();
		String numAct = "";
		while(i<=listaChar.length) {
			if(i!=listaChar.length && listaChar[i]!=' ') {
				weight = weight + Character.getNumericValue(listaChar[i]);
				numAct = numAct + listaChar[i];
			}else {
				if(numAct!="") {
					if(!numW.containsKey(numAct)) numW.put(numAct, weight);
					else repetidos.add(numAct);
				}
				weight = 0;
				numAct = "";
			}
			i++;
		}
		ArrayList<String> listares = ord(numW);
		for(String rep : repetidos){
			for(String nl : listares) {
				if(nl.equals(rep)) {
					listares.add(listares.indexOf(nl), rep);
					break;
				}
			}
		}
		String res = String.join(" ", listares);
		return res;
	}

	public static ArrayList<String> ord(TreeMap<String, Integer> numW) {
		Collection<Integer> valores = numW.values();
		ArrayList<Integer> val = new ArrayList<Integer>(valores);
		ArrayList<String> res = new ArrayList<String>();
		Collections.sort(val);
		Set<String> keys = numW.keySet();
		for(int i : val) {
			ArrayList<String> remov = new ArrayList<String>();
			for(String x : keys) {
				int v = numW.get(x);
				if(v==i) {
					res.add(x);
					remov.add(x);
				}
			}
			for(String j : remov) {
				keys.remove(j);
			}
		}
		return res;
	}
}
