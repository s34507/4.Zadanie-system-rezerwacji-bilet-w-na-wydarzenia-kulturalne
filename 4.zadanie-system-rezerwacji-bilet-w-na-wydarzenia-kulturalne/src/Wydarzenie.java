import javax.xml.namespace.QName;

public class Wydarzenie {
    // nazwa (String)
    // data (String)
    // miejsce (String)
    // maxLiczbaMiejsc (int), domyślnie 100
    // dostępneMiejsca (int), domyślnie 0
    // cena (double)
    //Zaimplementuj co najmniej 3 przeciążone konstruktory:
    // nazwa, cena
    // nazwa, cena, data
    // nazwa, cena, data, miejsce
    //Dodaj metody dostępowe (gettery i settery)

    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostępneMiejsca = 0;
    private double cena;

    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }
    public Wydarzenie(String nazwa, double cena, String data) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
    }
    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        if(nazwa==null){
            throw new NullPointerException("Brak nazwy");
        }
        this.nazwa = nazwa;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        if(data==null){
            throw new NullPointerException("Brak daty");
        }
        this.data = data;
    }

    public String getMiejsce() {
        return miejsce;
    }

    public void setMiejsce(String miejsce) {
        if(miejsce==null){
            throw new NullPointerException("Brak miejsca");
        }
        this.miejsce = miejsce;
    }

    public int getMaxLiczbaMiejsc() {
        return maxLiczbaMiejsc;
    }

    public void setMaxLiczbaMiejsc(int maxLiczbaMiejsc) {
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
    }

    public int getDostępneMiejsca() {
        return dostępneMiejsca;
    }

    public void setDostępneMiejsca(int dostępneMiejsca) {
        this.dostępneMiejsca = dostępneMiejsca;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    //Zaimplementuj metodę toString() zwracającą informacje o wydarzeniu
    //Dodaj metodę zarezerwujMiejsce(), która zmniejsza liczbę dostępnych miejsc o 1

    public String toString() {
        return nazwa;
    }

    public void zarezerwujMiejsce() {
        if(dostępneMiejsca > 0){
            dostępneMiejsca = dostępneMiejsca - 1;
        }
        this.dostępneMiejsca = dostępneMiejsca;
    }
}
