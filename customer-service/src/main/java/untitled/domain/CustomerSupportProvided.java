package untitled.domain;

import java.time.LocalDate;
import java.util.*;
import lombok.*;
import untitled.domain.*;
import untitled.infra.AbstractEvent;

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
