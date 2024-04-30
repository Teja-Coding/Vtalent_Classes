package ExamplesPrograms;

import java.util.ArrayList;
import java.util.HashMap;

public class Programs {
	public static void main(String[] args) {
		ArrayList al = new ArrayList<>();
		
		HashMap hm= new HashMap();
		
		al.add("manikanta");
		al.add("sri");
		al.add("teja");
		al.add("yuva");
		
		hm.put(1, al);
		
		System.out.println(hm.get(al));
		
		
		
	}
}
