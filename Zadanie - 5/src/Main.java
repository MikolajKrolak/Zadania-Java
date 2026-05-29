public class Main {
    public static void main(String[] args) {
        System.out.println("--------------MyPoint ------------");
        MyPoint p1 = new MyPoint(0, 0);
        MyPoint p2 = new MyPoint(3, 4);
        System.out.println("Punkt 1: " + p1);
        System.out.println("Punkt 2: " + p2);
        System.out.println("Odległość p1 do p2: " + p1.distance(p2));
        System.out.println("Odległość p2 do (0,0): " + p2.distance());
        System.out.println();

        System.out.println("---------------- MyCircle ------------------");
        //środek (0,0), promień 5
        MyCircle c1 = new MyCircle(p1, 5);
        System.out.println(c1);
        System.out.println("Pole koła: " + c1.getArea());
        System.out.println("Obwód koła: " + c1.getCircumference());
        System.out.println();

        System.out.println("------------------ MyTriangle ------------------");
        // różnoboczny
        MyTriangle t1 = new MyTriangle(0, 0, 3, 0, 0, 4);
        System.out.println(t1);
        System.out.println("Obwód trójkąta: " + t1.getPerimeter());
        System.out.println("Typ trójkąta: " + t1.getType());
        System.out.println();

        System.out.println("------------------ MyRectangle ----------------");
        //lewy gówrny (1,5), prawy dolny (5,1)
        //szerokość 4, wysokość 4
        //pole, obwód 16
        MyRectangle r1 = new MyRectangle(1, 5, 5, 1);
        System.out.println(r1);
        System.out.println("Pole prostokąta: " + r1.getArea());
        System.out.println("Obwód prostokąta: " + r1.getPerimeter());
        System.out.println();

        System.out.println("------------- TABLICA PUNKTÓW -------------");
        MyPoint[] points = new MyPoint[10];
        for (int i = 0; i < points.length; i++) {
            points[i] = new MyPoint(i + 1, i + 1);
        }
        for (MyPoint p : points) {
            System.out.print(p + " ");
        }
        System.out.println();
    }
}