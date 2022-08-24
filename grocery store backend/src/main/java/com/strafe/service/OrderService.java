package com.strafe.service;

import com.strafe.entity.OrderEntity;
import com.strafe.wraper.Delivered;
import com.strafe.wraper.Paid;

import java.util.List;

public interface OrderService {
    String addOrder(List<OrderEntity> orderList);

    String updatePaidStatus(Long id, Paid paid);

    String updateDeliveredStatus(Long id, Delivered delivered);

    List<OrderEntity> getAllOrders();

    List<OrderEntity> getOrdersByUserId(long id);


}
