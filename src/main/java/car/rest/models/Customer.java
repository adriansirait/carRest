package car.rest.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int customer_id;

    @Column(name = "cust_name")
    private String cust_name;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @OneToMany(mappedBy = "customer")
    private Set<Request> requests;

    public Customer () { }

    public Customer (String cust_name, String username, String password){
        this.cust_name = cust_name;
        this.username = username;
        this.password = password;
    }

    public int getId() {
        return customer_id;
    }

    public void setId(int customer_id) {
        this.customer_id = customer_id;
    }

    public String getCust_name() {
        return cust_name;
    }

    public void setCust_name(String cust_name) {
        this.cust_name = cust_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
