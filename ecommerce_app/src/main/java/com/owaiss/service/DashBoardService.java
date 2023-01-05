package com.owaiss.service;

import com.owaiss.model.Items;
import com.owaiss.model.Orders;
import com.owaiss.model.UserModel;

import java.time.LocalDate;
import java.util.List;

public interface DashBoardService {

    List<Orders> getTodaySales();

    List<Orders> getAllOrders();

    Items addNewItem(Items items);

    Items updateItem(Items items);

    Items deleteItem(Integer itemId);

    UserModel getUserDetails(Integer userId);

    List<Orders> getUserOrderDetails(Integer userId);

}
