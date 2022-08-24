package com.strafe.repository;

import com.strafe.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepostitory extends JpaRepository<ProductEntity,Long> {
}
