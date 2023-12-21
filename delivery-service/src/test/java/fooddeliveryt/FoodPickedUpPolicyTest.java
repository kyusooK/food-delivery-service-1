package untitled;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.stream.messaging.Processor;
import org.springframework.cloud.stream.test.binder.MessageCollector;
import org.springframework.context.ApplicationContext;
import org.springframework.messaging.Message;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.MimeTypeUtils;
import untitled.config.kafka.KafkaProcessor;
import untitled.domain.*;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class FoodPickedUpPolicyTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(
        EventTest.class
    );

    @Autowired
    private KafkaProcessor processor;

    @Autowired
    private MessageCollector messageCollector;

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    public DeliveryArrangedRepository repository;

    @Test
    @SuppressWarnings("unchecked")
    public void testDeliveryArranged() {
        DeliveryArranged entity = new DeliveryArranged();
        entity.setDeliveryId(12345L);
        entity.setOrderId(98765L);
        entity.setDeliveryAddress(
            new Address("Seoul", "State", "City", "Country", "Zipcode")
        );
        assertEquals(entity.getDeliveryId(), Long.valueOf(12345L));
        assertEquals(entity.getOrderId(), Long.valueOf(98765L));
        assertEquals(entity.getDeliveryAddress().getStreet(), "Seoul");
    }
}
