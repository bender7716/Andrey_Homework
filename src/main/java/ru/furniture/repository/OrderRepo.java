package ru.furniture.repository;

import ru.furniture.entity.Order;

import java.util.List;

public interface OrderRepo {
    void create (Order order);
    Order update (Order order);
    void delete (Long id);
    List<Order> getAll();
}
