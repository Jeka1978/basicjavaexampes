package real_spring_examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * @author Evgeny Borisov
 */
@Service
public class ImportantService {

    @Autowired
    private StamService stamService;


    @EventListener(ContextRefreshedEvent.class)
    public void doWork(){
        stamService.doStuff();
    }
}
