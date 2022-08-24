package com.strafe.service;

import com.strafe.entity.CartEntity;

import java.util.List;

public interface CartService {
    CartEntity addToCart(CartEntity cart);

    String deleteCart(long id);

    CartEntity editCart(long id, CartEntity cart);

    List<CartEntity> getCartListByUserId(long userId);

    String deleteCartByUserId(Long userId);
}
