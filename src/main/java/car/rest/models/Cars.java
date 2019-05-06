package car.rest.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String car_name;
    private String car_plate;
    private String car_image;
    private int car_status;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
