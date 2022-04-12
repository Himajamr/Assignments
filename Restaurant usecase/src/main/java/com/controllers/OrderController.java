package com.controllers;
import com.controllers.models.Order;
import com.controllers.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    @Qualifier("database")
    private OrderService orderService;

    public OrderController(){
    }

    @RequestMapping(value = "/getAllOrders",method = RequestMethod.GET)
    public List<Order> getOrders() {
        return orderService.getOrders();
    }

    @RequestMapping(value = "/getOrder/{id}", method = RequestMethod.GET)
    public Order getOrderById(@PathVariable("id") int orderId){
        return orderService.getOrderById(orderId);
    }

    @RequestMapping(value = "/createOrder", method = RequestMethod.POST)
    public String createOrder(@RequestBody Order order){
        if(orderService.createOrder(order)>0){
            return "order created!";
        }
        return "order not created!";
    }

    @RequestMapping(value = "/updateOrder", method = RequestMethod.PUT)
    public String updateOrder(@RequestBody Order order){
        orderService.updateOrder(order);
        return "order updated!";
    }

    @RequestMapping(value = "/deleteOrder", method = RequestMethod.DELETE)
    public String deleteOrder(@RequestBody Order order){
        orderService.deleteOrder(order);
        return "order deleted!";
    }
}
