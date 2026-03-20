public class Main {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Wiedzmin", "Kamil Wit", 320, true);
        Ksiazka ksiazka2 = new Ksiazka("Lalka", "Boleslaw Prus", 680, true);
        Ksiazka ksiazka3 = new Ksiazka("Hobbit", "Julia Tolkien", 310, false);

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
    }
}