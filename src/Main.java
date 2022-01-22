import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
        /* cw 2 klasy */
        //  zad.1
        //     a) Stworzyc publiczna klase Student z 2-ma polami String, 1 polem int i 1 polem boolean,
        //     klasa ma sie znajdowac w osobnym pliku Student.java
        //     b) stworzyc 3 objekty klasy student i wstawic je do tablicy
        //     c) wyswietlic dane z tablicy, uzyc petli for lub forEach
        //     d) dane powinny byc estetycznie przedstawione
    public static void main(String[] args) {
        
        Student[] studenci = new Student[3];
        studenci[0] = new Student("Karol", "Frankowski");
        studenci[1] = new Student("Piotr", "Kowalski");
        studenci[2] = new Student("Andrzej", "Nowak");


        for (Student student : studenci) {
            student.print_name();
        }
   
    }
}