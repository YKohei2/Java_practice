package pactice;

import java.awt.print.Printable;
import java.io.ObjectInputStream.GetField;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Raizetech {
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		System.out.println(now);
		LocalDate mybirthday = LocalDate.of(1987, 5, 21);
		System.out.println(now.isBefore(mybirthday));
		
		
		String word = "local";
		String word2 = "official";
		System.out.println(word.equals(word2));
		
		List<String> nameList = new ArrayList();
		nameList.add("Kobayashi");
		nameList.add("Tanaka");
		nameList.add("Koyama");
		nameList.add("Yamashita");
		nameList.add("Konishi");
		for (String name : nameList) {
			if (name.startsWith("K")) {
			System.out.println(name.length());
		}
	}
		Map<String, Integer> salary = new HashMap<>();
		salary.put("Yamashita", 250000);
		salary.put("Tanaka", 500000);
		salary.put("Suzuki", 300000);
		//System.out.println(salary.get("Yamashita"));
		System.out.println(salary.get("Tanaka"));
 }
}
	
