package Exeptions;
/*

Przygotuj klasę FileDbConnection, w której umownie zasymulujemy połączenie z bazą danych. Wywołanie metody connect ma ustawiać stan bazy na połączony,
 jednak ma istnieć 25% szans na to że połączenie się nie powiedzie i zostanie rzucony Twój własny wyjątek FileDbConnectionException.

Stwórz również metodę umożliwiającą pobranie danych z bazy (jako działanie tej metody wykorzystaj wcześniej przygotowane
 czytanie pliku z książkami) wynik zwracaj jako String lub List<String> . Jeśli brakuje plików lub plik tekstowy jest
  pusty należy również rzucić wyjątek FileDbConnectionException z odpowiednią wiadomością.

Zaimplementuj również metodę “disconnect” zmieniający stan obiektu na nie połączony. Wywołaj tę metodę w bloku finally w main.

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileDbConnection {

    private boolean connected;

    public boolean isConnected() {
        return connected;
    }

    public void connect() throws FileDbConnectionException{
        if (Math.random() <= 0.25) {
            throw new FileDbConnectionException("Nie uzyskano połączenia z bazą");
        }
        connected = true;
    }

    public String getData() throws FileDbConnectionException{
        File file = new File("ksiazki.txt");
        try{
            Scanner sc = new Scanner(file);
            String text="";
            while (sc.hasNextLine()) {
                text += sc.nextLine() + '\n';
            }
            sc.close();
            return text;
        } catch (FileNotFoundException e) {
            throw new FileDbConnectionException("NIe istniejacy plik");

        }

        }

        public void disconnect() {
        connected=false;
        }


}
