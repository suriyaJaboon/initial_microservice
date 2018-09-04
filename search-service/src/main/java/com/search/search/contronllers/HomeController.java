package com.search.search.contronllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.search.search.configurations.resttemplates.RestTpemplateService;
import org.springframework.web.client.RestTemplate;

@RequestMapping("/home")
@RestController
public class HomeController {

    private static final Logger log = LoggerFactory.getLogger(HomeController.class);
    private RestTemplate restTemplate;

    @Autowired
    public HomeController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/name")
    public Home home() {
        return new Home("Search-Service", (byte) 24, "Development");
    }

    @GetMapping("/index")
    public Home index() {
        log.info("Index");
        return restTemplate.getForObject(new RestTpemplateService().serviceQuery() + "/home", Home.class);
    }
}

class Home {
    private String name;
    private byte age;
    private String label;

    public Home() { }
    public Home(String name, byte age, String label) {
        this.name = name;
        this.age = age;
        this.label = label;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}