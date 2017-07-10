import java.util.HashSet;

/**
 * Created by Gil on 2017. 7. 5..
 */
public class test { public void toArray() {
    // 1. hash set을 하나 만든다. initialCapacity는 넣어줄 필요 없어요
    HashSet<Integer> hashSet = new HashSet<>();

    // 2. hashSet의 전체 갯수가 6일 때만 작동하는 while 문을 만든다
    // while (조건) ()안의 조건이 참이 아니면 작동하지 않는다
    while (hashSet.size() < 6) {
        // 3. while문 안에서 난수를 만들어서 hashSet 안에 집어넣는다
        int randomNum = 1 + (int) (Math.random() * ((24) + 1));
        hashSet.add(randomNum);
        // 4. hashSet 안의 값을 출력한다
    }
    System.out.println(hashSet);
}
}
}
