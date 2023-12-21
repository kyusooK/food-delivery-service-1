package untitled.domain;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import untitled.DeliveryServiceApplication;
import untitled.domain.DeliveryArranged;
import untitled.domain.FoodPickedUp;

@Entity
@Table(name = "Delivery_table")
@Data
//<<< DDD / Aggregate Root
public class Delivery {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long deliveryId;

    private Long orderId;

    private Address deliveryAddress;

    @PostPersist
    public void onPostPersist() {
        DeliveryArranged deliveryArranged = new DeliveryArranged(this);
        deliveryArranged.publishAfterCommit();

        FoodPickedUp foodPickedUp = new FoodPickedUp(this);
        foodPickedUp.publishAfterCommit();
    }

    @PrePersist
    public void onPrePersist() {}

    public static DeliveryRepository repository() {
        DeliveryRepository deliveryRepository = DeliveryServiceApplication.applicationContext.getBean(
            DeliveryRepository.class
        );
        return deliveryRepository;
    }
}
//>>> DDD / Aggregate Root
