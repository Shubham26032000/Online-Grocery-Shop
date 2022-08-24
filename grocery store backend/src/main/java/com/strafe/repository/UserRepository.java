package com.strafe.repository;

import com.strafe.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {
     UserEntity findByEmailAndPassword(String email, String password);
}
