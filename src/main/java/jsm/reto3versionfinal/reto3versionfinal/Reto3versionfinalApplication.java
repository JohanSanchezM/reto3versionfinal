package jsm.reto3versionfinal.reto3versionfinal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = {"jsm.reto3versionfinal.reto3versionfinal.Model"})
@SpringBootApplication
public class Reto3versionfinalApplication {

    public static void main(String[] args) {
        SpringApplication.run(Reto3versionfinalApplication.class, args);
    }

}

