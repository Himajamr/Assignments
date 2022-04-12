package com.controllers.services;

import com.controllers.models.Order;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service("database")
public class DatabaseOrderServiceImpl implements OrderService{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Order> getOrders() {
        Session session= sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        List<Order> orderList=session.createQuery("from Order", Order.class).list();
        transaction.commit();
        session.close();
        return orderList;
    }

    @Override
    public Order getOrderById(int orderId) {
        Session session= sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Order order=session.get(Order.class, orderId);
        transaction.commit();
        session.close();
        return order;
    }

    @Override
    public int createOrder(Order order) {
        Session session= sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        Integer i=(Integer) session.save(order);
        transaction.commit();
        session.close();
        return i;
    }

    @Override
    public Order updateOrder(Order order) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.update(order);
        transaction.commit();
        session.close();
        return order;
    }

    @Override
    public Order deleteOrder(Order order) {
        Session session=sessionFactory.openSession();
        Transaction transaction=session.beginTransaction();
        session.delete(order);
        transaction.commit();
        session.close();
        return order;
    }
}
