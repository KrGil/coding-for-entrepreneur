/**
 * Created by Gil on 2017. 7. 4..
 */
public class Score {
   public void Grade() {
       int a = 70;

       if (90 < a & a <= 100) {
           System.out.println("A");
       } else if (80 < a & a <= 90) {
           System.out.println("B");
       } else if (70 < a & a <= 80) {
           System.out.println("C");
       } else if (60 < a & a <= 70) {
           System.out.println("D");
       } else if (50 < a & a <= 60) {
           System.out.println("F");
       }
   }
}
