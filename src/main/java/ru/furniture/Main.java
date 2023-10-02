package ru.furniture;


import ru.furniture.entity.Baguette;
import ru.furniture.entity.Order;
import ru.furniture.service.Impl.OrderServiceImpl;
import ru.furniture.service.OrderService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.setNameOrder("Кухня");
        order.setStartDateOrder(LocalDate.parse("2023-09-23"));
        order.setEndDateOrder(LocalDate.now());

        Baguette baguette1 = new Baguette();
        Baguette baguette2 = new Baguette();
        Baguette baguette3 = new Baguette();
        baguette1.setNameBaguette("baguette1");
        baguette2.setNameBaguette("baguette2");
        baguette3.setNameBaguette("baguette3");
        List<Baguette> baguetteList = new ArrayList<>();
        baguetteList.add(baguette1);
        baguetteList.add(baguette2);
        baguetteList.add(baguette3);

        order.setBaguetteList(baguetteList);

        OrderService p1 = new OrderServiceImpl();
        p1.create(order);
    }
}