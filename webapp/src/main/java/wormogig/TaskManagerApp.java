package wormogig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan("wormogig.model")
@EnableJpaRepositories(value = {"wormogig.repo"})

public class TaskManagerApp {

    public static void main(String[] args) {
        SpringApplication.run(TaskManagerApp.class);
    }
}
