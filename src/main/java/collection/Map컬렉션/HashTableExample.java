package collection.Map컬렉션;

import java.util.Hashtable;
import java.util.Scanner;

public class HashTableExample {
    public static void main(String[] args) {
        Hashtable<String,String> map = new Hashtable<>();
        map.put("홍길동1","123");
        map.put("홍길동2","123");
        map.put("홍길동3","123");
        map.put("홍길동4","123");

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("아이디와 비빌번호를 입력하시오");
            System.out.print("아아디:");
            String id = scanner.nextLine();

            System.out.print("비빌번호:");
            String pw = scanner.nextLine();

            if(map.containsKey(id)){
                if(map.get(id).equals(pw)){
                    System.out.println("로그인 되었습니다");
                    break;
                }
                else{
                    System.out.println("비빌번호가 일치하지 않습니다");
                }
            }else{
                System.out.println("입력하신 아이디가 존재하지 않습니다.");
            }

        }

    }
}
