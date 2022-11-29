package com.codeup.weywotspringblog.repositories;

import com.codeup.weywotspringblog.models.Customer;

public interface CustomerRepository {
    default void save(Customer customer) {

    }

    Customer findById(long customerId);
}
