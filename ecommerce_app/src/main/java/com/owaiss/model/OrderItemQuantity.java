package com.owaiss.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class OrderItemQuantity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer Id;

    @ManyToOne
    private Items item;

    private Integer quantity;

    public OrderItemQuantity( Items item , Integer quantity ){

        this.item = item;
        this.quantity = quantity;

    }


}
