package real_spring_examples;

import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class Validator2 implements Validator {
    @Override
    public void validate(String name) {
        System.out.println("name was validated with 222222222");
    }
}
