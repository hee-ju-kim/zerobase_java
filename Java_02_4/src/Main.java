import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 리스트
		System.out.println("== 리스트 ==");
		ArrayList li = new ArrayList();
		
		// 1-1 add
		li.add(1);
		li.add("hello");
		li.add(2);
		li.add(3);
		li.add(4);
		li.add("world!");
		
		System.out.println("li = " + li);
		
		li.add(0, 1);
		System.out.println("li = " + li);
		
		// 1-2 get 
		System.out.println(li.get(0));
		System.out.println(li.get(3));
		
		// 1-3 size
		System.out.println(li.size());
		
		// 1-4 remove
		System.out.println(li.remove(0)); // 리스트의 0번 인덱스 값을 지
		System.out.println("li = " + li);
		
		System.out.println(li.remove(Integer.valueOf(2))); // 리스트의 2라는 값을 지움

		// 1-5 clear
		li.clear();
		System.out.println("li = " + li);
		
		// 1-6 sort
		ArrayList li2 = new ArrayList();
		li2.add(5);
		li2.add(3);
		li2.add(4);
		
		System.out.println("li2 " + li2);
		
		li2.sort(Comparator.naturalOrder()); // 오름차순 
		System.out.println("li2 " + li2);
		
		li2.sort(Comparator.reverseOrder()); // 내림차순 
		System.out.println("li2 " + li2);
		
		// 1-7 contains >> 파람값이 리스트에 있는지 확인
		System.out.println(li2.contains(1));
		System.out.println(li2.contains(3));
		
		// 2. Map >> 순서 보장 안됨 
		System.out.println("== Map ==");
		HashMap map = new HashMap();
		
		// 2-1 put
		map.put("kiwi", 9000);
		map.put("apple", 10000);
		map.put("mango", 12000);
		
		System.out.println("map " + map);
		
		// 2-2 get
		System.out.println(map.get("mandarine"));
		System.out.println(map.get("kiwi"));
		
		// 2-3 size
		System.out.println(map.size());
		
		// 2-4 remove
		System.out.println(map.remove("kiwi")); // 지운 값을 되돌려줌
		System.out.println(map.remove("mandarine")); // 없는 key라 null
		
		System.out.println("map " + map);
		
		// 2-5 containsKey
		System.out.println(map.containsKey("apple"));
		System.out.println(map.containsKey("kiwi"));
		
		// 3. Generics
		System.out.println("== Generics ==");
		ArrayList l3 = new ArrayList();
		l3.add(1);
		l3.add("hello");
		System.out.println("l3 = " + l3);
		
		ArrayList<String> l4 = new ArrayList<String>();
//		l4.add(1);
		l4.add("hello");
		System.out.println("l4 = " + l4);
		
		HashMap map1 = new HashMap();
		map1.put(123, "id");
		map1.put("apple", 10000);
		System.out.println("map1 = " + map1);
		
		
		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
//		map2.put(123, "id");
		map2.put("apple", 10000);
		System.out.println("map2 " + map2);
	}

}
