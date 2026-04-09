public class Numbers {
    private int a, b, c;

    public Numbers(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int sum(){
        return a + b + c;
    }
    public double average(){
        return sum() /3;
    }
    public int min(){
        if (a <= b && a <= c){
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
    public int max(){
        if (a >= b && a >= c){
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    public double geometric(){
        return Math.cbrt(a * b * c);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }
}
