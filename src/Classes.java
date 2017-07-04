/**
 * why?
 * constructor
 * inheritance
 */
public class Classes {
    int a = 1;
    int b = 2;

    public  Classes(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int sum() {
        return  a + b;
    }
    public int multiply() {
        return  a * b;
    }
}

class SubClasses extends Classes  {
    public SubClasses(int a, int b) {
        // super 위의 constructor를 그대로 가지고 오겠다.
        super(a, b);
    }

    @Override
    public int sum() {
        return a + b + 100;
    }
    public  int substract() {
        return a - b;
    }
    public  int divide() {
        return a / b;
    }
}