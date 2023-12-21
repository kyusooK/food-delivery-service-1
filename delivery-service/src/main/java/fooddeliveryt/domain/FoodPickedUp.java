package fooddeliveryt.domain;

import fooddeliveryt.domain.*;
import fooddeliveryt.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FoodPickedUp extends AbstractEvent {

    private Long orderId;

    public FoodPickedUp(Delivery aggregate) {
        super(aggregate);
    }

    public FoodPickedUp() {
        super();
    }
}
//>>> DDD / Domain Event
