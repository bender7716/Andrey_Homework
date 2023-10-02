package ru.furniture.entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Long id;
    private String nameOrder;
    private LocalDate startDateOrder;
    private LocalDate endDateOrder;
    private List<Baguette> baguetteList = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameOrder() {
        return nameOrder;
    }

    public void setNameOrder(String nameOrder) {
        this.nameOrder = nameOrder;
    }

    public LocalDate getStartDateOrder() {
        return startDateOrder;
    }

    public void setStartDateOrder(LocalDate startDateOrder) {
        this.startDateOrder = startDateOrder;
    }

    public LocalDate getEndDateOrder() {
        return endDateOrder;
    }

    public void setEndDateOrder(LocalDate endDateOrder) {
        this.endDateOrder = endDateOrder;
    }

    public List<Baguette> getBaguetteList() {
        return baguetteList;
    }

    public void setBaguetteList(List<Baguette> baguetteList) {
        this.baguetteList = baguetteList;
    }
}
