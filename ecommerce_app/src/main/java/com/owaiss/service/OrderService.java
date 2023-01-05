package com.owaiss.service;

import com.owaiss.model.Orders;

import java.util.List;

public interface OrderService {

    Orders orderItemsFromCart(Integer addressId);

    List<Orders> getOrderDetail();

    String cancelOrder (Integer orderId);

    Orders getSingleOrder(Integer orderId);

    Orders changeOrderStatus(Integer orderId , String Status);

}
