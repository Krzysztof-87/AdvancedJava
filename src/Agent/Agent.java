package Agent;
/*
Zadanie 2.
W nowym pakiecie stwórz klasę Agent, która ma posiadać dwa pola tekstowe: narodowosc oraz tajnyDokument, następnie:
wszystkie pola ustaw jako prywatne i twórz dla niech getter bądź setter jeśli uznasz, że jest to niezbędne aby program działał zgodnie z poleceniem,
nadpisz metodę String toString() tak, aby instrukcja drukująca obiekt: System.out.println(agent); wyświetlała:
 "Agent narodowości <narodowosc> z tajną wiadomością X znaków". Pod X podstaw ilość znaków pola tajnyDokument,
stwórz metodę String przekazTajnyDokument(String), przyjmującą narodowość pytającego - jeśli zgadza się z narodowością agenta,
 to agent ma przekazać tajny dokument, a jeśli się nie zgadza to pusty tekst,
w klasie AgentDemo przetestuj stworzony program tworząc dwóch agentów o różnych danych.


Zmodyfikuj klasę Agent, z poprzednich zadań tak, aby w polu tajnaWiadomosc przyjmowała obiekt klasy Walizka,
posiadający tablicę tajnych wiadomości. Przerób działanie programu tak, żeby agent do zwrócenia tajnej wiadomości musiał
 skorzystać z obiektu typu Walizka i z  metody String losujWiadomosc( ).
 */


import CarService.Car;

import java.util.ArrayList;
import java.util.Random;

public class Agent {

    private String agentNationality;
    private ArrayList<Case> secretMessage;

    public Agent(String agentNationality, ArrayList<Case> secretMessage) {
        this.agentNationality = agentNationality;
        this.secretMessage = secretMessage;
    }


    @Override
    public String toString() {
        return "Agent{" +
                "agentNationality='" + agentNationality + '\'' +
                ", secretMessage=" + secretMessage +
                '}';
    }

    private String chooseMessage(){
        Random random = new Random();
        int randomMessage=random.nextInt(secretMessage.size());
        Case aCase = secretMessage.get(randomMessage);
         return aCase.getSecretMessage();

    }


    public String getSecretDocument(String nationality){
        if (nationality.equalsIgnoreCase(agentNationality)){
            return chooseMessage();
        }
        return "";
     }

}
