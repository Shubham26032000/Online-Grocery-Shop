package com.strafe.repository;

import com.strafe.entity.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartRepository extends JpaRepository<CartEntity,Long> {
    List<CartEntity> findByUserId(Long userId);

    void  deleteByUserId(Long userId);
}
