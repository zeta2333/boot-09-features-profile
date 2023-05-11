package usts.pycro.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * @author Pycro
 * @version 1.0
 * 2023-05-11 3:55 PM
 */
@Profile("test")
@Component
@ConfigurationProperties("person")
public class Worker implements Person{

    private String name;
    private Integer age;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Integer getAge() {
        return age;
    }
}
