public class Main {
    public static void main(String[] args) {
        ResizableCircle circle = new ResizableCircle(3.0);
        System.out.println(circle);
        circle.resize(200);
        System.out.println(circle);
    }
}