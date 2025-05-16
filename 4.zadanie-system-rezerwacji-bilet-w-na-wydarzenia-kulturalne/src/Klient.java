import java.util.ArrayList;

public class Klient {
    //imię (String)
    //nazwisko (String)
    //email (String)
    //listaRezerwacji (ArrayList<Wydarzenie>)
    // Zaimplementuj co najmniej 2 przeciążone konstruktory
    // Dodaj metody dostępowe (gettery i settery)

    private String imię;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji = new ArrayList<>();

    public Klient (String imię, String nazwisko, String email) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.email = email;
    }
    public Klient (String nazwisko, String email) {
        this.nazwisko = nazwisko;
        this.email = email;
    }

    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
        if(imię==null){
            throw new NullPointerException("Brak imienia");
        }
        this.imię = imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        if(nazwisko==null){
            throw new NullPointerException("Brak nazwiska");
        }
        this.nazwisko = nazwisko;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if(email==null){
            throw new NullPointerException("Brak wartości dla e-mail");
        }
        this.email = email;
    }

    public ArrayList<Wydarzenie> getListaRezerwacji() {
        return listaRezerwacji;
    }

    public void setListaRezerwacji(ArrayList<Wydarzenie> listaRezerwacji) {
        this.listaRezerwacji = listaRezerwacji;
    }

    // Dodaj metodę dodajRezerwację(Wydarzenie wydarzenie), która dodaje wydarzenie do listy rezerwacji klienta
    // Dodaj metodę wyświetlRezerwacje() wypisującą wszystkie zarezerwowane wydarzenia
    // Dodaj metodę anulujRezerwację(Wydarzenie wydarzenie), która usuwa wydarzenie z listy rezerwacji klienta

    public void dodajRezerwację(Wydarzenie wydarzenie) {
        if(!listaRezerwacji.contains(wydarzenie)){
            listaRezerwacji.add(wydarzenie);
        }
    }

    public void wyświetlRezerwacje() {
        for (Wydarzenie wydarzenie : listaRezerwacji) {
            System.out.println(wydarzenie);
        }
    }

    public void anulujRezerwację(Wydarzenie wydarzenie) {
        listaRezerwacji.remove(wydarzenie);
    }
}
