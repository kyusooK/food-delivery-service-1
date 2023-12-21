package fooddeliveryt.domain;

import fooddeliveryt.domain.*;
import fooddeliveryt.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long orderId;
}
