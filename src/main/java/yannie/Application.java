package yannie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import yannie.controller.AstronautController;
import yannie.managers.AstronautManager;

@SpringBootApplication
@Import(value={AstronautController.class})
public class Application {

    public static AstronautManager astronautManager;

    public static void main(String[] args) {
        astronautManager = new AstronautManager();
        SpringApplication.run(Application.class, args);
    }
}
