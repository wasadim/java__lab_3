
        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {

        ArrayList<Student> studenci = new ArrayList<Student>(); 
        studenci.add(new Student(new Osoba("Karol", "Frankowski", 666666), WydzialEnum.INFORMATYKA));
        studenci.add(new Student(new Osoba("Adam", "Kowalski", 666667), WydzialEnum.ADMINISTRACJA));
        studenci.add(new Student(new Osoba("Adam", "Kowalski", 666668), WydzialEnum.ZARZADZANIE));
        studenci.add(new Student(new Osoba("Adam", "Kowalski", 666669), WydzialEnum.MEDYCYNA));
        studenci.add(new Student(new Osoba("Adam", "Kowalski", 666670), WydzialEnum.INFORMATYKA));

        for (Student student : studenci) {
            System.out.println(student.toString());
        }
    }
}