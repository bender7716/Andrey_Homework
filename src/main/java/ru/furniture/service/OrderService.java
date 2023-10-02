package ru.furniture.service;

import ru.furniture.entity.Order;

import java.util.List;

public interface OrderService {
    void create (Order order);
    Order update (Order order);
    void delete (Long id);
    List<Order> getAll();
}
