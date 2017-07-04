/**
 * access modifiers; public, protected, (default), private
 * getter, setter
 */
public class AccessModfiers {
    private int a;
    private int b;

    // constructor
    public  AccessModfiers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return  a + b;
    }
    // private 지정된 a의 갑을 알고 싶을 때 쓰는 매소드
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
