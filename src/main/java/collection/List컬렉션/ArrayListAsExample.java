package collection.List컬렉션;

import java.util.Arrays;
import java.util.List;

public class ArrayListAsExample {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("홍길동", "신용권", "감자바");
        for(String str : list){
            System.out.println(str);
        }
        List<Integer> list2 = Arrays.asList(1,2,3);
        for(int num : list2){
            System.out.println(num);
        }
    }
}
