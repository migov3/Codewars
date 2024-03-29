package parseIntReloaded;

import java.util.HashMap;
import java.util.StringTokenizer;

public class Parser {
	public static void main(String[] args) {
		System.out.println(parseInt("seven hundred eighty-three thousand nine hundred and nineteen"));
	}
	public static int parseInt(String numStr) {
		HashMap<String, Integer> valores = new HashMap<String, Integer>()
		{private static final long serialVersionUID = 1L;
		{put("zero", 0);put("one", 1);put("two", 2);put("three", 3);put("four", 4);
		put("five", 5);put("six", 6);put("seven", 7);put("eight", 8);put("nine", 9);
		put("ten", 10);put("eleven", 11);put("twelve", 12);put("thirteen", 13);put("fourteen", 14);
		put("fifteen", 15);put("sixteen", 16);put("seventeen", 17);put("eighteen", 18);put("nineteen", 19);
		put("twenty", 20);put("thirty", 30);put("forty", 40);put("fifty", 50);put("sixty", 60);
		put("seventy", 70);put("eighty", 80);put("ninety", 90);}};

		HashMap<String, Integer> mult = new HashMap<String, Integer>()
		{private static final long serialVersionUID = 1L;
		{put("hundred", 100);put("thousand", 1000);put("million", 1000000);}};

		StringTokenizer st = new StringTokenizer(numStr, " -");
		int res = 0;
		while(st.hasMoreTokens()) {
			String aux = st.nextToken();
			if(!aux.equals("and")) 
				if(mult.containsKey(aux)) res = res + mult.get(aux) * (res % mult.get(aux)) - (res % mult.get(aux));
				else res = res + valores.get(aux);
		}
		return res;
	}
}
