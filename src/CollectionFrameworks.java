import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/**
 * Array
 * - ArrayList - 같은형태의 자료가 모여있는 데이터
 * HashSet
 * - HashMap - dict
 */
public class CollectionFrameworks {
    public void explainArray() {
        int[] intArray = new int[5];
        // double[] doubleArray = new double[5];

        intArray[0] = 5;
        System.out.println(intArray[0]); //1
        System.out.println(intArray[1]); //2
        System.out.println(intArray[2]); //3
        System.out.println(intArray[3]); //4
        System.out.println(intArray[4]); //5

        String[] strArray = new String[2];

        strArray[0] = "미국";
        strArray[1] = "캐나다";

        System.out.println(strArray[0]);
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

        // 중복을 허용하지 않는다
        System.out.println(hashSet.size());
        System.out.println(hashSet.contains("hello"));
        System.out.println(hashSet.contains("Gil"));
        // System.out.println(hashSet.get("marco"));

        ArrayList<String> arrayList = new ArrayList<String>(hashSet);
        System.out.println(arrayList.get(0));
    }
    public void explainHashMap() {
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("name", "Gil");
        System.out.println(hashMap.get("name"));
    }
}
