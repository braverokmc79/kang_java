package part3;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExam {
	
	public static void main(String[] args) {
		Map<String, String> map =new HashMap<>();
		map.put("001", "kim");
		map.put("002", "lee");
		map.put("003", "choi");
		
		map.put("001", "kang");
		
		System.out.println(map.size()); //3
		System.out.println(map.get("001")); //kang
		System.out.println(map.get("002")); //lee
		
		Set<String> keys=map.keySet();
		
		Iterator<String> iter=keys.iterator();
		while(iter.hasNext()){
			String key=iter.next();
			String value =map.get(key);
			System.out.println(key + " : "+ value);
			
//			001 : kang
//			002 : lee
//			003 : choi
		}
		
		
	}
}
