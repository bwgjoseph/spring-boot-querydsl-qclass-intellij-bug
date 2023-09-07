package com.bwgjoseph.springbootquerydslqclassintellijbug;

import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, String>, QuerydslPredicateExecutor<Customer> {
}
