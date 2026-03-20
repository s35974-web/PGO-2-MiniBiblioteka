public class Czytelnik {
    private String imie;
    private String nazwisko;
    private int numerKarty;
    private int liczbaWypozyczen;

    public Czytelnik(String imie, String nazwisko, int numerKarty, int liczbaWypozyczen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerKarty = numerKarty;
        this.liczbaWypozyczen = liczbaWypozyczen;
    }

    public void wypiszDane() {
        System.out.println("Imie: " + imie);
        System.out.println("Nazwisko: " + nazwisko);
        System.out.println("Numer karty: " + numerKarty);
        System.out.println("Liczba wypozyczen: " + liczbaWypozyczen);
        System.out.println();
    }

    public void zwiekszLiczbeWypozyczen() {
        liczbaWypozyczen++;
        System.out.println("Zwiekszono liczbe wypozyczen dla: " + imie + " " + nazwisko);
    }

    public void zmniejszLiczbeWypozyczen() {
        if (liczbaWypozyczen > 0) {
            liczbaWypozyczen--;
            System.out.println("Zmniejszono liczbe wypozyczen dla: " + imie + " " + nazwisko);
        } else {
            System.out.println("Liczba wypozyczen nie moze byc mniejsza niz zerogit");
        }
    }
}