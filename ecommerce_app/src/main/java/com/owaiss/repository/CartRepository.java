package com.owaiss.repository;

import com.owaiss.model.Cart;
import com.owaiss.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Integer> {



}
