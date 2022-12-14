package com.strafe.repository;

import com.strafe.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity,Long> {
    List<OrderEntity> findByUserId(long id);

}
