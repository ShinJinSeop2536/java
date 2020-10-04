package collection.Map컬렉션;

import java.util.HashMap;
import java.util.Map;

public class HsahMapExample2 {
    public static void main(String[] args) {
        Map<Student, Integer> map  = new HashMap<>();
        map.put(new Student(1,"홍길동"),95);
        map.put(new Student(1,"홍길동"),95);

        System.out.println("총 개수:"+map.size());
    }
}
