package com.example.newvelog.service;
import com.example.newvelog.domain.Customer;
import com.example.newvelog.mapper.CustomerMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerService {

    private final CustomerMapper CustomerMapper;

    public List<Customer> getCustomerList() {
        return CustomerMapper.getCustomerList();
    }
}