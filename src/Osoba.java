/* zad.1
    a) Stworzyć klasę Osoba z polami prywatnymi:
    - imie (String),
    - nazwisko (String),
    - indeks (Integer)
    b) stworzyc konstruktory, gettery i settery
    c) napisać metodę w klasie Osoba która zwróci informację o osobie,
    */
public class Osoba {

    private String imie;
    private String nazwisko;
    private int indeks;
    public Osoba() {
    }   
    public Osoba(String imie, String nazwisko, int indeks) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.indeks = indeks;
    }   
    public void setImie(String imie){
        this.imie = imie;
    }          
    public void setNazwisko(String nazwisko){
        this.nazwisko = nazwisko;
    }          
    public void setIndex(int indeks){
        this.indeks = indeks;
    }   
    public String getImie(){
        return this.imie;
    }          
    public String getNazwisko(){
        return this.nazwisko;
    }          
    public int getIndex(){
        return this.indeks;
    }   

    public String info(){
        String info = "ten student nazywa sie " + this.imie + " " + this.nazwisko +" a jest nr indexu to: " + this.indeks;
        return info;
    }
}
