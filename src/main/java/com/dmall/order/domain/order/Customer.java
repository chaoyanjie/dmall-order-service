package com.dmall.order.domain.order;


import com.dmall.order.domain.common.ValueObject;

import javax.persistence.Embeddable;

@Embeddable
public class Customer implements ValueObject<Customer> {
    private String name;
    private Address address;

    public Customer() {
    }

    public Customer(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    @Override
    public boolean sameValueAs(Customer other) {
        return other.name.equals(name)
                && other.address.sameValueAs(address);
    }
}
