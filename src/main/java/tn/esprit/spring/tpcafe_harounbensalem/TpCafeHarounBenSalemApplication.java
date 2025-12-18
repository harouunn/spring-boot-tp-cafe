package tn.esprit.spring.tpcafe_harounbensalem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class TpCafeHarounBenSalemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpCafeHarounBenSalemApplication.class, args);
    }

}
