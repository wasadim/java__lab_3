
public class Student {
       String Imie;
       String Nazwisko;

       public Student(String imie, String nazwisko) {

        this.Imie = imie;
        this.Nazwisko = nazwisko;

    }    
    
    public void print_name() {
        System.out.print("ten student nazywa się "+ this.Imie + " " + this.Nazwisko + "\n");

    }
}