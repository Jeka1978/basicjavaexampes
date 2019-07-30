package never_use_switch_with_spring;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

import static java.util.Arrays.asList;

/**
 * @author Evgeny Borisov
 */
@Component
public class MockMessageProducer {

    private Faker faker = new Faker();
    private List<String> types = asList("001", "002");
    private Random random = new Random();

    @Autowired
    private DistributionService distributionService;

    @Scheduled(fixedDelay = 500)
    public void sendMockMessage() {
        int i = random.nextInt(types.size());
        String text = faker.chuckNorris().fact();
        String type = types.get(i);

        Message message = Message.builder().text(text).type(type).build();
        distributionService.deliver(message);

    }
}



