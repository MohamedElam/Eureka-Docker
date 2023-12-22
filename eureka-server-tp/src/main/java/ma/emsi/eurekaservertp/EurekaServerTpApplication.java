package ma.emsi.eurekaservertp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekaServerTpApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServerTpApplication.class, args);
    }

}
