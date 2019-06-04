package observedPin;

import java.util.ArrayList;
import java.util.List;

public class ObservedPin {
	public static void main(String args[]) {
		getPINs("111");
	}
	public static List<String> getPINs(String observed) {
		final int[] COMB0 = {0,8};
		final int[] COMB1 = {1,2,4};
		final int[] COMB2 = {1,2,3,5};
		final int[] COMB3 = {2,3,6};
		final int[] COMB4 = {1,4,5,7};
		final int[] COMB5 = {2,4,5,6,8};
		final int[] COMB6 = {3,5,6,9};
		final int[] COMB7 = {4,7,8};
		final int[] COMB8 = {5,7,8,9,0};
		final int[] COMB9 = {6,8,9};
		ArrayList<String> lista = new ArrayList<String>();
		for(int i = 0; i<observed.length(); i++) {
			String n = observed.substring(i, i+1);
			switch (n) {
			case "1":
				if(lista.isEmpty()){
					for(int j : COMB1) {
						lista.add(String.valueOf(j));
					}
				}
				else {
					ArrayList<String> aux = new ArrayList<String>(lista.size()*COMB1.length);
					for(String x : lista) {
						String str = x;
						for(int j : COMB1) {
							str = x + String.valueOf(j);
							aux.add(str);
						}
					}
					lista = aux;
				}
				break;
			case "2":
				if(lista.isEmpty()){
					for(int j : COMB2) {
						lista.add(String.valueOf(j));
					}
				}
				else {
					ArrayList<String> aux = new ArrayList<String>(lista.size()*COMB2.length);
					for(String x : lista) {
						String str = x;
						for(int j : COMB2) {
							str = x + String.valueOf(j);
							aux.add(str);
						}
					}
					lista = aux;
				}
				break;
			case "3":
				if(lista.isEmpty()){
					for(int j : COMB3) {
						lista.add(String.valueOf(j));
					}
				}
				else {
					ArrayList<String> aux = new ArrayList<String>(lista.size()*COMB3.length);
					for(String x : lista) {
						String str = x;
						for(int j : COMB3) {
							str = x + String.valueOf(j);
							aux.add(str);
						}
					}
					lista = aux;
				}
				break;
			case "4":
				if(lista.isEmpty()){
					for(int j : COMB4) {
						lista.add(String.valueOf(j));
					}
				}
				else {
					ArrayList<String> aux = new ArrayList<String>(lista.size()*COMB4.length);
					for(String x : lista) {
						String str = x;
						for(int j : COMB4) {
							str = x + String.valueOf(j);
							aux.add(str);
						}
					}
					lista = aux;
				}
				break;
			case "5":
				if(lista.isEmpty()){
					for(int j : COMB5) {
						lista.add(String.valueOf(j));
					}
				}
				else {
					ArrayList<String> aux = new ArrayList<String>(lista.size()*COMB5.length);
					for(String x : lista) {
						String str = x;
						for(int j : COMB5) {
							str = x + String.valueOf(j);
							aux.add(str);
						}
					}
					lista = aux;
				}
				break;
			case "6":
				if(lista.isEmpty()){
					for(int j : COMB6) {
						lista.add(String.valueOf(j));
					}
				}
				else {
					ArrayList<String> aux = new ArrayList<String>(lista.size()*COMB6.length);
					for(String x : lista) {
						String str = x;
						for(int j : COMB6) {
							str = x + String.valueOf(j);
							aux.add(str);
						}
					}
					lista = aux;
				}
				break;
			case "7":
				if(lista.isEmpty()){
					for(int j : COMB7) {
						lista.add(String.valueOf(j));
					}
				}
				else {
					ArrayList<String> aux = new ArrayList<String>(lista.size()*COMB7.length);
					for(String x : lista) {
						String str = x;
						for(int j : COMB7) {
							str = x + String.valueOf(j);
							aux.add(str);
						}
					}
					lista = aux;
				}
				break;
			case "8":
				if(lista.isEmpty()){
					for(int j : COMB8) {
						lista.add(String.valueOf(j));
					}
				}
				else {
					ArrayList<String> aux = new ArrayList<String>(lista.size()*COMB8.length);
					for(String x : lista) {
						String str = x;
						for(int j : COMB8) {
							str = x + String.valueOf(j);
							aux.add(str);
						}
					}
					lista = aux;
				}
				break;
			case "9":
				if(lista.isEmpty()){
					for(int j : COMB9) {
						lista.add(String.valueOf(j));
					}
				}
				else {
					ArrayList<String> aux = new ArrayList<String>(lista.size()*COMB9.length);
					for(String x : lista) {
						String str = x;
						for(int j : COMB9) {
							str = x + String.valueOf(j);
							aux.add(str);
						}
					}
					lista = aux;
				}
				break;
			case "0":
				if(lista.isEmpty()){
					for(int j : COMB0) {
						lista.add(String.valueOf(j));
					}
				}
				else {
					ArrayList<String> aux = new ArrayList<String>(lista.size()*COMB0.length);
					for(String x : lista) {
						String str = x;
						for(int j : COMB0) {
							str = x + String.valueOf(j);
							aux.add(str);
						}
					}
					lista = aux;
				}
				break;
			}
		}
		return lista;
	} // getPINs
}
