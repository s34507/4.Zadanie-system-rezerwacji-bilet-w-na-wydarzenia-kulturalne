import java.util.ArrayList;

public class SystemRezerwacji {
    //Pola do przechowywania list wydarzeń i klientów

    private ArrayList<Klient> listaKlientów = new ArrayList<>();
    private ArrayList<Wydarzenie> listaWydarzeń = new ArrayList<>();

    //Metoda dodajWydarzenie w co najmniej dwóch przeciążonych wersjach
    //Metoda dodajKlienta w co najmniej dwóch przeciążonych wersjach
    //Metoda dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie)- dokonuje rezerwacjiwydarzenia dla klienta
    //Metoda znajdzWydarzenie(String nazwa)- zwraca referencję do wydarzenia o danej nazwie
    //Metoda znajdzKlienta(String nazwisko)- zwraca referencję do klienta o danym nazwisku
    //Metoda zmiezCeneWydarzenia(String nazwa, double nowaCena)- zmienia cenę wydarzeni

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        listaWydarzeń.add(wydarzenie);
    }
    public void dodajWydarzenie(Wydarzenie wydarzenie, int fromIndex) {
        listaWydarzeń.add(wydarzenie);
    }

    public void dodajKlienta(Klient klient) {
        listaKlientów.add(klient);
    }
    public void dodajKlienta(Klient klient, int fromIndex) {
        listaKlientów.add(klient);
    }

    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        klient.dodajRezerwację(wydarzenie);
        wydarzenie.zarezerwujMiejsce();
    }

    public Wydarzenie znajdźWydarzenie(String nazwa) {
        for(int i=0; i<listaWydarzeń.size(); i++) {
            Wydarzenie w = listaWydarzeń.get(i);
            if (w.equals(nazwa)) {
                System.out.println("Wydarzenie " + nazwa + " jest na liście wydarzeń.");
            }
        }
        return null;
    }

    public Klient znajdzKlienta(String nazwisko) {
        for(int i=0; i<listaKlientów.size(); i++) {
            Klient w = listaKlientów.get(i);
            if(w.equals(nazwisko)) {
                System.out.println("Nazwisko " + nazwisko + " jest na liście klientów.");
            }
        }
        return null;
    }

    public void zmiezCeneWydarzenia(String nazwa, double nowaCena) {

    }
}
