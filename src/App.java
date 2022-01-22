import java.util.Scanner;

public class Main {
        /* cw 1 enum-y */

        //  zad.1
        // a) Stworzyc prosty enum "LiczbyEnum" z liczbami od 1 do 6 zapisanymi slownie,

        enum LiczbyEnum {
            JEDEN,DWA,TRZY,CZTERY,PIEC,SZESC
        }

        // b) stworzyc prosty enum "StatusEnum" z wartosciami KONTYNUUJEMY i KONIEC,
        enum StatusEnum {
            KONTYNUUJEMY,KONIEC
        }
    public static void main(String[] args) {


        // c) stworzyc petle while z wartoscia true w warunku (nieskonczona petla),
        // d) niech w petli sa podawane wartosci liczbowe z klawiatury,
        // e) jesli uzytkownik poda z klawiatury 0 to program ma konczyc dzialanie,
        // f) umiescic w petli switch() case: ktore beda wypisywaly cyfry slownie odpowiednio
        // do podanych cyfr przez uzytkownika,
        // g) gdy uzytkownik wcisnie 0 ma wyswietlic sie status KONIEC w innym wypadku KONTYNUUJEMY :),
        Scanner scan = new Scanner(System.in);
        while(true){
            System.out.print("podaj liczbe: ");
            int myint = scan.nextInt();
            switch(myint) {
              case 0:
            System.out.println(StatusEnum.KONIEC.toString());
                return;
              case 1:
            System.out.println(LiczbyEnum.JEDEN.toString());
                break;
              case 2:
            System.out.println(LiczbyEnum.DWA.toString());
                break;
              case 3:
            System.out.println(LiczbyEnum.TRZY.toString());
                break;
              case 4:
            System.out.println(LiczbyEnum.CZTERY.toString());
                break;
              case 5:
            System.out.println(LiczbyEnum.PIEC.toString());
                break;
              case 6:
            System.out.println(LiczbyEnum.SZESC.toString());
                break;
              default:
                System.out.println("nie znam jeszcze tej cyfry");
            }
            System.out.println(StatusEnum.KONTYNUUJEMY.toString());


        }


        

        /* statusy i wybor ze switch case to najczestsze uzycia enumow, enumy sa czesto uzywane
        * w roznego rodzaju listach, selectach jako krotkie opcje wyboru np. jako status A, X (Aktualny, Usuniety) */

    }
}