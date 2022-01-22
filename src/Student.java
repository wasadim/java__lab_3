/* zad.2
    a) Stworzyć klasę Student z polami prywatnymi
    - Osoba osoba,
    - WydzialEnum wydzial;
    b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
    c) stworzyc konstruktory, gettery i settery
    d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
    */
public class Student {
    Pomieszczenie osoba;
    WydzialEnum wydzial;

    public Student(){

    }
    public Student(Pomieszczenie osoba, WydzialEnum wydzial){
        this.osoba = osoba;
        this.wydzial = wydzial;
    }

    public void setOsoba(Pomieszczenie osoba){
        this.osoba = osoba;
    }
    public Pomieszczenie getOsoba(){
        return this.osoba;
    }
    public void setWydzial(WydzialEnum wydzial){
        this.wydzial = wydzial;
    }
    public WydzialEnum getWydzial(){
        return this.wydzial;
    }

    @Override
    public String toString() {
        String msg = "Student " + this.osoba.getImie() + " " + this.osoba.getNazwisko() + " o numerze indexu: " + this.osoba.getIndex() + " uczęszcza na wydział " + this.wydzial.toString();
        return msg;
    }
}