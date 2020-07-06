package Exeptions;
/*
Wywołaj wyjątek NullPointerException i obsłuż go w main

Stwórz Scanner, poproś o podanie liczby. W sytuacji gdy wystąpi wyjątek wyświetl “Podano ... , nie można przekonwertować do typu int”

Bezpośrednio w ścieżce projektu stwórz plik “ksiazki.txt” w pliku tym wypisz conajmniej 3 tytuły książek dot.
 programowania które czytasz lub zamierzasz przeczytać. Napisz program który wyświetla wszystkie tytuły w tym
 pliku wykorzystując Scanner a w razie braku pliku wyświetla komunikat, że masz się zabrać za czytanie :)

 Zadanie dla osób które skończą - zrób program który zapisuje w tablicy Stringów imiona osób z grupy i losuje jedno z nich :D

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class First {



    public static void main(String[] args) {

        File file = new File("ksiazki.txt");

        try {
            Scanner sc = new Scanner(file);
            String text="";
            while (sc.hasNextLine()){
                text+=sc.nextLine()+'\n';
            }
            System.out.println(text);
        }catch (FileNotFoundException e) {
            System.out.println("blad");
        }
        System.out.println("koniec");



        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj Liczbe:");
        int number;
        try{
            number =scanner.nextInt();
            System.out.println(number);
        }catch(InputMismatchException e){
            System.out.println("Podales tekst ,ktory nie moze byc przekonwertowany do typu int");
        }


        String s = "abcd";

        print(null);

    }


    static void print(String x){
        try {
            System.out.println("First character: " + x.charAt(0));
        }
        catch(NullPointerException e) {
            System.out.println("NullPointerException");
        }
    }


}
