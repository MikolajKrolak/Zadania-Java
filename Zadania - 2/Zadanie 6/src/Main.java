public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);

    System.out.println("Numer produktu:");
    String product_number = scanner.nextLine();
    System.out.println("Opis produktu:");
    String prodcut_description = scanner.nextLine();
    System.out.println("Ilość:");
    int quantity = scanner.nextInt();
    System.out.println("Cena:");
    double pricePerItem = scanner.nextDouble();

    Invoice faktura = new Invoice(product_number, prodcut_description, quantity, pricePerItem);

    System.out.println(faktura.Amount());
}