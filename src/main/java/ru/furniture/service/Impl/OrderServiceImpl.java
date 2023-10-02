package ru.furniture.service.Impl;

import ru.furniture.entity.Baguette;
import ru.furniture.entity.Order;
import ru.furniture.repository.BaguetteRepo;
import ru.furniture.repository.Impl.BaguetteRepoImpl;
import ru.furniture.repository.Impl.OrderRepoImpl;
import ru.furniture.repository.OrderRepo;
import ru.furniture.service.OrderService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {
    private final OrderRepo orderRepo = new OrderRepoImpl();
    private final BaguetteRepo baguetteRepo = new BaguetteRepoImpl();

    @Override
    public void create(Order order) {
        orderRepo.create(order);
        for (Baguette baguette : order.getBaguetteList()) {
            baguetteRepo.create(baguette, order.getId());
        }
    }

    @Override
    public Order update(Order order) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Order> getAll() {
        return null;
    }
}
