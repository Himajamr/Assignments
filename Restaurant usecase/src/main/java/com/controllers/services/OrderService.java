package com.controllers.services;
import com.controllers.models.Order;

import java.util.List;

public interface OrderService {
    List<Order> getOrders();
    Order getOrderById(int orderId);
    int createOrder(Order order);
    Order updateOrder(Order order);
    Order deleteOrder(Order order);
}
