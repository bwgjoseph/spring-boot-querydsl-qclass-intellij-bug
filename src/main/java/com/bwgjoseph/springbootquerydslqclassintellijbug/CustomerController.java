package com.bwgjoseph.springbootquerydslqclassintellijbug;

import com.querydsl.core.types.Predicate;
import lombok.RequiredArgsConstructor;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerRepository customerRepository;

    @GetMapping
    public Iterable<Customer> findAll(@QuerydslPredicate(root = QCustomer.class) Predicate search) {
        QCustomer.customer.name.eq("demo");
        return this.customerRepository.findAll();
    }

}
