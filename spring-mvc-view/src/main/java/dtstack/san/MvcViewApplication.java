package dtstack.san;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description:
 * @author: 33
 * @time: 2019/10/30 20:28
 */

@SpringBootApplication
public class MvcViewApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(MvcViewApplication.class);
        application.run(args);
    }
}
