package sonalake.calc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created with IntelliJ IDEA.
 * User: slawomir
 * Date: 4/28/17
 * Time: 11:39 PM
 * To change this template use File | Settings | File Templates.
 */
@SpringBootApplication
@ComponentScan("sonalake.calc")
@EnableJpaRepositories("sonalake.calc.repository")
@EntityScan("sonalake.calc.domain.model")
public class SonalakeCalculator {


    public static void main(String[] args) throws Exception {
        SpringApplication.run(SonalakeCalculator.class, args);
    }
}
