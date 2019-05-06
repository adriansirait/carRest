package car.rest.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "req_start")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date req_start;

    @Column(name = "req_end")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date req_end;
    private String req_permission;
    private int req_status;
    private int car_id;
    private int customer_id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getCar_id() {
        return car_id;
    }

    public void setCar_id(int car_id) {
        this.car_id = car_id;
    }

    public int getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
}
