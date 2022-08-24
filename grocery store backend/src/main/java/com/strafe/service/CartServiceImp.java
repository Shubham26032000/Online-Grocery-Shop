package com.strafe.service;

import com.strafe.entity.CartEntity;
import com.strafe.repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartServiceImp implements CartService{

    @Autowired
    CartRepository repository;
    @Override
    public CartEntity addToCart(CartEntity cart) {
        repository.save(cart);
        return cart;
    }

    @Override
    public String deleteCart(long id) {
        repository.deleteById(id);
        return "Deleted Successfully";
    }

    @Override
    public CartEntity editCart(long id, CartEntity cart) {
        CartEntity cartEntity = repository.findById(id).get();
        cartEntity.setQuantity(cart.getQuantity());

        return repository.save(cartEntity);
    }

    @Override
    public List<CartEntity> getCartListByUserId(long userId) {
        return repository.findByUserId(userId);
    }

    @Override
    public String deleteCartByUserId(Long userId) {
        repository.deleteByUserId(userId);
         return "Deleted Successfully ";
    }
}
