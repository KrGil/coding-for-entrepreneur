import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;


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
//        Scanner numReader = new Scanner(System.in);
//        int num = numReader.nextInt();
        HashSet<Integer> hashSet = new HashSet<>();
        int[] lottoNumber = new int[25];
//        int randomNum;

        lottoNumber[0] =  (int) (Math.random() * ((24) + 1));
        lottoNumber[1] =  (int) (Math.random() * ((24) + 1));
        lottoNumber[2] =  (int) (Math.random() * ((24) + 1));
        lottoNumber[3] =  (int) (Math.random() * ((24) + 1));
        lottoNumber[4] =  (int) (Math.random() * ((24) + 1));
        lottoNumber[5] =  (int) (Math.random() * ((24) + 1));

        hashSet.add(lottoNumber[0]);
        hashSet.add(lottoNumber[1]);
        hashSet.add(lottoNumber[2]);
        hashSet.add(lottoNumber[3]);
        hashSet.add(lottoNumber[4]);
        hashSet.add(lottoNumber[5]);

        ArrayList<Integer> arrayList = new ArrayList<Integer>(hashSet);
        for(int i=0; i < 25; i ++ ) {
            for (int x = 0; x < i; x ++) {
                if (lottoNumber[x] == lottoNumber[i]) {
                    lottoNumber[0] =  (int) (Math.random() * ((24) + 1));
                    lottoNumber[1] =  (int) (Math.random() * ((24) + 1));
                    lottoNumber[2] =  (int) (Math.random() * ((24) + 1));
                    lottoNumber[3] =  (int) (Math.random() * ((24) + 1));
                    lottoNumber[4] =  (int) (Math.random() * ((24) + 1));
                    lottoNumber[5] =  (int) (Math.random() * ((24) + 1));
                }
            }
        }
//        for (int i = 0; i < hashSet.size(); i ++)
//            System.out.println(lottoNumber[i]);
        for (Integer targetInteger: arrayList) {
            System.out.println(targetInteger);
        }
    }
}
// int[] hashSet = new int[6];