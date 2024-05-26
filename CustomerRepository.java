package com.example.daoImpl;

import org.springframework.data.repository.CrudRepository;

import com.example.dao.Customer1;

public interface CustomerRepository extends CrudRepository<Customer1 , Integer> {

}