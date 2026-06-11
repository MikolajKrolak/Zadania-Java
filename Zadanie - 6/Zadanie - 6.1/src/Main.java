public class Main {
    public static void main(String[] args) {
        MovableRectangle rectangle = new MovableRectangle(0, 0, 4, 4, 2, 3);
        System.out.println(rectangle);
        System.out.println("--------------------------------------------------------------------------------------");
        rectangle.moveDown();
        System.out.println(rectangle);
        rectangle.moveRight();
        System.out.println(rectangle);
        rectangle.moveUp();
        System.out.println(rectangle);
        rectangle.moveLeft();
        System.out.println(rectangle);
    }
}