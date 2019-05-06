package car.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int req_id;

    @OneToOne
    @JoinColumn(name = "car_id")
    private Cars cars;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

    @Column(name = "req_start")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date req_start;

    @Column(name = "req_end")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date req_end;

    @Column(name = "req_permission")
    private String req_permission;

    @Column(name = "req_status")
    private int req_status;

    public Request(){ super(); }

    public int getId() {
        return req_id;
    }

    public void setId(int req_id) {
        this.req_id = req_id;
    }

    public Cars getCar_id() {
        return cars;
    }

    public void setCar_id(Cars car_id) {
        this.cars = cars;
    }

    public Customer getCust_id() {
        return customer;
    }

    public void setCust_id(Customer customer) {
        this.customer = customer;
    }

    public Date getReq_start() {
        return req_start;
    }

    public void setReq_start(Date req_start) {
        this.req_start = req_start;
    }

    public Date getReq_end() {
        return req_end;
    }

    public void setReq_end(Date req_end) {
        this.req_end = req_end;
    }

    public String getReq_permission() {
        return req_permission;
    }

    public void setReq_permission(String req_permission) {
        this.req_permission = req_permission;
    }

    public int getReq_status() {
        return req_status;
    }

    public void setReq_status(int req_status) {
        this.req_status = req_status;
    }
}
