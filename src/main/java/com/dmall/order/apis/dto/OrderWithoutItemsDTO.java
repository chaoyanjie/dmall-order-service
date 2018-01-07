package com.dmall.order.apis.dto;

import com.dmall.order.domain.model.query.*;
import com.dmall.order.z.debug.spike.domain.model.Contact;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderWithoutItemsDTO {
    @JsonIgnore
    private Long id;

    private Contact customerContact;

    private String createdDate;

    private OrderStatus status;

    public String getOrderItems() {
        return orderItems;
    }

    private String orderItems;

    public Contact getCustomerContact() {
        return customerContact;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public OrderStatus getStatus() {
        return status;
    }



    public OrderWithoutItemsDTO(OrderBrief order) {
        this.id = order.getId();
        this.customerContact = order.getCustomerContact();
        this.createdDate = order.getCreatedDate().toString();
        this.status = order.getStatus();

    }

    public void setOrderItems(String orderItems) {
        this.orderItems = orderItems;
    }
}