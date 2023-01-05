package com.owaiss.service;

import com.owaiss.model.Cart;
import com.owaiss.model.Items;

public interface CartService {

    Cart addItemToCart( Integer id );

    Cart getCartInfo();

    Cart removeItemFromCart( Integer item );

    Double totalCartAmount();

    Cart increaseQuantity(Integer itemId);

    Cart decreaseQuantity(Integer itemId);

}
