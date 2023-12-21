package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

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
