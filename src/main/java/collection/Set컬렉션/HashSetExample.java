package collection.Set컬렉션;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        //동일한 객체는 한번만 저장됨
        set.add("Java");
        set.add("iBATIS");

        int size = set.size();
        System.out.println("총 개수:"+ size);

        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println("\t"+element);
        }
        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println("총 개수:"+set.size());

        iterator = set.iterator();
        while(iterator.hasNext()){
            String element = iterator.next();
            System.out.println("\t"+element);
        }
        set.clear();
        System.out.println("총 개수:"+set.size());

    }

}
