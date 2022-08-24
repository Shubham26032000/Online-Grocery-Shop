package com.strafe.service;

import com.strafe.entity.OrderEntity;
import com.strafe.repository.OrderRepository;
import com.strafe.wraper.Delivered;
import com.strafe.wraper.Paid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImp implements OrderService {

    @Autowired
    OrderRepository orderRepository;


    @Override
    public String addOrder(List<OrderEntity> orderList) {
        orderList.forEach((o1)->orderRepository.save(o1));
        return "Order Added Successfully!";
    }

    @Override
    public String updatePaidStatus(Long id, Paid paid) {
        OrderEntity orderEntity = orderRepository.findById(id).get();
        System.out.println(paid);
        orderEntity.setPaid(paid.isStatus());
        orderRepository.save(orderEntity);
        return "Paid status updated successfully!!";
    }

    @Override
    public String updateDeliveredStatus(Long id, Delivered delivered) {
        OrderEntity orderEntity =(OrderEntity) orderRepository.findById(id).get();
        orderEntity.setDelivered(delivered.isStatus());
        orderRepository.save(orderEntity);
        return "Delivery status updated !";
    }

    @Override
    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public List<OrderEntity> getOrdersByUserId(long id) {
        return orderRepository.findByUserId(id);
    }


}
