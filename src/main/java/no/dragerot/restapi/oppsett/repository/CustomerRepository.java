package no.dragerot.restapi.oppsett.repository;

import no.dragerot.restapi.oppsett.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
