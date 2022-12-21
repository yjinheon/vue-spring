package com.example.newvelog;

import com.example.newvelog.domain.Customer;
import com.example.newvelog.service.CustomerService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class NewvelogApplicationTests {


	@Test
	void contextLoads() {

	}
	@Autowired
	CustomerService customerService;

	@Test
	void testCustomer() {
		List<Customer> customers = customerService.getCustomerList();
		System.out.println(customers);
		//System.out.println(customers.get(0).getLast_name());

	}



}
