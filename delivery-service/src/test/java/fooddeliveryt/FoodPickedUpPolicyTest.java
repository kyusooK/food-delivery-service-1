package untitled;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
...
public class FoodPickedUpPolicyTest {
private static final Logger LOGGER = LoggerFactory.getLogger(EventTest.class);

@Test
public void testDeliveryArranged() {
DeliveryArranged entity = new DeliveryArranged();
// 비교 및 단언문 작성
assertEquals(expectedValue, actualValue);
assertTrue(statement);
}
}