import java.util.ArrayList;
import java.util.HashSet;



/**
 * 구현 내용

 1부터 25까지 숫자 중에서 6개를 고르는 로또를 만들어봅시다.
 자바 랜덤 공식 : 최소값 + (int)(Math.random() * ((최소값 - 최대값) + 1))
 (int) (Math.random() * ((24) + 1)) 는 0에서 24까지의 자연수 중 임의의 숫자를 꺼내줍니다.
 힌트

 중복을 제거하기 위해서는 자료형 중 HashSet을 이용할 수 있습니다.
 HashSet은 toArray() 메소드를 통해서 Array로 만들 수 있습니다.

 */
public class Lotto {

    public void toArray() {
        // 1. hash set을 하나 만든다. initialCapacity는 넣어줄 필요 없어요
        HashSet<Integer> hashSet = new HashSet<>();

        // 2. hashSet의 전체 갯수가 6일 때만 작동하는 while 문을 만든다
        while (hashSet.size() == 6) {
            // 3. while문 안에서 난수를 만들어서 hashSet 안에 집어넣는다
            int randomNum = 1 + (int) (Math.random() * ((24) + 1));
            hashSet.add(randomNum);
            // 4. hashSet 안의 값을 출력한다
            System.out.println(hashSet.size());
        }
    }
}