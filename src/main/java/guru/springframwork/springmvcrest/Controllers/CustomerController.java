package guru.springframwork.springmvcrest.Controllers;

import guru.springframwork.springmvcrest.domain.Customer;
import guru.springframwork.springmvcrest.services.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(CustomerController.BASEURL)
public class CustomerController {
    public static final String BASEURL="/api/v1/customers";
    private CustomerService customerService;
    public  CustomerController(CustomerService customerService){
        this.customerService=customerService;
    }
    @GetMapping
    List<Customer> getAllCustomer(){

        return customerService.findAllCustomers();
    }
    @GetMapping("/{id}")
    public Customer getCustomerById(@PathVariable long id){
        return customerService.findCustomerById(id).get();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }
}
