package ma.emsi.client;

import ma.emsi.client.entity.Client;
import ma.emsi.client.repositories.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class ClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClientApplication.class, args);
    }

    @Bean
    CommandLineRunner initializeH2Database(ClientRepository cr){

        return args -> {
            cr.save(new Client(Long.parseLong("1"),"Amine SAFI",Float.parseFloat("23")));
            cr.save(new Client(Long.parseLong("2"),"Anas TOULOUN",Float.parseFloat("23")));
            cr.save(new Client(Long.parseLong("3"),"Imad AZIZI",Float.parseFloat("23")));

        };
    }

}
