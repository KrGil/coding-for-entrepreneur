/**
 * function(함수) & method(class 안에 있는 함수)
 * why?
 * parameter o / x
 * return value o / x
 */
public class Methods {
    // parameter x / return value x
    public void testMethodOne() {
        System.out.println("method one");
    }
    // parameter x / return values o
    public String  testMethodThree() {
        return "method Three";
    }
    // parameter o / return values x
    public void testMethodTwo(String str) {
        System.out.println("method " + str);
        // "method" + str;
    }
    // parameter o / return values o
    public int testMethodFour(int a, int b) {
        return a + b;
    }
}
