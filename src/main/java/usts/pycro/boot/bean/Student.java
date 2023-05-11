package usts.pycro.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Pycro
 * @version 1.0
 * 2023-05-11 4:29 PM
 */
@Profile("func")
@Component
@ConfigurationProperties("person")
public class Student implements Person{
    private String name;
    private Integer age;

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public Integer getAge() {
        return age;
    }
}
