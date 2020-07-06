package Agent;

/*
Zmodyfikuj klasę Agent, z poprzednich zadań tak, aby w polu tajnaWiadomosc przyjmowała obiekt klasy Walizka,
posiadający tablicę tajnych wiadomości. Przerób działanie programu tak, żeby agent do zwrócenia tajnej wiadomości musiał
 skorzystać z obiektu typu Walizka i z  metody String losujWiadomosc( ).
 */

public class Case {

    private String secretMessage;

    public Case(String secretMessage) {
        this.secretMessage = secretMessage;
    }

    public String getSecretMessage() {
        return secretMessage;
    }

    @Override
    public String toString() {
        return "Case{" +
                "secretMessage='" + secretMessage + '\'' +
                '}';
    }
}
