public class Main {
    public static void main(String[] args) {
        //sekundy na normalny czas
        Clock zegarSekundowy = new Clock(7654);
        System.out.println("(7654):" + zegarSekundowy.toString());

        //do przodu północ
        Clock poPolnoc = new Clock(23, 59, 58);
        System.out.println("zegar do przodu:");
        for (int i = 0; i < 3; i++) {
            System.out.println(poPolnoc.toString());
            poPolnoc.tick();
        }

        //cofanie północ
        Clock polnoc = new Clock(0, 0, 1);
        System.out.println("cofanie:");
        for (int i = 0; i < 3; i++) {
            System.out.println(polnoc.toString());
            polnoc.tickDown();
        }
    }
}