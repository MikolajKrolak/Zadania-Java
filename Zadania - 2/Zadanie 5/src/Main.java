public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int c = scanner.nextInt();

    Numbers liczby = new Numbers(a, b ,c);

    System.out.println(liczby.sum());
    System.out.println(liczby.average());
    System.out.println(liczby.min());
    System.out.println(liczby.max());
    System.out.println(liczby.geometric());
}