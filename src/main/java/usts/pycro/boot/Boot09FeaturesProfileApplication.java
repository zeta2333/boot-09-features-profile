package usts.pycro.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.util.Map;

@SpringBootApplication
public class Boot09FeaturesProfileApplication {

    // 配置文件启动顺序：外部的覆盖内部的（jar包内外），详细的覆盖粗略的（application-{profile}.yaml和application.yaml）
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(Boot09FeaturesProfileApplication.class, args);
        ConfigurableEnvironment environment = run.getEnvironment();
        Map<String, Object> systemEnvironment = environment.getSystemEnvironment();
        Map<String, Object> systemProperties = environment.getSystemProperties();
        System.out.println(systemEnvironment);
        System.out.println(systemProperties);
    }

}
