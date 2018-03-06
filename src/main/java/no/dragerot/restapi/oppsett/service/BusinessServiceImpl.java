package no.dragerot.restapi.oppsett.service;

import no.dragerot.restapi.oppsett.entity.Customer;
import no.dragerot.restapi.oppsett.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class BusinessServiceImpl implements BusinessService {
    CustomerRepository customerRepository;

    @Autowired
    public BusinessServiceImpl(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }

    @Override

    public Customer createCustomer(String name) {
        return customerRepository.save(Customer.builder().name(name).build());
    }

    @Override
    public List<Customer> listCustomer() {
        return customerRepository.findAll();
    }
}
