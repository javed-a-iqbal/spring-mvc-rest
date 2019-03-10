package guru.springframwork.springmvcrest.repositories;

import guru.springframwork.springmvcrest.domain.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
