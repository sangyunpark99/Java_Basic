import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class 변수와_자료형_4 {
    public static void main(String[] args) {
        // 1. 자료형 - 리스트
        System.out.println(" == 리스트 ==");
        ArrayList l1 = new ArrayList();

        // 1-1. add
        l1.add(1);
        l1.add("hello");
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add("world!");

        System.out.println("l1 = " + l1);
        
        l1.add(0,1); // index로 값 추가
        System.out.println("l1 = " + l1);

        // 1-2. get
        System.out.println("== get ==");
        System.out.println(l1.get(0));
        System.out.println(l1.get(3));

        // 1-3 size
        System.out.println("== size ==");
        System.out.println(l1.size());

        // 1-4 remove
        System.out.println("== remove ==");
        System.out.println(l1.remove(0)); // 지우는 값 return
        System.out.println("l1 = " + l1); // 맨 앞에 위치했던 1이 지워졌다.

        System.out.println(l1.remove(Integer.valueOf(2))); // 값이 존재하면 true 반환
        //ArrayList의 remove() 메서드는 인덱스를 인수로 받아 해당 인덱스의 요소를 제거하는 것과 다른 하나는 객체를 인수로 받아 그 객체와 동일한 첫번째 요소를 제거하는 것
        //Primitive type인 int를 remove()에 전달 할때, 자바는 이를 자동으로 Integer 객체로 박싱(Boxing)하지만, remove()메서드는 이를 인덱스로 해석한다.
        //따라서 정수 값을 실제 요소로 제거하려는 경우에는 Integer.valueOf()를 사용해서 Integer 객체를 명시적으로 제공해야 한다.
        System.out.println("l1 = " + l1);
        
        // 1-5 clear
        System.out.println("== clear ==");
        l1.clear();
        System.out.println("l1 = " + l1);

        // 1-6. sort
        System.out.println("== sort ==");
        ArrayList l2 = new ArrayList();
        l2.add(5);
        l2.add(3);
        l2.add(4);
        l2.sort(Comparator.naturalOrder()); // 오름 차순
        System.out.println("l2 = " + l2);
        l2.sort(Comparator.reverseOrder()); // 내림 차순
        System.out.println("l2 = " + l2);

        // 1-7 contains
        System.out.println("== contains ==");
        System.out.println(l2.contains(1));
        System.out.println(l2.contains(3));

        // 2. Maps
        System.out.println("== Maps ==");
        HashMap map = new HashMap();

        // 2-1. put - 서로의 순서는 중요하지 않다! 보장해주지 않는다.
        map.put("name","박상윤");
        map.put("가격",2000);
        map.put("망고",203000);
        System.out.println("map = " + map);

        //  2-2 get
        System.out.println(map.get("a")); // null 출력
        System.out.println(map.get("가격"));

        // 2-3 size
        System.out.println(map.size());

        // 2-4 remove
        System.out.println(map.remove("가격")); // key로 지운다.
        System.out.println(map.remove("B")); // null 값 출력

        // 2-5 containsKey - 키가 포함되었는지 알려준다.
        System.out.println(map.containsKey("name"));
        System.out.println(map.containsKey("가격")); // 이미 지웠기 때문에 null 발생

        // 3. Generics
        System.out.println("== Generics ==");
        ArrayList l3 = new ArrayList(); // 모든 자료형을 넣을 수 있다.
        l3.add(1);
        l3.add("hello");
        System.out.println("l3 = " + l3);

        ArrayList<String> l4 = new ArrayList<String>();
        // l4.add(2); 오류가 발생한다.
        l4.add("Hello"); // 문자열만 받을 수 있다.
        System.out.println("l4 = " + l4);


        HashMap map1 = new HashMap();
        map1.put(123,"id");
        map1.put("apple",123);
        System.out.println("map1 = " + map1);

        HashMap<String, Integer> map2 = new HashMap<>(); // new 다음엔 제너릭 생략해도됨
        // map2.put(123, "id"); - 에러 발생
        map2.put("apple", 10000);
        System.out.println("map2 = " + map2);
    }
}
