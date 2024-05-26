package com.example.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.example.dao.Customer1;

@Component
//@ComponentScan("com.example.daoImpl")
public class CustomerDaoImpl {
@Autowired
CustomerRepository cr;
public CustomerDaoImpl() {
	
}
public void addCustomer1(Customer1  cum) {
	System.out.println(cr.save(cum));
}
public List <Customer1>displayAll() {
	List <Customer1> list=(List<Customer1>)cr.findAll();
	System.out.println(list);
	return list;
}
//public Object findAll() {
//	// TODO Auto-generated method stub
//	return List;
//}
}
