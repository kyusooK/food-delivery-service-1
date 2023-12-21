package fooddeliveryt.domain;

import fooddeliveryt.domain.*;
import fooddeliveryt.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class CustomerSupportProvided extends AbstractEvent {

    private Long supportId;

    public CustomerSupportProvided(CustomerSupport aggregate) {
        super(aggregate);
    }

    public CustomerSupportProvided() {
        super();
    }
}
//>>> DDD / Domain Event
