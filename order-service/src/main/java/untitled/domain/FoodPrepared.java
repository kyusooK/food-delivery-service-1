package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

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
