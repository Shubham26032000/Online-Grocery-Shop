package com.strafe.service;

import com.strafe.entity.UserEntity;
import com.strafe.wraper.Login;

import java.util.List;

public interface UserService {
    UserEntity createUser(UserEntity user);
    UserEntity getUserByEmailAndPassword(Login login);
    UserEntity updateUser(Long id, UserEntity user);

    List<UserEntity> getAllUsers();
}