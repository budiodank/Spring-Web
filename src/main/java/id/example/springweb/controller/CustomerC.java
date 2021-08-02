package id.example.springweb.controller;

import id.example.springweb.entity.Customer;
import id.example.springweb.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomerC {
    @Autowired
    private CustomerRepository customerRepo;

    @GetMapping("/customers")
    public String listAll(ModelMap model) {
        List<Customer> listCustomers = customerRepo.findAll();
        model.put("listCustomers", listCustomers);

        return "customers";
    }

}

