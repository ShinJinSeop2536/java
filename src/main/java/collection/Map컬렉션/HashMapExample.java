package collection.Map컬렉션;

import java.io.IOError;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();

        map.put("신용권",85);
        map.put("홍길동",90);
        map.put("동장군",90);
        //홍길동 키가 같기 때문에 제일 마지막에 저장한 값으로 대치
        map.put("홍길동",95);
        System.out.println("총 개수:"+map.size());

        System.out.println("\t홍길동:"+map.get("홍길동"));
        System.out.println();

        Set<String> keySet =map.keySet();
        Iterator<String> iterator = keySet.iterator();
        while(iterator.hasNext()){
            String key = iterator.next();
            int value = map.get(key);
            System.out.println("\t"+key+":"+value);
        }

        map.remove("홍길동");
        System.out.println("총 개수:"+map.size());

        Set<Map.Entry<String,Integer>> entrySet = map.entrySet();
        Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
        while (entryIterator.hasNext()){
            Map.Entry<String, Integer> entry = entryIterator.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println("\t"+key+":"+value);
        }
        System.out.println();
        map.clear();
        System.out.println("총 개수:"+map.size());


    }
}
