public class Ksiazka {
    private String tytul;
    private String autor;
    private int liczbaStron;
    private boolean dostepna;

    private int liczbaWypozyczen;

    public Ksiazka(String tytul, String autor, int liczbaStron, boolean dostepna) {
        this.tytul = tytul;
        this.autor = autor;
        this.liczbaStron = liczbaStron;
        this.dostepna = dostepna;
        this.liczbaWypozyczen = 0;
    }

    public void wypiszInfo() {
        System.out.println("Tytul: " + tytul);
        System.out.println("Autor: " + autor);
        System.out.println("Liczba stron: " + liczbaStron);
        System.out.println("Dostepna: " + dostepna);
        System.out.println("Liczba wypozyczen: " + liczbaWypozyczen);
        System.out.println();
    }

    public void wypozycz() {
        if (dostepna) {
            dostepna = false;
            System.out.println("Ksiazka \"" + tytul + "\" zostala wypozyczona");
        } else {
            System.out.println("Ksiazka \"" + tytul + "\" nie jest dostepna");
        }
    }

    public void zwroc() {
        if (!dostepna) {
            dostepna = true;
            System.out.println("Ksiazka \"" + tytul + "\" zostala zwrocona");
        } else {
            System.out.println("Ksiazka \"" + tytul + "\" juz jest dostepna");
        }
    }

    //Do zadania 3
    public boolean czyDostepna() {
        return dostepna;
    }

    public boolean czyTytulJestTakiSam(String tytul) {
        return this.tytul.equals(tytul);
    }

    //Do zadania 4
    public String getTytul() {
        return tytul;
    }

    public String getAutor() {
        return autor;
    }

    public int getLiczbaWypozyczen() {
        return liczbaWypozyczen;
    }

    public void zwiekszLiczbeWypozyczenKsiazki() {
        liczbaWypozyczen++;
    }
}