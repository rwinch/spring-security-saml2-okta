package okta;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityAutoConfiguration;
import org.springframework.boot.autoconfigure.security.SecurityFilterAutoConfiguration;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication(exclude= {SecurityAutoConfiguration.class,SecurityFilterAutoConfiguration.class})
@ImportResource("classpath:/security/securityContext.xml")
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);
    }
}
