package org.example.documents;

import org.example.employee.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Vacations extends Document{
    private LocalDate startDate;
    private LocalDate endDate;

    public Vacations(String nameDocument, String employee, LocalDate dateCreation) {
        super(nameDocument, employee, dateCreation);
    }

    public void addVacations(){
        System.out.println("vacations add");

        System.out.println(getDateCreation());
    }
}
