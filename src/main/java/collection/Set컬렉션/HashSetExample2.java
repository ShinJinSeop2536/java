package collection.Set컬렉션;


import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Member> set = new HashSet<>();
        Member m1 = new Member("홍길동",20);
        Member m2 = new Member("홍길동",20);

        set.add(m1);
        set.add(m2);
        System.out.println("총개수 :"+set.size());

    }
}
