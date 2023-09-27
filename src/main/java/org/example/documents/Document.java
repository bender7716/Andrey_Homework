package org.example.documents;

import org.example.employee.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Document {
    private String nameDocument;
    private String employee;
    private LocalDate dateCreation;

    public Document(String nameDocument, String employee, LocalDate dateCreation) {
        this.nameDocument = nameDocument;
        this.employee = employee;
        this.dateCreation = dateCreation;
    }

    public String getNameDocument() {
        return nameDocument;
    }

    public void setNameDocument(String nameDocument) {
        this.nameDocument = nameDocument;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }
}
