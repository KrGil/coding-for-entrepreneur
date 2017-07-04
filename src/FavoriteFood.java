/**
 * Created by Gil on 2017. 6. 29..
 */
public class FavoriteFood {
    // parameter x / return value o
    public String Caviar() {
        return "저는 맛은 기억 나지 않지만 캐비어를 좋아합니다.";
    }
    // parameter x / return value x
    public void Bulgogi() {
        System.out.println("저는 불고기를 좋아합니다");
    }
    // parameter o / return value x
    public void SomeFood(String string) {
        System.out.println(string);
    }
    // parameter o / return value o
    public String InputFoodName(String string) {
        return string;
    }
}
