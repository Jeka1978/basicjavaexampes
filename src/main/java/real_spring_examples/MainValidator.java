package real_spring_examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * @author Evgeny Borisov
 */
@Service
public class MainValidator {
    @Autowired
    private Set<Validator> validators;
}
