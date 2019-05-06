package car.rest.controllers;

import car.rest.models.Cars;
import car.rest.models.Customer;
import car.rest.models.Request;
import car.rest.repository.CarRepository;
import car.rest.repository.CustomerRepository;
import car.rest.repository.RequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Calendar;
import java.util.List;
import java.util.Map;

@RestController
public class RequestController {

    @Autowired
    RequestRepository requestRepository;

    @GetMapping("/orders")
    public List<Request> index(){
        return requestRepository.findAll();
    }

    @PostMapping("/order")
    public Request create(@RequestBody Request request){
        Request createRequest = requestRepository.save(request);
        return createRequest;
    }

    @GetMapping("/order/approve/{req_id}")
    public Request approve(@PathVariable("req_id") int req_id) {
        Request request = requestRepository.findOne(req_id);
        request.setReq_status(1);
        requestRepository.save(request);
        return request;
    }

    @GetMapping("/order/reject/{req_id}")
    public Request reject(@PathVariable("req_id") int req_id) {
        Request request = requestRepository.findOne(req_id);
        request.setReq_status(2);
        requestRepository.save(request);
        return request;
    }
}
