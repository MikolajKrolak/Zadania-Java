public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){
    }
    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY() {
        return new int[] {this.x, this.y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public double distance(int x, int y){
        double x2x1 = this.x - x;
        double y2y1 = this.y - y;

        return Math.sqrt(Math.pow(x2x1, 2) + Math.pow(y2y1, 2));
    }

    public double distance(MyPoint another) {
        double x2x1 = this.x - another.getX();
        double y2y1 = this.y - another.getY();

        return Math.sqrt(Math.pow(x2x1, 2) + Math.pow(y2y1, 2));
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }
}