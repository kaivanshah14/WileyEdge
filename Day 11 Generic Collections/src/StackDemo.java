import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.Stack;

public class StackDemo {
	public static void main(String args[]) {
//		Stack<Integer> s = new Stack<>();
//		try {
//			s.pop();
//		}
//		catch(Exception e) {
//			System.out.println(e);
//		}
//		
//		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
//		System.out.println(pq.poll());
		
		Map<Integer, Map<String, String>> map1 = new HashMap<Integer, Map<String,String>>();
		HashMap<String, String> map2 = new HashMap<String, String>();
		HashMap<String, String> map3 = new HashMap<String, String>();
		map2.put("Father", "SRK");
		map1.put(1, map2);
		map2.put("Mother", "Kajol");
		map1.put(2, map2);
		map3.put("Father", "Salman");
		map3.put("Mother", "Kajol");
//		map2.remove("Father");
		map1.replace(1, map3);
//		map1.get(1).remove("Father");

//		System.out.println(map2);
		System.out.println("Map 1 print statement " + map1);
//		map2.put("Brother", "Sandipt");
//		System.out.println(map1);
		
	     //hasNext executes until next throws an exception
//		Iterator<Entry<Integer, Map<String, String>>> iter= map1.entrySet().iterator();
//	     while(iter.hasNext()) {
//	    	 System.out.println("Value inside iterator loop is | Print Statement 1 " + iter.next());
//	    	 iter= map1.entrySet().iterator();
//	    	 System.out.println("Value inside iterator loop is | Print Statement 2 " + iter.next());
//	     }
	}
}
