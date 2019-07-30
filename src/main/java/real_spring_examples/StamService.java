package real_spring_examples;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Evgeny Borisov
 */
@Component
public class StamService {


//    @Value("${JAVA_HOME}")
    @Value("${user.name}")
    private String name;

    public StamService() {
        System.out.println("Stam service was created");
    }

    public void doStuff() {
        System.out.println("name = " + name);
        System.out.println("Stuff was done");
    }
}
