package no.dragerot.restapi.oppsett;

import no.dragerot.restapi.oppsett.entity.Customer;
import no.dragerot.restapi.oppsett.repository.CustomerRepository;
import no.dragerot.restapi.oppsett.service.BusinessService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.inject.Inject;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest()
@ActiveProfiles("test")
@DirtiesContext
public class CustomerServiceTest {

    @Inject
    private BusinessService businessService;

    @Test
    public void happySave_og_HentTest() {
        assertThat(businessService).isNotNull();
        businessService.createCustomer("A");
        businessService.createCustomer("B");
        businessService.createCustomer("C");

        List<Customer> customers =  businessService.listCustomer();
        assertThat(customers.size()).isEqualTo(3);
//        customers.forEach(
//                o -> System.out.println(String.format("%d %s %t")o.getIs(),o.getName(),o.getTimestamp())
//        );
    }
}
