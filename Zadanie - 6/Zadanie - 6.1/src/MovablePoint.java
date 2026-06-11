public class MovablePoint implements Movable{
    private int x = 0;
    private int y = 0;
    private int xSpeed = 0;
    private int ySpeed = 0;

    public MovablePoint(int x, int y, int xSpeed, int ySpeed){
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString(){
        return "MovablePoint[x=" + x + ", y=" + y + "]";
    }

    @Override
    public void moveUp() {
        this.y = this.y - this.ySpeed;
    }

    @Override
    public void moveDown() {
        this.y = this.y + this.ySpeed;
    }

    @Override
    public void moveLeft() {
        this.x = this.x - this.xSpeed;
    }

    @Override
    public void moveRight() {
        this.x = this.x + this.xSpeed;
    }
}
