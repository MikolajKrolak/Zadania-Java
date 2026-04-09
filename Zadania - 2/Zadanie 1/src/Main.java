public class Main {
    static void main() {

        for (int i = 0; i < 3; i++) {
            int randomNum = (int)(Math.random() * 4);
                int randomNum2 = (int)(Math.random() * 13);
                System.out.println(Card.values()[randomNum] + " " + Card.values()[randomNum].wartosc[randomNum2]);
        }

    }
}