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

        // random 숫자를 뽑는다
        int lottoNumber = 1 + (int) (Math.random() * ((24) + 1));
        int lottoNumber1 =  1 + (int) (Math.random() * ((24) + 1));
        int lottoNumber2 =  1 + (int) (Math.random() * ((24) + 1));
        int lottoNumber3 =  1 + (int) (Math.random() * ((24) + 1));
        int lottoNumber4 =  1 + (int) (Math.random() * ((24) + 1));
        int lottoNumber5 =  1 + (int) (Math.random() * ((24) + 1));

        // hashSet에 넣는데 갯수가 6개가 될 때 종료한다
        HashSet<Integer> hashSet = new HashSet<>(6);
        hashSet.add(lottoNumber);
        hashSet.add(lottoNumber1);
        hashSet.add(lottoNumber2);
        hashSet.add(lottoNumber3);
        hashSet.add(lottoNumber4);
        hashSet.add(lottoNumber5);

        for(int i = 0; i < 6; i ++ ) {
        }
        
        // 출력한다
        ArrayList<Integer> arrayList = new ArrayList<>(hashSet);
        System.out.println(hashSet);
    }
}