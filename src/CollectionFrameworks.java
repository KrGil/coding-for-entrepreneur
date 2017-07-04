import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Array - 같은 타입의 여러 변수를 하나의 묶음으로 다루는 것을 "배열" 이라고 한다.
 * - ArrayList - 같은형태의 자료가 모여있는 데이터
 * HashSet
 * - HashMap - dict
 */
public class CollectionFrameworks {
    public void explainArray() {
        int[] intArray = new int[5];
        // double[] doubleArray = new double[5];
        // String[] strings = {};

        intArray[0] = 5;
        System.out.println(intArray[0]); //1
        System.out.println(intArray[1]); //2
        System.out.println(intArray[2]); //3
        System.out.println(intArray[3]); //4
        System.out.println(intArray[4]); //5

        String[] strings = {"미국", "캐나다"};

        for (String targetString: strings) {
            System.out.println(targetString);
        }

    }
    public void explainArrayList() {
        //<>안에  Integer를 넣을 시 정수만 들어갈 수 있다 안에 들어가는 범위를 지정해주는 역할
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList.size());
        System.out.println(arrayList.get(0));

//        ArrayList<String> arrayListStr = new ArrayList<>();
//        arrayListStr.add("dd");
//
//        System.out.println(arrayList.get(0));
    }
    public void explainHashSet() {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("hello");
        hashSet.add("hello");
        hashSet.add("hello");
        hashSet.add("bye");

        // 중복을 허용하지 않는다
        // System.out.println(hashSet.size());
        // System.out.println(hashSet.contains("hello"));
        // System.out.println(hashSet.contains("Gil"));
        // System.out.println(hashSet.get("marco"));

        ArrayList<String> arrayList = new ArrayList<String>(hashSet);
//        System.out.println(arrayList.get(i));
        for(int i=0; i < hashSet.size(); i ++ ) {
            System.out.println(arrayList.get(i));
        }
    }
    public void explainHashMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Gil");
        System.out.println(hashMap.get("name"));
    }
}
