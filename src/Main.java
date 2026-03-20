public class Main {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Wiedzmin", "Kamil Wit", 320, true);
        Ksiazka ksiazka2 = new Ksiazka("Lalka", "Boleslaw Prus", 680, true);
        Ksiazka ksiazka3 = new Ksiazka("Hobbit", "Julia Tolkien", 310, false);
        Ksiazka ksiazka4 = new Ksiazka("Potop", "Wiktoria Ziew", 540, true);


        ksiazka1.wypiszInfo();
        ksiazka2.wypiszInfo();
        ksiazka3.wypiszInfo();

        ksiazka1.wypozycz();
        ksiazka1.wypiszInfo();

        ksiazka1.zwroc();
        ksiazka1.wypiszInfo();

        ksiazka3.wypozycz();
        ksiazka3.zwroc();
        ksiazka3.wypiszInfo();

        //testy do zadania 2
        Czytelnik czytelnik1 = new Czytelnik("Kamil", "Kowalski", 101, 0);
        Czytelnik czytelnik2 = new Czytelnik("Julia", "Nowak", 102, 4);

        czytelnik1.wypiszDane();
        czytelnik2.wypiszDane();

        czytelnik1.zwiekszLiczbeWypozyczen();
        czytelnik1.wypiszDane();

        czytelnik2.zmniejszLiczbeWypozyczen();
        czytelnik2.wypiszDane();

        //testy do zadania 3

        Biblioteka biblioteka = new Biblioteka(10);

        biblioteka.dodajKsiazke(ksiazka1);
        biblioteka.dodajKsiazke(ksiazka2);
        biblioteka.dodajKsiazke(ksiazka3);
        biblioteka.dodajKsiazke(ksiazka4);

        biblioteka.wypiszDostepneKsiazki();

        Ksiazka znalezionaKsiazka = biblioteka.znajdzKsiazkePoTytule("Lalka");

        if (znalezionaKsiazka != null) {
            System.out.println("Znaleziono ksiazke:");
            znalezionaKsiazka.wypiszInfo();
        } else {
            System.out.println("Nie znaleziono ksiazki");
        }

        int liczbaDostepnych = biblioteka.policzDostepneKsiazki();
        System.out.println("Liczba dostepnych ksiazek: " + liczbaDostepnych);

        //testy do zadania 4
        System.out.println("=== Dostepne ksiazki na poczatku ===");
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("=== Wypozyczenie ksiazki ===");
        biblioteka.wypozyczKsiazke("Wiedzmin", czytelnik1);

        System.out.println("=== Dostepne ksiazki po wypozyczeniu ===");
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("=== Dane czytelnika po wypozyczeniu ===");
        czytelnik1.wypiszDane();

        System.out.println("=== Zwrot ksiazki ===");
        biblioteka.zwrocKsiazke("Wiedzmin", czytelnik1);

        System.out.println("=== Dostepne ksiazki po zwrocie ===");
        biblioteka.wypiszDostepneKsiazki();

        System.out.println("=== Dane czytelnika po zwrocie ===");
        czytelnik1.wypiszDane();

        System.out.println("=== Szukanie ksiazek po autorze ===");
        biblioteka.znajdzKsiazkiPoAutorze("Andrzej Sapkowski");

        System.out.println("=== Informacje o jednej ksiazce i liczniku wypozyczen ===");
        ksiazka1.wypiszInfo();

        System.out.println("=== Liczba dostepnych ksiazek ===");
        System.out.println(biblioteka.policzDostepneKsiazki());

    }
}