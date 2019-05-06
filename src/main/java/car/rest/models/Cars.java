package car.rest.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int car_id;

    @Column(name = "car_name")
    private String car_name;

    @Column(name = "car_plate")
    private String car_plate;

    @Column(name = "car_image")
    private String car_image;

    @Column(name = "car_status")
    private int car_status;

    @OneToOne(mappedBy = "cars")
    private Request request;

    public int getId() {
        return car_id;
    }

    public void setId(int car_id) {
        this.car_id = car_id;
    }

    public String getCar_name() {
        return car_name;
    }

    public void setCar_name(String car_name) {
        this.car_name = car_name;
    }

    public String getCar_plate() {
        return car_plate;
    }

    public void setCar_plate(String car_plate) {
        this.car_plate = car_plate;
    }

    public String getCar_image() {
        return car_image;
    }

    public void setCar_image(String car_image) {
        this.car_image = car_image;
    }

    public int getCar_status() {
        return car_status;
    }

    public void setCar_status(int car_status) {
        this.car_status = car_status;
    }
}
