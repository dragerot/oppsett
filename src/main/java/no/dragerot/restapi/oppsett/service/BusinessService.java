package no.dragerot.restapi.oppsett.service;

import no.dragerot.restapi.oppsett.entity.Customer;

import java.util.List;

public interface BusinessService {
    Customer createCustomer(String name);
    List<Customer> listCustomer();
}
