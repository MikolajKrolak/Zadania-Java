import java.util.Scanner;

void main() {
    ArrayList<Student> listaStudentow = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    String tempString;
    int tempInt;
    double tempDouble;

    for (int i = 1; i <= 3; i++) {
        System.out.println("\n--- WPROWADZANIE DANYCH DLA STUDENTA NR " + i + " ---");
        Student student = new Student();

        //imie
        do {
            System.out.println("Imie:");
            tempString = scanner.nextLine();
            if (tempString.matches(".*\\d.*")) {
                System.out.println("Błąd! Imię nie może mieć cyfr.");
            }
        } while (tempString.matches(".*\\d.*"));
        student.setImie(tempString);

        //nazwisko
        do {
            System.out.println("Nazwisko:");
            tempString = scanner.nextLine();
            if (tempString.matches(".*\\d.*")) {
                System.out.println("Błąd! Nazwisko nie może mieć cyfr.");
            }
        } while (tempString.matches(".*\\d.*"));
        student.setNazwisko(tempString);

        //indeks
        System.out.println("Numer indeksu:");
        student.setNumerIndeksu(scanner.nextLine()); // Zostawiamy jak u Ciebie, bo wczytujesz jako String

        //obecność
        do {
            System.out.println("Obecność (0-100):");
            while (!scanner.hasNextDouble()) {
                System.out.println("To nie jest liczba!");
                scanner.next();
            }
            tempDouble = scanner.nextDouble();
        } while (tempDouble < 0 || tempDouble > 100);
        student.setObecnosc(tempDouble);
        scanner.nextLine(); // CZYSZCZENIE bufora po liczbie

        //ocena
        if (student.getOcena() != 2) {
            do {
                System.out.println("Ocena (2-5):");
                while (!scanner.hasNextInt()) {
                    System.out.println("To nie jest liczba!");
                    scanner.next();
                }
                tempInt = scanner.nextInt();
            } while (tempInt < 2 || tempInt > 5);
            student.setOcena(tempInt);
        } else {
            System.out.println("Ocena zablokowana na 2 (niska obecność).");
        }

        scanner.nextLine();
        listaStudentow.add(student);
    }

    for (Student s : listaStudentow) {
        System.out.println("STUDENT");
        System.out.println(s.getImie());
        System.out.println(s.getNazwisko());
        System.out.println(s.getNumerIndeksu());
        System.out.println(s.getObecnosc());
        System.out.println(s.getOcena());
    }
}