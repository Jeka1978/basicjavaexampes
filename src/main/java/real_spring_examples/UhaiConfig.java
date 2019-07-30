package real_spring_examples;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Configuration
@ComponentScan(basePackages = "real_spring_examples")
@PropertySource("classpath:application.properties")
public class UhaiConfig {

}
