package org.example;

import org.example.documents.Document;
import org.example.documents.Vacations;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Vacations vac = new Vacations("vacation", "Alex", LocalDate.parse("2023-09-27"));
        vac.addVacations();
    }
}