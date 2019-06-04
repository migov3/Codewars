package josephusPermutation;

import java.util.ArrayList;
import java.util.List;

public class Josephus {
	
	public static <T> List<T> josephusPermutation(final List<T> items, final int k) {
		ArrayList<T> lj = new ArrayList<T>();
		int ind = 0;
		while(!items.isEmpty()) {
			ind = ((ind+k)>=items.size()) ? ((ind+k-1) % items.size()) : ind+k-1;
			lj.add(items.remove(ind));
		}
		return lj;
	}
}