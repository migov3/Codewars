package spinWords;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class SpinWords {
	public static void main (String args[]) {
		System.out.println(spinWords("Welcome home Pakito"));
	}
	public static String spinWords(String sentence) {
		ArrayList<String> lista = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(sentence, " ");
		while(st.hasMoreTokens()) {
			String aux = st.nextToken();
			if(aux.length()<5)lista.add(aux);
			else {
				char[] c = new char[aux.length()];
				for(int i = 0; i < aux.length(); i++) c[aux.length()-i-1] = aux.charAt(i);
				lista.add(new String(c));
			}
		}
		return String.join(" ", lista);
	}
}
