package guru.springframwork.springmvcrest.bootstrap;

import guru.springframwork.springmvcrest.domain.Customer;
import guru.springframwork.springmvcrest.repositories.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {


    private final CustomerRepository customerRepository;

    public BootStrapData(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.print("loading customer data");

        Customer c1 = new Customer();
        c1.setFirstName("nicole");
        c1.SetLastName("nicole");
        customerRepository.save(c1);

        Customer c2 = new Customer();
        c2.setFirstName("nicole");
        c2.SetLastName("nicole");
        customerRepository.save(c2);

        Customer c3 = new Customer();
        c3.setFirstName("nicole");
        c3.SetLastName("nicole");
        customerRepository.save(c3);

        System.out.println("customers saved"+customerRepository.count());

    }
}
