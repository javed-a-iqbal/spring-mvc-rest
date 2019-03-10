package guru.springframwork.springmvcrest.domain;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;


    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public void SetLastName(String lastName) {
        this.lastName=lastName;
    }
}