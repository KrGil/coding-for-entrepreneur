import java.util.ArrayList;
import java.util.Arrays;

/**
 * for-loop
 * - original
 * - for-each
 * while
 */
public class ForLoop {
    public void explainForLoop() {

        // array
        String[] strings = {
                "hello", "this", "is", "Gil",
                "hello", "this", "is", "Gil",
                "hello", "this", "is", "Gil",
                "hello", "this", "is", "Gil",
                "hello", "this", "is", "Gil",
        };

        // System.out.println("hello");
        // System.out.println("this");
        // System.out.println("is");
        // System.out.println("Gil");

        // int i=0 index를 의미
        // i < strings.length index가 strings안의 길이(값들의 숫자)보다 작을때
        // index는 실제 보이는것 보다 항상 -1 이다.

        // ++operator
        // int testInt = 3;
        // testInt = testInt + 1;
        // testInt++;
        // System.out.println(testInt);

        // i++는 integer 변수에 +1을 해 주겠다는 의미
        // array는 []로 함수 접근 size 말고 length
        for(int i=0; i < strings.length; i ++ ) {
            System.out.println(strings[i]);
        }
    }
    public void explainForLoopWithArrayList() {
        String[] strings = {"hello", "this", "is", "Gil"};
        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(strings));
        arrayList.add("!");
        // arrayList에서는 size와 get()을 써서 함수로 접근
        for(int i=0; i < arrayList.size(); i++)  {
            // System.out.println(arrayList.get(i));
            System.out.println((i + 1) + ". " + arrayList.get(i));
        }
        // foreach = ArrayList에 직접 접근하지 않고 값을 불러옴
        for (String targetString: arrayList) {
            System.out.println(targetString);
        }
    }
    public void explainWhile() {
        int testInt = 0;
        // while (true) {
        // System.out.println(testInt);
        // testInt++;
        String[] strings = {"hello", "this", "is", "Gil"};

        while (testInt < strings.length) {
            System.out.println(strings[testInt]);
            testInt++;
        }
    }
}
