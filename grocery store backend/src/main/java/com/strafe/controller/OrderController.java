package com.strafe.controller;

import com.strafe.entity.OrderEntity;
import com.strafe.service.OrderService;
import com.strafe.wraper.Delivered;
import com.strafe.wraper.Paid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/order/")
@CrossOrigin
public class OrderController {

    @Autowired
    OrderService orderService;

    @PostMapping("/")
    public String addOrder(@RequestBody List<OrderEntity> order)
    {
        return orderService.addOrder(order);
    }

    @GetMapping("/getAllOrders")
    public List<OrderEntity> getAllOrders()
    {
        return orderService.getAllOrders();
    }

    @GetMapping("/{userId}")
    public List<OrderEntity> getOrderById(@PathVariable("userId") long id)
    {
        return orderService.getOrdersByUserId(id);
    }
    @PutMapping("/paid/{id}")
    public String updatePaidStatus(@PathVariable("id") Long id, @RequestBody Paid paid)
    {
        return orderService.updatePaidStatus(id,paid);
    }

    @PutMapping("/delivery/{id}")
    public String updateDeliveryStatus(@PathVariable("id") Long id, @RequestBody Delivered delivered)
    {
        return orderService.updateDeliveredStatus(id,delivered);
    }


}
