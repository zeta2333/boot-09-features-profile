package usts.pycro.boot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import usts.pycro.boot.bean.Person;

/**
 * @author Pycro
 * @version 1.0
 * 2023-05-11 12:14 PM
 */
@RestController
public class HelloController {
    @Value("${person.name:李四}")
    private String name;

    @Autowired
    private Person person;

    @GetMapping("/")
    public String getInfo() {
        return person.getClass().toGenericString();
    }
}
