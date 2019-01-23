package com.shariqparwez.repository;

import java.util.List;

import com.shariqparwez.model.Customer;

public interface CustomerRepository {

	List<Customer> findAll();

}