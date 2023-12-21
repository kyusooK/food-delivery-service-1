package fooddeliveryt.domain;

import fooddeliveryt.domain.*;
import fooddeliveryt.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class FoodPrepared extends AbstractEvent {

    private Long orderId;

    public FoodPrepared(Order aggregate) {
        super(aggregate);
    }

    public FoodPrepared() {
        super();
    }
}
//>>> DDD / Domain Event
