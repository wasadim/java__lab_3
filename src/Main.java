import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Punkt punktA = new Punkt(5);
        System.out.println(punktA.toString()); 
        punktA = new Punkt(1,2,3);
        System.out.println(punktA.toString()); 
        punktA.setX(3);
        punktA.setY(2);
        punktA.setZ(1);
        System.out.println(punktA.toString()); 

        
        System.out.println("wartość x jest równa " + punktA.getX()); 
        System.out.println("wartość y jest równa " + punktA.getY()); 
        System.out.println("wartość z jest równa " + punktA.getZ()); 

        System.out.println("suma = "  + punktA.suma());
        System.out.println("różnica = " +  punktA.roznica());
        System.out.println("roznica(10,5,2) = " +  punktA.roznica(10,5,2));

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

    }
}










// import java.util.ArrayList;
// import java.util.List;
// import java.util.Scanner;

// public class Main {
//         /* cw 2 klasy */
//         //  zad.1
//         //     a) Stworzyc publiczna klase Student z 2-ma polami String, 1 polem int i 1 polem boolean,
//         //     klasa ma sie znajdowac w osobnym pliku Student.java
//         //     b) stworzyc 3 objekty klasy student i wstawic je do tablicy
//         //     c) wyswietlic dane z tablicy, uzyc petli for lub forEach
//         //     d) dane powinny byc estetycznie przedstawione
//     public static void main(String[] args) {
        
//         Student[] studenci = new Student[3];
//         studenci[0] = new Student("Karol", "Frankowski");
//         studenci[1] = new Student("Piotr", "Kowalski");
//         studenci[2] = new Student("Andrzej", "Nowak");


//         for (Student student : studenci) {
//             student.print_name();
//         }
   
//     }
// }