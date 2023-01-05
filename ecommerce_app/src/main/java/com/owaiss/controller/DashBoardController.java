package com.owaiss.controller;

import com.owaiss.model.Items;
import com.owaiss.model.UserModel;
import com.owaiss.model.Orders;
import com.owaiss.service.DashBoardService;
import com.owaiss.service.ItemsService;
import com.owaiss.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/dashboard")
@PreAuthorize("hasAnyRole('ROLE_ADMIN')")
public class DashBoardController {

    @Autowired
    private DashBoardService dashBoardService;
    @Autowired
    private ItemsService itemsService;
    @Autowired
    private OrderService orderService;

    /**
     *
     * -------------Items Starting-----------------
    **/

    // http://localhost:8888/dashboard/item/add
    @PostMapping("/item/add")//checked
    public ResponseEntity<Items> addItem(@Valid @RequestBody Items item) {

        return new ResponseEntity<>(dashBoardService.addNewItem(item) , HttpStatus.CREATED);
    }

    // http://localhost:8888/dashboard/items
    @GetMapping("/items")//checked
    public ResponseEntity<List<Items>> getAllItemsHandler() {

        return new ResponseEntity<>(itemsService.getAllItems() , HttpStatus.OK);
    }

    // http://localhost:8888/dashboard/item/update
    @PutMapping("/item/update")//checked
    public ResponseEntity<Items> updateItemHandler(@RequestBody Items item){

        return new ResponseEntity<>(dashBoardService.updateItem(item) ,HttpStatus.CREATED );
    }

    // http://localhost:8888/dashboard/item/delete/{id}
    @DeleteMapping("/item/delete/{id}")
    public ResponseEntity<Items> deleteItemHadler(@PathVariable("id") Integer id){

        return new ResponseEntity<>(dashBoardService.deleteItem(id) ,HttpStatus.CREATED );
    }

    /**
     * -------------Items Ending-----------------
     **/

    // http://localhost:8888/dashboard/daily-sales
    @GetMapping("/daily-sales")
    public ResponseEntity<List<Orders>> getTodaySales(){

        List<Orders> orders = dashBoardService.getTodaySales();
        return new ResponseEntity<>(orders , HttpStatus.OK);
    }

    // http://localhost:8888/dashboard/orders
    @GetMapping("/orders")
    public ResponseEntity<List<Orders>> getAllOrders(){

        List<Orders> orders = dashBoardService.getAllOrders();
        return new ResponseEntity<>(orders , HttpStatus.OK);
    }

    // http://localhost:8888/dashboard/order/{id}
    @GetMapping("/order/{id}")
    public ResponseEntity<Orders> getSingleOrderHandler(@PathVariable("id")Integer id) {

        return new ResponseEntity<>(orderService.getSingleOrder(id),  HttpStatus.OK);
    }

    // http://localhost:8888/dashboard/order/status/{id}/{status}
    @PutMapping("/order/status/{id}/{status}")
    public ResponseEntity<Orders> updateOrderStatus(@PathVariable("id") Integer id ,  @PathVariable("status") String status) {

        return new ResponseEntity<>(orderService.changeOrderStatus(id , status) , HttpStatus.CREATED);
    }

    // http://localhost:8888/dashboard/user/{id}
    @GetMapping("/user/{id}")
    public ResponseEntity<UserModel> getUserDetailsHandler(@PathVariable("id") Integer userId) {

        return new ResponseEntity<>(dashBoardService.getUserDetails(userId) , HttpStatus.OK);
    }

    // http://localhost:8888/dashboard/user/order/{id}
    @GetMapping("/user/order/{id}")
    public ResponseEntity<List<Orders>> getUserOrderDetailsHandler(@PathVariable("id") Integer userId){
        return new ResponseEntity<>(dashBoardService.getUserOrderDetails(userId), HttpStatus.OK);
    }

}
