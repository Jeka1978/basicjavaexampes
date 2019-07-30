package never_use_switch_with_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @author Evgeny Borisov
 */
@Service
public class DistributionService {

    @Autowired
    private Map<String,MessageSender> senderMap;


    public void deliver(Message message) {
        String type = message.getType();
        MessageSender messageSender = senderMap.get(type);
        if (messageSender == null) {
            throw new IllegalStateException(type + " not supported yet");
        }
        messageSender.send(message);
    }
}





