public class MyRectangle {
    private MyPoint top_left;
    private MyPoint bottom_right;

    public MyRectangle(int x1, int y1, int x2, int y2){
        this.top_left = new MyPoint(x1, y1);
        this.bottom_right = new MyPoint(x2, y2);
    }

    public MyRectangle(MyPoint top_left, MyPoint bottom_right){
        this.top_left = top_left;
        this.bottom_right = bottom_right;
    }

    @Override
    public String toString(){
        return "MyRectangle[top_left=" + top_left + ", bottom_right=" + bottom_right + "]";
    }

    public int getWidth() {
        return Math.abs(bottom_right.getX() - top_left.getX());
    }

    public int getHeight() {
        return Math.abs(bottom_right.getY() - top_left.getY());
    }

    public double getPerimeter() {
        int width = getWidth();
        int height = getHeight();
        return 2 * width + 2 * height;
    }

    public double getArea() {
        return getWidth() * getHeight();
    }
}
