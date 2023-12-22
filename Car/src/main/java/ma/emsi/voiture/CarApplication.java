package ma.emsi.voiture;

import ma.emsi.voiture.entities.Car;
import ma.emsi.voiture.repositories.CarRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
public class CarApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarApplication.class, args);
    }

    @Bean
    public RestTemplate restTemplate() {
        RestTemplate rt = new RestTemplate();
        SimpleClientHttpRequestFactory requestFactory = new SimpleClientHttpRequestFactory();
        requestFactory.setConnectTimeout(5000);
        requestFactory.setReadTimeout(5000);
        rt.setRequestFactory(requestFactory);
        return rt;
    }
   /* @Bean
    CommandLineRunner initializeH2Database(CarRepository cr){

        return args -> {
            cr.save(new Car(Long.parseLong("4"),"BMW","X6","HG236LK",Long.parseLong("4")));
        };
    }*/
}
